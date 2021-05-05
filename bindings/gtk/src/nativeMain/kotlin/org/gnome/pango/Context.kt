// TODO - method: list_families (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoContext
import interop.pango_context_changed
import interop.pango_context_get_base_dir
import interop.pango_context_get_base_gravity
import interop.pango_context_get_font_description
import interop.pango_context_get_font_map
import interop.pango_context_get_gravity
import interop.pango_context_get_gravity_hint
import interop.pango_context_get_language
import interop.pango_context_get_matrix
import interop.pango_context_get_metrics
import interop.pango_context_get_round_glyph_positions
import interop.pango_context_get_serial
import interop.pango_context_load_font
import interop.pango_context_load_fontset
import interop.pango_context_new
import interop.pango_context_set_base_dir
import interop.pango_context_set_base_gravity
import interop.pango_context_set_font_description
import interop.pango_context_set_font_map
import interop.pango_context_set_gravity_hint
import interop.pango_context_set_language
import interop.pango_context_set_matrix
import interop.pango_context_set_round_glyph_positions
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Context = CPointer<PangoContext>

public val Context.asObject: Object
  get() = reinterpret()

public object ContextFactory {
  public fun new(): Context = pango_context_new()!!.reinterpret()
}

public var Context.baseDir: Direction
  get() = pango_context_get_base_dir(this)
  set(`value`) {
    pango_context_set_base_dir(this@baseDir, `value`)
  }

public var Context.baseGravity: Gravity
  get() = pango_context_get_base_gravity(this)
  set(`value`) {
    pango_context_set_base_gravity(this@baseGravity, `value`)
  }

public var Context.fontDescription: FontDescription?
  get() = pango_context_get_font_description(this)?.reinterpret()
  set(`value`) {
    pango_context_set_font_description(this@fontDescription, `value`)
  }

public var Context.fontMap: FontMap?
  get() = pango_context_get_font_map(this)?.reinterpret()
  set(`value`) {
    pango_context_set_font_map(this@fontMap, `value`)
  }

public val Context.gravity: Gravity
  get() = pango_context_get_gravity(this)

public var Context.gravityHint: GravityHint
  get() = pango_context_get_gravity_hint(this)
  set(`value`) {
    pango_context_set_gravity_hint(this@gravityHint, `value`)
  }

public var Context.language: Language?
  get() = pango_context_get_language(this)?.reinterpret()
  set(`value`) {
    pango_context_set_language(this@language, `value`)
  }

public var Context.matrix: Matrix?
  get() = pango_context_get_matrix(this)?.reinterpret()
  set(`value`) {
    pango_context_set_matrix(this@matrix, `value`)
  }

public var Context.roundGlyphPositions: Boolean
  get() = pango_context_get_round_glyph_positions(this).toBoolean()
  set(`value`) {
    pango_context_set_round_glyph_positions(this@roundGlyphPositions, `value`.toInt())
  }

public val Context.serial: UInt
  get() = pango_context_get_serial(this)

public fun Context.changed(): Unit {
  pango_context_changed(this@changed)
}

public fun Context.getMetrics(desc: FontDescription?, language: Language?): FontMetrics? =
    pango_context_get_metrics(this@getMetrics, desc?.reinterpret(),
    language?.reinterpret())?.reinterpret()

public fun Context.loadFont(desc: FontDescription?): Font? = pango_context_load_font(this@loadFont,
    desc?.reinterpret())?.reinterpret()

public fun Context.loadFontset(desc: FontDescription?, language: Language?): Fontset? =
    pango_context_load_fontset(this@loadFontset, desc?.reinterpret(),
    language?.reinterpret())?.reinterpret()
