// TODO - method: list_families (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFontMap
import interop.pango_font_map_changed
import interop.pango_font_map_create_context
import interop.pango_font_map_get_serial
import interop.pango_font_map_load_font
import interop.pango_font_map_load_fontset
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FontMap = CPointer<PangoFontMap>

public val FontMap.asObject: Object
  get() = reinterpret()

public val FontMap.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val FontMap.serial: UInt
  get() = pango_font_map_get_serial(this)

public fun FontMap.changed(): Unit {
  pango_font_map_changed(this@changed)
}

public fun FontMap.createContext(): Context? =
    pango_font_map_create_context(this@createContext)?.reinterpret()

public fun FontMap.loadFont(context: Context?, desc: FontDescription?): Font? =
    pango_font_map_load_font(this@loadFont, context?.reinterpret(),
    desc?.reinterpret())?.reinterpret()

public fun FontMap.loadFontset(
  context: Context?,
  desc: FontDescription?,
  language: Language?
): Fontset? = pango_font_map_load_fontset(this@loadFontset, context?.reinterpret(),
    desc?.reinterpret(), language?.reinterpret())?.reinterpret()
