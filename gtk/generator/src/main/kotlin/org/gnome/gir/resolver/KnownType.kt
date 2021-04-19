package org.gnome.gir.resolver

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.GTK_CINTEROP_PACKAGE_NAME

enum class KnownType(
    val value: String,
    val kTypeName: TypeName?,
    val toKTypeConverter: String?,
    val cTypeName: TypeName?,
    val toCTypeConverter: String?
) {

    UTF8(
        "utf8",
        ClassName("kotlin", "String")
            .copy(nullable = true),
        "toKString",
        ClassName("kotlinx.cinterop", "CPointer")
            .plusParameter(ClassName(GTK_CINTEROP_PACKAGE_NAME, "gvarChar")),
        null
    ),
    Filename(
        "filename",
        ClassName("kotlin", "String")
            .copy(nullable = true),
        "toKString",
        // TODO
        null,
        // TODO
        null
    ),
    GChar(
        "gchar",
        ClassName("java.lang", "Character"),
        null,
        // TODO
        null,
        // TODO
        null
    ),
    GUniChar(
        "gunichar",
        // TODO
        null,
        // TODO
        null,
        // TODO
        null,
        // TODO
        null
    ),
    GBoolean(
        "gboolean",
        ClassName("kotlin", "Boolean"),
        "toBoolean",
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gboolean"),
        "toInt"
    ),
    GInt(
        "gint",
        ClassName("kotlin", "Int"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint"),
        null
    ),
    GInt8(
        "gint8",
        ClassName("kotlin", "Byte"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint8"),
        null
    ),
    GInt16(
        "gint16",
        ClassName("kotlin", "Short"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint16"),
        null
    ),
    GInt32(
        "gint32",
        ClassName("kotlin", "Int"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint32"),
        null
    ),
    GInt64(
        "gint64",
        ClassName("kotlin", "Long"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gint64"),
        null
    ),
    GLong(
        "glong",
        ClassName("kotlin", "Long"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "glong"),
        null
    ),
    GUInt(
        "guint",
        ClassName("kotlin", "UInt"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint"),
        null
    ),
    GUInt8(
        "guint8",
        ClassName("kotlin", "UByte"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint8"),
        null
    ),
    GUInt16(
        "guint16",
        ClassName("kotlin", "UShort"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint16"),
        null
    ),
    GUInt32(
        "guint32",
        ClassName("kotlin", "UInt"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint32"),
        null
    ),
    GUInt64(
        "guint64",
        ClassName("kotlin", "ULong"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "guint64"),
        null
    ),
    GULong(
        "gulong",
        ClassName("kotlin", "ULong"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gulong"),
        null
    ),
    GDouble(
        "gdouble",
        ClassName("kotlin", "Double"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gdouble"),
        null
    ),
    GFloat(
        "gfloat",
        ClassName("kotlin", "Float"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gfloat"),
        null
    ),
    Any(
        "any",
        ClassName("kotlin", "Any"),
        null,
        // TODO
        null,
        // TODO
        null
    ),
    Type(
        "GType",
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "GType"),
        // TODO
        null,
        // TODO
        null,
        // TODO
        null
    ),
    VAList(
        "va_list",
        // TODO
        null,
        // TODO
        null,
        // TODO
        null,
        // TODO
        null
    ),
    GPointer(
        "gpointer",
        // TODO
        null,
        // TODO
        null,
        // TODO
        null,
        // TODO
        null
    ),
    GSize(
        "gsize",
        ClassName("kotlin", "ULong"),
        null,
        ClassName(GTK_CINTEROP_PACKAGE_NAME, "gsize"),
        null
    )
    ;

    companion object {
        fun fromName(name: String): KnownType? = values().firstOrNull { name == it.value }
    }

}