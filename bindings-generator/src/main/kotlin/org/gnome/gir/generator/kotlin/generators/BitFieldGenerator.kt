package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.BitFieldDefinition
import org.gnome.gir.model.NamespaceDefinition

fun BitFieldDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val glibTypeName = glibTypeName
        ?: "${namespace.cPrefix}$name"

    when {
        deprecated -> return null
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, ClassName(INTEROP_PACKAGE, glibTypeName))
                .build()
        )
        .build()
}
