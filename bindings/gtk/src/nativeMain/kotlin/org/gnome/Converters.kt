package org.gnome

import interop.*
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gnome.glib.List

fun Boolean.toInt() = if (this) 1 else 0

fun Int.toBoolean() = this == 1

fun Char.toUInt() = code.toUInt()

fun UInt.toChar() = Char(this.toInt())

fun CPointer<gcharVar>?.toKString() = this?.toKString().orEmpty()

fun <P : CPointed> CPointer<GList>.toKList(): List<P, CPointer<P>> = List(this)
