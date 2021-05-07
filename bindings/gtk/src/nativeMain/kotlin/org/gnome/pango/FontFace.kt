// TODO - method: list_sizes (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFontFace
import interop.pango_font_face_describe
import interop.pango_font_face_get_face_name
import interop.pango_font_face_is_synthesized
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toKString

public typealias FontFace = CPointer<PangoFontFace>

public val FontFace.asObject: Object
  get() = reinterpret()

public val FontFace.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val FontFace.faceName: String?
  get() = pango_font_face_get_face_name(this).toKString()

public fun FontFace.describe(): FontDescription? =
    pango_font_face_describe(this@describe)?.reinterpret()

public fun FontFace.isSynthesized(): Boolean =
    pango_font_face_is_synthesized(this@isSynthesized).toBoolean()
