package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME
import org.gnome.gir.model.CallbackDefinition
import org.gnome.gir.model.NamespaceDefinition

fun CallbackDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cType = cType
    if (cType == null) {
        println("warning: callback '$name' ignored: no cType")
        return null
    }

    when {
        deprecated -> {
            println("warning: callback '$name' ignored: deprecated")
            return null
        }
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec.builder(name, ClassName(GTK_CINTEROP_PACKAGE_NAME, cType))
                .build()
        )
        .build()
}
