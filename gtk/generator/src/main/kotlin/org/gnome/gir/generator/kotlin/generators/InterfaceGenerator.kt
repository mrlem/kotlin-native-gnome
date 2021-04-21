package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.cpointerClassName
import org.gnome.gir.generator.kotlin.generators.ext.packageName
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
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, cpointerClassName.plusParameter(ClassName(GTK_CINTEROP_PACKAGE, cType)))
                .build()
        )
        .build()
}
