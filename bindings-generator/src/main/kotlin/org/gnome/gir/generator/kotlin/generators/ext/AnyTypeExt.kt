package org.gnome.gir.generator.kotlin.generators.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.GNOME_ADDITIONS_PACKAGE
import org.gnome.gir.GNOME_PACKAGE
import org.gnome.gir.INTEROP_PACKAGE
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

    val toKTypeConverter = if (isCPointer && (this as? TypeDefinition)?.name != "GLib.List") {
        "?.%M()" to arrayOf(reinterpretMemberName)
    } else {
        toKTypeConverter(resolver)
    }
    val toCTypeConverter = if (isCPointer && (this as? TypeDefinition)?.name != "GLib.List") {
        "" to emptyArray()
    } else {
        toCTypeConverter(resolver)
    }
    val toCTypeReinterpretedConverter = if (isCPointer && (this as? TypeDefinition)?.name != "GLib.List") {
        "?.%M()" to arrayOf(reinterpretMemberName)
    } else {
        toCTypeConverter(resolver)
    }
    return TypeInfo(
        kType = kType
            .copy(nullable = kType.isNullable || isCPointer),
        toKType = toKTypeConverter,
        toCType = toCTypeConverter,
        toCTypeReinterpreted = toCTypeReinterpretedConverter
    )
}

///////////////////////////////////////////////////////////////////////////
// Private
///////////////////////////////////////////////////////////////////////////

private val AnyType.kType: TypeName?
    get() = when (this) {
        is TypeDefinition -> SimpleType.fromName(name)
            ?.kTypeName
            ?: if (name == "GLib.List") {
                ClassName("kotlin.collections", "List")
                    .parameterizedBy(types.first().kType!!)
            } else {
                className
            }
        is ArrayTypeDefinition -> {
            val elementType = (type.kType as? ClassName)
            when {
                elementType != null -> ClassName("kotlin", "Array")
                    .parameterizedBy(elementType.copy(nullable = false))
                else -> null
            }
                ?.copy(nullable = true)

        }
        else -> null
    }

private fun AnyType.toKTypeConverter(resolver: Resolver): Pair<String, Array<Any>> = when (this) {
    is TypeDefinition -> SimpleType.fromName(name)
        ?.toKTypeConverter
        ?.let { ".%M()" to arrayOf(MemberName(GNOME_ADDITIONS_PACKAGE, it)) }
        ?: if (name == "GLib.List") {
            "?.%M<%T>()?.%M()" to arrayOf(
                reinterpretMemberName,
                ClassName(INTEROP_PACKAGE, "GList"),
                MemberName(GNOME_ADDITIONS_PACKAGE, "toKList")
            )
        } else {
            null
        }
    is ArrayTypeDefinition ->  {
        val (valueTemplate, valueArray) = if (SimpleType.fromName(type.name)?.needsValue == true)
            ".%M" to arrayOf(MemberName("kotlinx.cinterop", "value"))
        else
            "" to emptyArray()
        type.toKTypeConverter(resolver).let { (converterTemplate, converterMembers) ->
            "?.%M { it$converterTemplate!!$valueTemplate }" to arrayOf(
                MemberName(GNOME_ADDITIONS_PACKAGE, "toKArray"),
                *converterMembers,
                *valueArray
            )
        }
    }
    else -> null
}
        ?: "" to emptyArray()

private fun AnyType.toCTypeConverter(resolver: Resolver): Pair<String, Array<MemberName>> = when (this) {
        is TypeDefinition -> SimpleType.fromName(name)?.toCTypeConverter
            ?.let { ".%M()" to arrayOf(MemberName(GNOME_ADDITIONS_PACKAGE, it)) }
            ?: if (name == "GLib.List") {
                "?.%M()" to arrayOf(MemberName(GNOME_ADDITIONS_PACKAGE, "toCList"))
            } else {
                "" to emptyArray()
            }
        is ArrayTypeDefinition ->  {
            val isRecordArray = resolver.isRecord(type)
            val (converterTemplate, converterMembers) = if (isRecordArray) {
                ".%M" to arrayOf(MemberName("kotlinx.cinterop", "pointed"))
            } else {
                type.toCTypeConverter(resolver)
            }
            when {
                converterTemplate.isEmpty() -> "?.%M(memScope)" to arrayOf(
                    *converterMembers,
                    MemberName(GNOME_ADDITIONS_PACKAGE, "toCArray")
                )
                else -> "?.%M { it$converterTemplate }?.%M()?.%M(memScope)" to arrayOf(
                    MemberName("kotlin.collections", "map"),
                    *converterMembers,
                    MemberName("kotlin.collections", "toTypedArray"),
                    MemberName(GNOME_ADDITIONS_PACKAGE, "toCArray")
                )
            }
        }
        else -> null
    }
        ?: "" to emptyArray()

// TODO - ask resolver
private val knownNamespaces = listOf(
    "Gtk",
    "Gio",
    "GObject",
    "Atk",
    "Gdk",
    "GdkPixbuf",
    "Pango",
    "GLib"
)

private val TypeDefinition.className: ClassName?
    get() {
        return if (name.contains('.')) {
            val (namespaceName, className) = name.split('.')
            ClassName("$GNOME_PACKAGE.${namespaceName.toLowerCase()}", className)
                .takeIf { knownNamespaces.contains(namespaceName) }
                ?: run {
                    println("warning: ignoring class from unknown namespace: $className")
                    null
                }
        } else {
            null
        }
    }
