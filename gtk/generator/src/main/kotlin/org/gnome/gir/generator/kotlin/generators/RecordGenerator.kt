package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.GTK_CINTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.cpointerClassName
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.NamespaceDefinition
import org.gnome.gir.model.RecordDefinition

fun RecordDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cType = cType
    if (cType == null) {
        println("warning: record '$name' ignored: no cType")
        return null
    }

    when {
        deprecated -> {
            println("warning: record '$name' ignored: deprecated")
            return null
        }
        glibIsGTypeStructFor != null -> {
            println("warning: record '$name' ignored: represents type struct")
            return null
        }
        disguised -> {
            println("warning: record '$name' ignored: disguised")
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
