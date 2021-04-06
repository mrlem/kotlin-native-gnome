package org.mrlem.gnome.gir.generator.kotlin

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gnome.gir.BindingGeneratorPlugin
import org.mrlem.gnome.gir.BindingGeneratorPlugin.Companion.GLIB_PACKAGE_NAME
import org.mrlem.gnome.gir.BindingGeneratorPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME
import org.mrlem.gnome.gir.model.ClassDefinition
import org.mrlem.gnome.gir.model.MemberDefinition
import org.mrlem.gnome.gir.parser.xml.Parser.Companion.GETTER_PREFIX
import org.mrlem.gnome.gir.parser.xml.Parser.Companion.SETTER_PREFIX
import java.io.File

class BindingGenerator {

    fun generate(definitions: List<ClassDefinition>, destination: File, packageName: String) {
        definitions.forEach { definition ->
            val className = ClassName(packageName, definition.name)
            FileSpec.builder(packageName, definition.name)
                // type
                .addTypeAlias(
                    TypeAliasSpec.builder(
                        definition.name,
                        ClassName("kotlinx.cinterop", "CPointer")
                            .plusParameter(ClassName(GTK_CINTEROP_PACKAGE_NAME, definition.cType))
                    )
                        .build()
                )
                // converters
                .apply {
                    definition.ancestors.forEach {
                        addConverter(packageName, definition.name, it)
                    }
                }
                // TODO - add constructors
                // TODO - add methods
                // TODO - add event handlers
                .apply {
                    // generate todos
                    val todoDefinitions = mutableListOf<MemberDefinition.Todo>()
                    definition.members
                        .filterIsInstance<MemberDefinition.Todo>()
                        .also { todoDefinitions.addAll(it) }
                        .map { it.name }
                        .takeUnless { it.isEmpty() }
                        ?.joinToString(prefix = "TODO - implement:\n  ", separator = "\n  ")
                        ?.let { addComment(it) }
                    definition.members.removeAll(todoDefinitions)
                }
                .apply {
                    definition.members.forEach { memberDefinition ->
                        when (memberDefinition) {
                            is MemberDefinition.Property -> addProperty(className, definition.cPrefix, memberDefinition)
                            is MemberDefinition.Constructor -> Unit // TODO
                            is MemberDefinition.EventHandler -> Unit // TODO
                            is MemberDefinition.Method -> Unit // TODO
                            is MemberDefinition.PropertyGetter, // transient
                            is MemberDefinition.PropertySetter, // transient
                            is MemberDefinition.Todo -> Unit    // already processed
                        }
                    }
                }
                .build()
                .run { writeTo(destination) }
        }
    }

    private fun FileSpec.Builder.addConverter(packageName: String, current: String, ancestor: String) {
        val ancestorParts = ancestor.split(".")
        val ancestorClassName = ancestorParts.last()
        val ancestorPackageName = ancestorParts.first()
            .takeIf { ancestorParts.size > 1 }
            ?.toLowerCase()
            ?.let { "${BindingGeneratorPlugin.GLIB_PACKAGE_NAME}.$it" }
            ?: packageName

        addProperty(
            PropertySpec.builder("as$ancestorClassName", ClassName(ancestorPackageName, ancestorClassName))
                .receiver(ClassName(packageName, current))
                .getter(
                    FunSpec.getterBuilder()
                        .addStatement("return %M()", MemberName("kotlinx.cinterop", "reinterpret"))
                        .build()
                )
                .build()
        )
    }

    private fun FileSpec.Builder.addProperty(className: ClassName, classPrefix: String, propertyDefinition: MemberDefinition.Property) {
        val name = propertyDefinition.name.snakeCaseToCamelCase.decapitalize()
        val toKType = propertyDefinition.type.toKTypeConverter
        addProperty(
            PropertySpec.builder(name, propertyDefinition.type.kType)
                .receiver(className)
                .getter(
                    FunSpec.getterBuilder()
                        .apply {
                            if (toKType == null) {
                                addStatement(
                                    "return %M(this)",
                                    MemberName("gtk3", "gtk_${classPrefix}_${GETTER_PREFIX}${propertyDefinition.name}")
                                )
                            } else {
                                addStatement(
                                    "return %M(this).%M",
                                    MemberName("gtk3", "gtk_${classPrefix}_${GETTER_PREFIX}${propertyDefinition.name}"),
                                    MemberName(GLIB_PACKAGE_NAME, toKType)
                                )
                            }
                        }
                        .build()
                )
                .apply {
                    if (!propertyDefinition.readOnly) {
                        val toGType = propertyDefinition.type.toGTypeConverter

                        mutable()
                        setter(
                            FunSpec.setterBuilder()
                                .addParameter("value", propertyDefinition.type.kType)
                                .apply {
                                    if (toGType == null) {
                                        addStatement(
                                            "%M(this, value)",
                                            MemberName("gtk3", "gtk_${classPrefix}_${SETTER_PREFIX}${propertyDefinition.name}")
                                        )
                                    } else {
                                        addStatement(
                                            "%M(this, value.%M)",
                                            MemberName("gtk3", "gtk_${classPrefix}_${SETTER_PREFIX}${propertyDefinition.name}"),
                                            MemberName(GLIB_PACKAGE_NAME, toGType)
                                        )
                                    }
                                }
                                .build()
                        )
                    }
                }
                .build()
        )
    }

    private val String.snakeCaseToCamelCase
        get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

}
