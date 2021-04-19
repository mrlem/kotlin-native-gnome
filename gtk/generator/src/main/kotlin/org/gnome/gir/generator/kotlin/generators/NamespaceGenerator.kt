package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.FileSpec
import org.gnome.gir.model.NamespaceDefinition

fun NamespaceDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec {
    return FileSpec.builder(namespace.packageName, name!!)
        .apply {
            // functions
            functions.forEach { function ->
                addFunction(function.toFunSpec())
            }
            // TODO - the rest :)
        }
        .build()
}
