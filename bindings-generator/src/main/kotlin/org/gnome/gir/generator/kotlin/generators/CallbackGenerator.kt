package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.CallbackDefinition
import org.gnome.gir.model.NamespaceDefinition

fun CallbackDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cType = cType
        ?: if (name == "Callback") "GCallback" else null // missing cType in the gir
    if (cType == null) {
        println("warning: callback '$name' ignored: no cType")
        return null
    }

    when {
        deprecated -> return null
    }

    return FileSpec.builder(namespace.packageName, name)
        // type
        .addTypeAlias(
            TypeAliasSpec
                .builder(name, ClassName(INTEROP_PACKAGE, cType))
                .build()
        )
        .build()
}
