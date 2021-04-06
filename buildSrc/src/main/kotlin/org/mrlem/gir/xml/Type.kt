package org.mrlem.gir.xml

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import org.mrlem.gir.GirPlugin.Companion.GTK_CINTEROP_PACKAGE_NAME

sealed class Type {

    abstract val kType: TypeName
    abstract val cType: TypeName
    open val toKTypeConverter: String? = null
    open val toGTypeConverter: String? = null

    object UTF8 : Type() {
        override val kType = ClassName("kotlin", "String")
            .copy(nullable = true)
        override val cType = ClassName("kotlinx.cinterop", "CPointer")
            .plusParameter(ClassName(GTK_CINTEROP_PACKAGE_NAME, "gvarChar"))
        override val toKTypeConverter = "toKString"
    }

    object GBoolean : Type() {
        override val kType = ClassName("kotlin", "Boolean")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gboolean")
        override val toKTypeConverter = "toBoolean"
        override val toGTypeConverter = "toInt"
    }

    object GInt : Type() {
        override val kType = ClassName("kotlin", "Int")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint")
    }

    object GInt8 : Type() {
        override val kType = ClassName("kotlin", "Byte")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint8")
    }

    object GInt16 : Type() {
        override val kType = ClassName("kotlin", "Short")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint16")
    }

    object GInt32 : Type() {
        override val kType = ClassName("kotlin", "Int")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint32")
    }

    object GInt64 : Type() {
        override val kType = ClassName("kotlin", "Long")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint64")
    }

    object GLong : Type() {
        override val kType = ClassName("kotlin", "Long")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "glong")
    }

    object GUInt : Type() {
        override val kType = ClassName("kotlin", "UInt")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint")
    }

    object GUInt8 : Type() {
        override val kType = ClassName("kotlin", "UByte")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint8")
    }

    object GUInt16 : Type() {
        override val kType = ClassName("kotlin", "UShort")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint16")
    }

    object GUInt32 : Type() {
        override val kType = ClassName("kotlin", "UInt")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint32")
    }

    object GUInt64 : Type() {
        override val kType = ClassName("kotlin", "ULong")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint64")
    }

    object GULong : Type() {
        override val kType = ClassName("kotlin", "ULong")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gulong")
    }

    object GDouble : Type() {
        override val kType = ClassName("kotlin", "Double")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gdouble")
    }

    object GFloat : Type() {
        override val kType = ClassName("kotlin", "Float")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gfloat")
    }

    object GChar : Type() {
        override val kType = ClassName("java.lang", "Character")
        override val cType = ClassName(GTK_CINTEROP_PACKAGE_NAME, "gchar")
    }

    companion object {
        fun fromName(name: String): Type? = when (name) {
            "utf8" -> UTF8
            "gboolean" -> GBoolean
            "gint" -> GInt
            "gint8" -> GInt8
            "gint16" -> GInt16
            "gint32" -> GInt32
            "gint64" -> GInt64
            "glong" -> GLong
            "guint" -> GUInt
            "guint8" -> GUInt8
            "guint16" -> GUInt16
            "guint32" -> GUInt32
            "guint64" -> GUInt64
            "gulong" -> GULong
            "gdouble" -> GDouble
            "gfloat" -> GFloat
            "gchar" -> GChar
            // TODO - GList
            // TODO - class refs
            else -> null
        }
    }

}
