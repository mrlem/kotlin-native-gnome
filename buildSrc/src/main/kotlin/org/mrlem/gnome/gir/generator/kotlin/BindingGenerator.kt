package org.mrlem.gnome.gir.generator.kotlin

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gnome.gir.BindingGeneratorPlugin
import org.mrlem.gnome.gir.BindingGeneratorPlugin.Companion.GLIB_PACKAGE_NAME
import org.mrlem.gnome.gir.BindingGeneratorPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME
import org.mrlem.gnome.gir.model.ClassDefinition
import org.mrlem.gnome.gir.model.EnumDefinition
import org.mrlem.gnome.gir.model.MemberDefinition
import org.mrlem.gnome.gir.model.RecordDefinition
import org.mrlem.gnome.gir.model.TopLevelDefinition
import java.io.File

class BindingGenerator {

    fun generate(definitions: List<TopLevelDefinition>, destination: File, packageName: String) {
        definitions.forEach { definition ->
            when (definition) {
                is ClassDefinition -> createClassFileSpec(definition, packageName)
                is EnumDefinition -> createEnumFileSpec(definition, packageName)
                is RecordDefinition -> createRecordFileSpec(definition, packageName)
                else -> null
            }
                ?.run { writeTo(destination) }
        }
    }

    private fun createClassFileSpec(definition: ClassDefinition, packageName: String): FileSpec {
        val className = ClassName(packageName, definition.name)
        return FileSpec.builder(packageName, definition.name)
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
                        is MemberDefinition.Method -> addMethod(className, definition.cPrefix, memberDefinition)
                        is MemberDefinition.PropertyGetter, // transient
                        is MemberDefinition.PropertySetter, // transient
                        is MemberDefinition.Todo -> Unit    // already processed
                    }
                }
            }
            .build()
    }

    private fun createEnumFileSpec(definition: EnumDefinition, packageName: String): FileSpec {
        return FileSpec.builder(packageName, definition.name)
            // type
            .addTypeAlias(
                TypeAliasSpec.builder(
                    definition.name,
                    ClassName(GTK_CINTEROP_PACKAGE_NAME, definition.glibTypeName)
                )
                    .build()
            )
            .build()
    }

    private fun createRecordFileSpec(definition: RecordDefinition, packageName: String): FileSpec {
        return FileSpec.builder(packageName, definition.name)
            // type
            .addTypeAlias(
                TypeAliasSpec.builder(
                    definition.name,
                    ClassName(GTK_CINTEROP_PACKAGE_NAME, definition.glibTypeName)
                )
                    .build()
            )
            .build()
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
                            val gtkFunction = MemberName("gtk3", propertyDefinition.getterFunctionName)
                            if (toKType == null) {
                                addStatement("return %M(this)", gtkFunction)
                            } else {
                                addStatement("return %M(this).%M", gtkFunction, MemberName(GLIB_PACKAGE_NAME, toKType))
                            }
                        }
                        .build()
                )
                .apply {
                    propertyDefinition.setterFunctionName?.let { setterFunctionName ->
                        val toGType = propertyDefinition.type.toGTypeConverter
                        val gtkFunction = MemberName("gtk3", setterFunctionName)

                        mutable()
                        setter(
                            FunSpec.setterBuilder()
                                .addParameter("value", propertyDefinition.type.kType)
                                .apply {
                                    if (toGType == null) {
                                        addStatement("%M(this, value)", gtkFunction)
                                    } else {
                                        addStatement("%M(this, value.%M)", gtkFunction, MemberName(GLIB_PACKAGE_NAME, toGType))
                                    }
                                }
                                .build()
                        )
                    }
                }
                .build()
        )
    }

    private fun FileSpec.Builder.addMethod(className: ClassName, classPrefix: String, methodDefinition: MemberDefinition.Method) {
        if (methodDefinition.deprecated) return

        val name = methodDefinition.name.snakeCaseToCamelCase.decapitalize()
        val returnToKType = methodDefinition.returnType?.toKTypeConverter
        // TODO - handle params
        addFunction(
            FunSpec.builder(name)
                .receiver(className)
                .apply {
                    val returnType = methodDefinition.returnType ?: return@apply
                    returns(returnType.kType)
                }
                .apply {
                    val gtkFunction = MemberName("gtk3", methodDefinition.functionName)
                    when {
                        methodDefinition.returnType == null -> addStatement("%M(this)", gtkFunction)
                        returnToKType == null -> addStatement("return %M(this)", gtkFunction)
                        else -> addStatement("return %M(this).%M", gtkFunction, MemberName(GLIB_PACKAGE_NAME, returnToKType))
                    }
                }
                .build()
        )
    }

    private val String.snakeCaseToCamelCase
        get() = split('_', '-', '.').joinToString("", transform = String::capitalize)

}
