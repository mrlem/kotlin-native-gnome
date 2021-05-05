// TODO - method: list_faces (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFontFamily
import interop.pango_font_family_get_name
import interop.pango_font_family_is_monospace
import interop.pango_font_family_is_variable
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias FontFamily = CPointer<PangoFontFamily>

public val FontFamily.asObject: Object
  get() = reinterpret()

public val FontFamily.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val FontFamily.name: String?
  get() = pango_font_family_get_name(this).toKString()

public fun FontFamily.isMonospace(): Boolean =
    pango_font_family_is_monospace(this@isMonospace).toBoolean()

public fun FontFamily.isVariable(): Boolean =
    pango_font_family_is_variable(this@isVariable).toBoolean()
