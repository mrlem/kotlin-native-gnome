package org.mrlem.gnome.glade.generator.kotlin

import com.squareup.kotlinpoet.*
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import java.io.File
import org.mrlem.gnome.glade.model.Widget
import org.mrlem.gnome.glade.parser.xml.Parser

/**
 * Glade widgets view binding generator: generates a class that:
 * - loads the widgets hierarchy from the XML file
 * - holds type-safe references to all named widgets
 */
class ViewBindingGenerator {

    private val types = mutableMapOf<String, ClassName>()

    /**
     * Generate a UI class for each glade file in the provided kotlin source set.
     *
     * @param sourceSet the source set to look for glade resources into.
     * @param generatedDir the directory to put generated files into.
     */
    fun generateGladeFiles(sourceSet: KotlinSourceSet, generatedDir: File) {
        generatedDir.deleteRecursively()
        sourceSet.gladeFiles
            .forEach { file -> generateViewBinding(file, generatedDir) }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Private
    ///////////////////////////////////////////////////////////////////////////

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

    /**
     * @param file the glade file
     * @param source the UI XML source text.
     * @param widgets the widgets to include accessors for.
     */
    private fun generate(file: File, source: String, widgets: List<Widget>): FileSpec {
        val uiClassName = file.uiClassName
        val builderClassName = ClassName(GTK_PACKAGE, "Builder")
        val reinterpretMemberName = MemberName(KOTLIN_CINTEROP_PACKAGE, "reinterpret")

        return FileSpec.builder("binding", uiClassName)
            .addImport(GTK_ADDITIONS_PACKAGE, "get")
            .addAnnotation(
                AnnotationSpec.builder(ClassName("", "Suppress"))
                    .addMember("%S", "RedundantVisibilityModifier")
                    .build()
            )
            .addType(
                TypeSpec.classBuilder(uiClassName)
                    .addKdoc("Generated wrapper providing easy access to [%T] instances.", ClassName(GTK_PACKAGE, "Widget"))
                    .addProperty(PropertySpec.builder("source", String::class)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer("%S", source)
                        .build()
                    )
                    .addProperty(PropertySpec.builder("builder", builderClassName)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer(
                            "%M.new().apply { %M(source) }",
                            MemberName(GTK_PACKAGE, "BuilderFactory"),
                            MemberName(GTK_ADDITIONS_PACKAGE, "addFrom")
                        )
                        .build()
                    )
                    .apply {
                        widgets.forEach { (id, className) ->
                            addProperty(PropertySpec.builder(id.snakeCaseToCamelCase.decapitalize(), className.classToClassName)
                                .delegate(
                                    CodeBlock.builder()
                                        .beginControlFlow("lazy")
                                        .addStatement("builder[%S].%M()", id, reinterpretMemberName)
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

    private val String.classToClassName: ClassName
        get() = types[this]
            ?: ClassName(GTK_PACKAGE, this.removePrefix("Gtk"))
                .also { types[this] = it }

    companion object {
        private const val GTK_PACKAGE = "org.gnome.gtk"
        private const val GTK_ADDITIONS_PACKAGE = "org.mrlem.gnome.gtk"
        private const val KOTLIN_CINTEROP_PACKAGE = "kotlinx.cinterop"
    }

}
