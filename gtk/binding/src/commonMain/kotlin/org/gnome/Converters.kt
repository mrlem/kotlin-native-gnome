package org.gnome

import gtk3.*
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gnome.glib.List

val Boolean.toInt
    get() = if (this) 1 else 0

val Int.toBoolean
    get() = this == 1

val Char.toUInt: UInt
    get() = code.toUInt()

val UInt.toChar
    get() = Char(this.toInt())

val CPointer<gcharVar>?.toKString
    get() = this?.toKString().orEmpty()

fun <P : CPointed> CPointer<GList>.toKList(): List<P, CPointer<P>> = List(this)
