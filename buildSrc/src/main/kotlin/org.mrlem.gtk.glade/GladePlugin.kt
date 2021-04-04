package org.mrlem.gtk.glade

import com.squareup.kotlinpoet.*
import groovy.util.Node
import groovy.util.XmlParser
import java.io.File
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.BasePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

/**
 * Gradle plugin that generates a UI class for each glade XML file present in resources.
 * This UI class will:
 * - embed the XML in the app
 * - load it
 * - provide convenient widget accessors
 *
 * Note that the glade file needs to end in .glade.
 */
class GladePlugin : Plugin<Project> {
    private lateinit var sourceSetsWithGeneratedDir: Map<KotlinSourceSet, File>

    override fun apply(project: Project) {
        // task to run
        val generateTask = project.task("generateGladeUIClasses") {
            group = BasePlugin.BUILD_GROUP

            doLast {
                // for each glade file, create a UI class
                sourceSetsWithGeneratedDir.forEach { (sourceSet, generatedDir) ->
                    generatedDir.deleteRecursively()
                    sourceSet.listGladeFiles()
                        .takeIf { it.isNotEmpty() }
                        ?.forEach { file -> generateGladeUIClass(file, generatedDir) }
                }
            }
        }

        // project setup
        project.afterEvaluate {
            // task will run immediately before compiling the kotlin sources
            project.tasks
                .filter { it.name.startsWith("compileKotlin") }
                .forEach { it.dependsOn(generateTask) }

            // lookup kotlin source sets & create generated dirs
            val kotlinExtension = project.extensions.getByName("kotlin") as KotlinMultiplatformExtension
            sourceSetsWithGeneratedDir = kotlinExtension.sourceSets
                .map { it to createdGeneratedSrcDir(it, project.buildDir) }
                .toMap()
        }
    }

    /**
     * Create a generated sources dir for glade UI classes.
     *
     * @param sourceSet the source set to create a generated sources directory for.
     * @param buildDir the build dir to create the generated sources directory in.
     *
     * @return the resulting directory, added to the source set.
     */
    private fun createdGeneratedSrcDir(sourceSet: KotlinSourceSet, buildDir: File): File {
        val generatedDir = File(buildDir, "generated/glade/${sourceSet.name}")
        sourceSet.kotlin.srcDir(generatedDir)
        return generatedDir
    }

    /**
     * List all glade files in the source set.
     *
     * @return a list of all glade files.
     */
    private fun KotlinSourceSet.listGladeFiles(): List<File>{
        return resources.srcDirs
            .flatMap { dir ->
                dir?.listFiles { _, name -> name.endsWith(".glade") }
                    ?.asList()
                    .orEmpty()
            }
    }

    /**
     * Generate a UI class file for given glade file.
     *
     * @param sourceFile the glade file to create a UI class for.
     * @param destination destination directory fo generated class.
     */
    private fun generateGladeUIClass(sourceFile: File, destination: File) {
        println("generating UI for: $sourceFile")

        // parse widget types & ids
        val text = sourceFile.readText()
        val root = XmlParser().parseText(text)
        val widgets = root.findAllIdentifiedWidgets()

        // generate UI class
        createUIFileSpec(sourceFile.uiClassName, text, widgets)
            .run { writeTo(destination) }
    }

    /**
     * Create the UI class file spec.
     *
     * @param uiClassName the class name.
     * @param source the UI XML source text.
     * @param widgets the widgets to include accessors for.
     *
     * @return the resulting UI class file spec.
     */
    private fun createUIFileSpec(uiClassName: String, source: String, widgets: Map<String, ClassName>): FileSpec {
        val builderClassName = ClassName("org.mrlem.gtk", "Builder")
        return FileSpec.builder("binding", uiClassName)
            .addImport("org.mrlem.gtk", "get")
            .addAnnotation(
                AnnotationSpec.builder(ClassName("", "Suppress"))
                    .addMember("%S", "RedundantVisibilityModifier")
                    .build()
            )
            .addType(
                TypeSpec.classBuilder(uiClassName)
                    .addKdoc("Generated wrapper providing easy access to all used [%T] instances.", ClassName("org.mrlem.gtk", "Widget"))
                    .addProperty(PropertySpec.builder("source", String::class)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer("%S", source)
                        .build()
                    )
                    .addProperty(PropertySpec.builder("builder", builderClassName)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer("Builder().apply { %M(source) }", MemberName("org.mrlem.gtk", "addFrom"))
                        .build()
                    )
                    .apply {
                        widgets.forEach { (id, className) ->
                            val castMemberName = className.cast ?: return@forEach
                            addProperty(PropertySpec.builder(id.snakeCaseToCamelCase.decapitalize(), className)
                                .delegate(
                                    CodeBlock.builder()
                                        .beginControlFlow("lazy")
                                        .addStatement("builder[%S].%M", id, castMemberName)
                                        .endControlFlow()
                                        .build()
                                )
                                .build()
                            )
                        }
                    }
                    .build()
            )
            .build()
    }

    /**
     * Find all widgets in a node hierarchy.
     *
     * @param widgets the initial map of widget ids to class names.
     *
     * @return the resulting map of widget ids to class names.
     */
    private fun Node.findAllIdentifiedWidgets(widgets: MutableMap<String, ClassName> = mutableMapOf()): Map<String, ClassName> {
        // check this node
        val idValue = attribute("id")?.toString()?.takeUnless { it.isEmpty() }
        val classValue = attribute("class")?.toString()?.takeUnless { it.isEmpty() }
        if (idValue != null && classValue != null) {
            classValue.classToClassName?.let { widgets[idValue] = it }
        }

        // check children nodes
        children().forEach { node ->
            (node as? Node)?.findAllIdentifiedWidgets(widgets)
        }
        return widgets
    }
}
