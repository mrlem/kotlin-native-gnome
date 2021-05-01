package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeAliasSpec
import org.gnome.gir.INTEROP_PACKAGE
import org.gnome.gir.generator.kotlin.generators.ext.cpointerClassName
import org.gnome.gir.generator.kotlin.generators.ext.packageName
import org.gnome.gir.model.NamespaceDefinition
import org.gnome.gir.model.RecordDefinition

fun RecordDefinition.toFileSpec(namespace: NamespaceDefinition): FileSpec? {
    val cName = cType
        ?: glibTypeName
        ?: "${namespace.cPrefix}$name"

    when {
        deprecated -> return null
        glibIsGTypeStructFor != null -> {
            println("info: record '$name' ignored: represents type struct")
            return null
        }
        // FIXME - these are defined but don't exist
        listOf("FileDescriptorBasedIface", "SettingsBackendClass").contains(name) -> {
            println("warning: record '$name' ignored: excluded record")
            return null
        }
        name.endsWith("Private") -> {
            return null
        }
        disguised -> return null
    }

    return FileSpec.builder(namespace.packageName, name)
            // type
            .addTypeAlias(
                TypeAliasSpec
                    .builder(name, cpointerClassName.plusParameter(ClassName(INTEROP_PACKAGE, cName)))
                    .build()
            )
            .build()
}
