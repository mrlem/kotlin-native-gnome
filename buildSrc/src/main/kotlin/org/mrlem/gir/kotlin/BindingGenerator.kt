package org.mrlem.gir.kotlin

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gir.GirPlugin
import org.mrlem.gir.GirPlugin.Companion.GLIB_PACKAGE_NAME
import org.mrlem.gir.GirPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME
import org.mrlem.gir.xml.ClassDefinition
import org.mrlem.gir.xml.MemberDefinition
import org.mrlem.gir.xml.Parser.Companion.GETTER_PREFIX
import org.mrlem.gir.xml.Parser.Companion.SETTER_PREFIX
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
            ?.let { "${GirPlugin.GLIB_PACKAGE_NAME}.$it" }
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
        val toK = propertyDefinition.type.toK
        addProperty(
            PropertySpec.builder(name, propertyDefinition.type.asPropertyTypeName)
                .receiver(className)
                .getter(
                    FunSpec.getterBuilder()
                        .apply {
                            if (toK.isEmpty()) {
                                addStatement(
                                    "return %M(this)",
                                    MemberName("gtk3", "gtk_${classPrefix}_${GETTER_PREFIX}${propertyDefinition.name}")
                                )
                            } else {
                                addStatement(
                                    "return %M(this).%M",
                                    MemberName("gtk3", "gtk_${classPrefix}_${GETTER_PREFIX}${propertyDefinition.name}"),
                                    MemberName(GLIB_PACKAGE_NAME, toK)
                                )
                            }
                        }
                        .build()
                )
                .apply {
                    if (!propertyDefinition.readOnly) {
                        val fromK = propertyDefinition.type.fromK

                        mutable()
                        setter(
                            FunSpec.setterBuilder()
                                .addParameter("value", propertyDefinition.type)
                                .apply {
                                    if (fromK.isEmpty()) {
                                        addStatement(
                                            "%M(this, value)",
                                            MemberName("gtk3", "gtk_${classPrefix}_${SETTER_PREFIX}${propertyDefinition.name}")
                                        )
                                    } else {
                                        addStatement(
                                            "%M(this, value.%M)",
                                            MemberName("gtk3", "gtk_${classPrefix}_${SETTER_PREFIX}${propertyDefinition.name}"),
                                            MemberName(GLIB_PACKAGE_NAME, fromK)
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
