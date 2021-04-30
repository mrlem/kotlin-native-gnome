package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.*
import org.gnome.gir.KOTLIN_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.snakeCaseToCamelCase
import org.gnome.gir.generator.kotlin.generators.ext.typeInfo
import org.gnome.gir.model.FieldDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.model.types.AnyType
import org.gnome.gir.resolver.Resolver

fun FileSpec.Builder.addField(className: ClassName, field: FieldDefinition, resolver: Resolver) {
    if (field.private) return
    if (field.name == "priv") return
    if (field.name.startsWith("_")) return

    val type = field.anyTypeOrCallback as? AnyType
    val typeInfo = type?.typeInfo(resolver)
    if (typeInfo == null) {
        addComment("TODO - field: ${field.name}\n")
        return
    }

    when {
        // duplicated with method
        (className.simpleName == "FilterInputStream" && field.name == "base_stream") ||
        (className.simpleName == "FilterOutputStream" && field.name == "base_stream") ||
        (className.simpleName == "ParamSpec" && field.name == "name") ||
        // just an alias of GObject with  common field
        (className.simpleName == "InitiallyUnowned") ||
        // FIXME - record are not read correctly (only name attr is recognized: parser bug?)
        (className.simpleName == "ParamSpecEnum" && field.name == "enum_class") ||
        // FIXME - investigate
        ((type as? TypeDefinition)?.name == "GObject.ParamFlags") ||
        ((type as? TypeDefinition)?.name == "GObject.FlagsClass") ||
        ((type as? TypeDefinition)?.name == "GObject.TypeInstance") ||
        // FIXME - hard to guess what is a CPointer and what is a CPointed
        (className.simpleName == "ParamSpecValueArray" && field.name == "element_spec") ||
        (className.simpleName == "ParamSpecOverride" && field.name == "overridden") ||
        // FIXME - does not exist
        (className.simpleName == "SettingsBackend" && field.name == "parent_instance") ->
            return
    }

    val (converterTemplate, converterMembers) = if (resolver.isCPointer(type)) {
        ".%M" to arrayOf(MemberName(KOTLIN_CINTEROP_PACKAGE, "ptr"))
    } else {
        typeInfo.toKType
    }

    addProperty(
        PropertySpec.builder(field.name.snakeCaseToCamelCase.decapitalize(), typeInfo.kType.copy(nullable = false))
            .receiver(className)
            .getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        "return %M.%M$converterTemplate",
                        MemberName(KOTLIN_CINTEROP_PACKAGE, "pointed"),
                        MemberName("", field.name),
                        *converterMembers
                    )
                    .build()
            )
            .apply {
                if (field.writable) {
                    mutable()

                    setter(
                        FunSpec.setterBuilder()
                            .addParameter("value", typeInfo.kType)
                            .addStatement(
                                "${field.name} = value"
                            )
                            .build()
                    )
                }
            }
            .build()
    )
}
