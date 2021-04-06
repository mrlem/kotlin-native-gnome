package org.mrlem.gnome.glade

import java.io.File
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.BasePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.mrlem.gnome.glade.generator.kotlin.ViewBindingGenerator
import org.mrlem.gnome.glade.parser.xml.Parser

/**
 * Gradle plugin that generates a UI class for each glade XML file present in resources.
 * This UI class will:
 * - embed the XML in the app executable
 * - load it
 * - provide convenient widget accessors
 *
 * Note that the glade file needs to end in .glade.
 */
class ViewBindingGeneratorPlugin : Plugin<Project> {
    private lateinit var sourceSetsWithGeneratedDir: Map<KotlinSourceSet, File>

    override fun apply(project: Project) {
        // task to run
        val generateTask = project.task("generateGladeViewBinding") {
            group = BasePlugin.BUILD_GROUP

            doLast {
                // for each glade file, create a UI class
                sourceSetsWithGeneratedDir.forEach { (sourceSet, generatedDir) ->
                    generatedDir.deleteRecursively()
                    sourceSet.listGladeFiles()
                        .forEach { file -> generateViewBinding(file, generatedDir) }
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
    private fun generateViewBinding(sourceFile: File, destination: File) {
        println("generating view binding for: ${sourceFile.name}")

        val sourceText = sourceFile.readText()
        val widgets = Parser().parse(sourceText)

        ViewBindingGenerator()
            .generate(sourceFile, sourceText, widgets)
            .run { writeTo(destination) }
    }
}
