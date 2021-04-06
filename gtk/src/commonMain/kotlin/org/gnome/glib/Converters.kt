package org.gnome.glib

import gtk3.gcharVar
import gtk3.guint16
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.convert
import kotlinx.cinterop.toKString

val Boolean.toInt
    get() = if (this) 1 else 0

val Int.toBoolean
    get() = this == 1

val CPointer<gcharVar>?.toKString
    get() = this?.toKString()

val guint16.toUInt: UInt
    get() = convert()

val UInt.toGuintt16: guint16
    get() = convert()
