package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.resolver.KnownType
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

val AnyType.kType: TypeName?
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)
            ?.kTypeName
            ?: className
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }

val AnyType.toKTypeConverter
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)
            ?.toKTypeConverter
            ?.let { ".%M" to arrayOf(MemberName(GNOME_PACKAGE, it)) }
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }
        ?: "" to emptyArray()

val AnyType.toCTypeConverter
    get() = when (this) {
        is TypeDefinition -> KnownType.fromName(name)?.toCTypeConverter
            ?.let { ".%M" to arrayOf(MemberName(GNOME_PACKAGE, it)) }
        is ArrayTypeDefinition -> null // TODO
        else -> null
    }
        ?: "" to emptyArray()

data class TypeInfo(
    val kType: TypeName,
    val toKType: Pair<String, Array<MemberName>>,
    val toCType: Pair<String, Array<MemberName>>,
    val toCTypeReinterpreted: Pair<String, Array<MemberName>>
)

private val TypeDefinition.className: TypeName?
    get() {
        return if (name.contains('.')) {
            val (namespaceName, className) = name.split('.')
            ClassName("$GNOME_PACKAGE.${namespaceName.toLowerCase()}", className)
                // FIXME
                .takeIf { namespaceName == "Gtk" }
        } else {
            null
        }
    }
