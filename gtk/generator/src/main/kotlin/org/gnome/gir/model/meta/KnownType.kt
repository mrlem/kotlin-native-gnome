package org.gnome.gir.model.meta

enum class KnownType(val value: String) {

    UTF8("utf8"),
    GBoolean("gboolean"),
    GInt("gint"),
    GInt8("gint8"),
    GInt16("gint16"),
    GInt32("gint32"),
    GInt64("gint64"),
    GLong("glong"),
    GUInt("guint"),
    GUInt8("guint8"),
    GUInt16("guint16"),
    GUInt32("guint32"),
    GUInt64("guint64"),
    GULong("gulong"),
    GDouble("gdouble"),
    GFloat("gfloat"),
    GChar("gchar"),
    GUniChar("gunichar"),
    Filename("filename"),
    Any("any"),
    Type("GType");

    companion object {
        fun fromName(name: String): KnownType? = values().firstOrNull { name == it.value }
    }

}