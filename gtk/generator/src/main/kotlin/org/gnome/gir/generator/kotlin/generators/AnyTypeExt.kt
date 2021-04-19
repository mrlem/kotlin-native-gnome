package org.gnome.gir.generator.kotlin.generators

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.GNOME_PACKAGE_NAME
import org.gnome.gir.resolver.KnownType
import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.model.types.AnyType

val AnyType.kType: TypeName?
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)
            ?.kTypeName
            ?: className
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }

val AnyType.toKTypeConverter: String?
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)?.toKTypeConverter
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }

val AnyType.toCTypeConverter: String?
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)?.toCTypeConverter
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }

private val TypeDefinition.className: TypeName?
    get() {
        return if (name.contains('.')) {
            val (namespaceName, className) = name.split('.')
            ClassName("$GNOME_PACKAGE_NAME.${namespaceName.toLowerCase()}", className)
                // FIXME
                .takeIf { namespaceName == "Gtk" }
        } else {
            null
        }
    }
