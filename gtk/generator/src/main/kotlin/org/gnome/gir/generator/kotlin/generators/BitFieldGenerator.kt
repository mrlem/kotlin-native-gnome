package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.BitFieldDefinition
import org.gnome.gir.model.NamespaceDefinition

fun BitFieldDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cType = cType
    if (cType == null) {
        println("warning: bitfield '$name' ignored: no cType")
        return null
    }

    when {
        deprecated -> {
            println("warning: bitfield '$name' ignored: deprecated")
            return null
        }
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, ClassName(GTK_CINTEROP_PACKAGE, cType))
                .build()
        )
        .build()
}
