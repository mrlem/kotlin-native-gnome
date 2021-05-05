@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoFontsetSimple
import interop.pango_fontset_simple_append
import interop.pango_fontset_simple_new
import interop.pango_fontset_simple_size
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FontsetSimple = CPointer<PangoFontsetSimple>

public val FontsetSimple.asObject: Object
  get() = reinterpret()

public val FontsetSimple.asFontset: Fontset
  get() = reinterpret()

public object FontsetSimpleFactory {
  public fun new(language: Language?): FontsetSimple =
      pango_fontset_simple_new(language?.reinterpret())!!.reinterpret()
}

public fun FontsetSimple.append(font: Font?): Unit {
  pango_fontset_simple_append(this@append, font?.reinterpret())
}

public fun FontsetSimple.size(): Int = pango_fontset_simple_size(this@size)
