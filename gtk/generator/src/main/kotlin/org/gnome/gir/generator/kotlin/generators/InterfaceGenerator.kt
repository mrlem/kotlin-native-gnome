package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME
import org.gnome.gir.model.InterfaceDefinition
import org.gnome.gir.model.NamespaceDefinition

fun InterfaceDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cType = cType
    if (cType == null) {
        println("warning: interface '$name' ignored: no cType")
        return null
    }

    when {
        deprecated -> {
            println("warning: interface '$name' ignored: deprecated")
            return null
        }
        name.contains("Accessible") -> {
            println("warning: interface '$name' ignored: accessibility not handled yet")
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
