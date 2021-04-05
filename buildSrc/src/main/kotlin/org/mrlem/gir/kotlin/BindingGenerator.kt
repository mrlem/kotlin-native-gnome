package org.mrlem.gir.kotlin

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gir.GirPlugin
import org.mrlem.gir.GirPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME
import org.mrlem.gir.xml.ClassDefinition
import org.mrlem.gir.xml.MemberDefinition
import java.io.File

class BindingGenerator {

    fun generate(definitions: List<ClassDefinition>, destination: File, packageName: String) {
        definitions.forEach { definition ->
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
                // TODO - add public API
                // TODO - add event handlers
                .apply {
                    definition.members
                        .filterIsInstance<MemberDefinition.Todo>()
                        .map { it.name }
                        .takeUnless { it.isEmpty() }
                        ?.joinToString(prefix = "TODO - implement:\n  ", separator = "\n  ")
                        ?.let { addComment(it) }
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

}
