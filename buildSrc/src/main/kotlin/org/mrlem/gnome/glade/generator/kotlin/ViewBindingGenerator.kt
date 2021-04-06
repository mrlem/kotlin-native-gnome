package org.mrlem.gnome.glade.generator.kotlin

import com.squareup.kotlinpoet.*
import org.mrlem.gnome.gir.BindingGeneratorPlugin.Companion.GTK_PACKAGE_NAME
import java.io.File
import org.mrlem.gnome.glade.model.Widget

/**
 * Glade widgets view binding generator: generates a class that:
 * - loads the widgets hierarchy from the XML file
 * - holds type-safe references to all named widgets
 */
class ViewBindingGenerator {

    private val types = mutableMapOf<String, ClassName>()

    /**
     * @param file the glade file
     * @param source the UI XML source text.
     * @param widgets the widgets to include accessors for.
     */
    fun generate(file: File, source: String, widgets: List<Widget>): FileSpec {
        val uiClassName = file.uiClassName
        val builderClassName = ClassName(GTK_PACKAGE_NAME, "Builder")
        val reinterpretMemberName = MemberName("kotlinx.cinterop", "reinterpret")

        return FileSpec.builder("binding", uiClassName)
            .addImport(GTK_PACKAGE_NAME, "get")
            .addAnnotation(
                AnnotationSpec.builder(ClassName("", "Suppress"))
                    .addMember("%S", "RedundantVisibilityModifier")
                    .build()
            )
            .addType(
                TypeSpec.classBuilder(uiClassName)
                    .addKdoc("Generated wrapper providing easy access to [%T] instances.", ClassName(GTK_PACKAGE_NAME, "Widget"))
                    .addProperty(PropertySpec.builder("source", String::class)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer("%S", source)
                        .build()
                    )
                    .addProperty(PropertySpec.builder("builder", builderClassName)
                        .addModifiers(KModifier.PRIVATE)
                        .initializer("Builder().apply { %M(source) }", MemberName(GTK_PACKAGE_NAME, "addFrom"))
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

    private val String.snakeCaseToCamelCase
        get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

    private val File.uiClassName
        get() = "${nameWithoutExtension.snakeCaseToCamelCase}UI"

    private val String.classToClassName: ClassName
        get() = types[this]
            ?: ClassName(GTK_PACKAGE_NAME, this.removePrefix("Gtk"))
                .also { types[this] = it }
}
