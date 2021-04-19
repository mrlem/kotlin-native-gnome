package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME
import org.gnome.gir.model.AliasDefinition
import org.gnome.gir.model.NamespaceDefinition

fun AliasDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    when {
        deprecated -> {
            println("warning: alias '$name' ignored: deprecated")
            return null
        }
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec.builder(
                name,
                ClassName("kotlinx.cinterop", "CPointer")
                    .plusParameter(ClassName(GTK_CINTEROP_PACKAGE_NAME, cType))
            )
                .build()
        )
        .build()
}
