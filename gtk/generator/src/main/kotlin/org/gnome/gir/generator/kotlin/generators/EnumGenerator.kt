package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.EnumDefinition
import org.gnome.gir.model.NamespaceDefinition

fun EnumDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val glibTypeName = glibTypeName
    if (glibTypeName == null) {
        println("warning: enum '$name' ignored: no glibTypeName")
        return null
    }

    when {
        deprecated -> {
            println("warning: enum '$name' ignored: deprecated")
            return null
        }
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, ClassName(GTK_CINTEROP_PACKAGE, glibTypeName))
                .build()
        )
        .build()
}
