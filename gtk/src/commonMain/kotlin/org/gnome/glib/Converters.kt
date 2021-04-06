package org.gnome.glib

import gtk3.gcharVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString

val Boolean.toInt
    get() = if (this) 1 else 0

val Int.toBoolean
    get() = this == 1

val CPointer<gcharVar>?.toKString
    get() = this?.toKString()
