package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.generator.kotlin.generators.TypeInfo
import org.gnome.gir.resolver.SimpleType
import org.gnome.gir.model.ArrayTypeDefinition
import org.gnome.gir.model.TypeDefinition
import org.gnome.gir.model.types.AnyType
import org.gnome.gir.resolver.Resolver

fun AnyType.typeInfo(resolver: Resolver): TypeInfo? {
    val isCPointer = resolver.isCPointer(this)
    val isEnum = !isCPointer && resolver.isEnum(this)
    val isBitField = !isCPointer && resolver.isBitField(this)
    val kType = when {
        isEnum -> {
            val info = resolver.enumInfo(this)!!
            ClassName("${GNOME_PACKAGE}.${info.namespace.name!!.toLowerCase()}", info.definition.name)
        }
        isBitField -> {
            val info = resolver.bitFieldInfo(this)!!
            ClassName("${GNOME_PACKAGE}.${info.namespace.name!!.toLowerCase()}", info.definition.name)
        }
        else ->
            kType
    }
            ?: return null

    return TypeInfo(
        kType = kType
            .copy(nullable = isCPointer),
        toKType = if (isCPointer) "?.%M()" to arrayOf(reinterpretMemberName) else toKTypeConverter,
        toCType = if (isCPointer) "" to emptyArray() else toCTypeConverter,
        toCTypeReinterpreted = if (isCPointer) "?.%M()" to arrayOf(reinterpretMemberName) else toCTypeConverter,
    )
}

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

private val AnyType.kType: TypeName?
    get() = when (this) {
        is TypeDefinition -> SimpleType.fromName(name)
            ?.kTypeName
            ?: className
        is ArrayTypeDefinition -> null // TODO - handle arrays
        else -> null
    }

private val AnyType.toKTypeConverter
    get() = when (this) {
        is TypeDefinition -> SimpleType.fromName(name)
            ?.toKTypeConverter
            ?.let { ".%M" to arrayOf(MemberName(GNOME_PACKAGE, it)) }
        is ArrayTypeDefinition -> null // TODO - handle arrays conversion
        else -> null
    }
        ?: "" to emptyArray()

private val AnyType.toCTypeConverter
    get() = when (this) {
        is TypeDefinition -> SimpleType.fromName(name)?.toCTypeConverter
            ?.let { ".%M" to arrayOf(MemberName(GNOME_PACKAGE, it)) }
        is ArrayTypeDefinition -> null // TODO - handle arrays conversion
        else -> null
    }
        ?: "" to emptyArray()

private val TypeDefinition.className: TypeName?
    get() {
        return if (name.contains('.')) {
            val (namespaceName, className) = name.split('.')
            ClassName("$GNOME_PACKAGE.${namespaceName.toLowerCase()}", className)
                // TODO - generate more namespaces
                .takeIf { namespaceName == "Gtk" || namespaceName == "Gio" || namespaceName == "GObject" }
                ?: run {
                    println("warning: ignoring class from unknown namespace: $className")
                    null
                }
        } else {
            null
        }
    }
