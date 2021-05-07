@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.pango

import interop.PangoRenderer
import interop.pango_renderer_activate
import interop.pango_renderer_deactivate
import interop.pango_renderer_draw_error_underline
import interop.pango_renderer_draw_glyph
import interop.pango_renderer_draw_glyph_item
import interop.pango_renderer_draw_glyphs
import interop.pango_renderer_draw_layout
import interop.pango_renderer_draw_layout_line
import interop.pango_renderer_draw_rectangle
import interop.pango_renderer_draw_trapezoid
import interop.pango_renderer_get_alpha
import interop.pango_renderer_get_color
import interop.pango_renderer_get_layout
import interop.pango_renderer_get_layout_line
import interop.pango_renderer_get_matrix
import interop.pango_renderer_part_changed
import interop.pango_renderer_set_alpha
import interop.pango_renderer_set_color
import interop.pango_renderer_set_matrix
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean

public typealias Renderer = CPointer<PangoRenderer>

public val Renderer.asObject: Object
  get() = reinterpret()

public val Renderer.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Renderer.underline: Underline
  get() = pointed.underline

public val Renderer.strikethrough: Boolean
  get() = pointed.strikethrough.toBoolean()

public val Renderer.activeCount: Int
  get() = pointed.active_count

public val Renderer.layout: Layout?
  get() = pango_renderer_get_layout(this)?.reinterpret()

public val Renderer.layoutLine: LayoutLine?
  get() = pango_renderer_get_layout_line(this)?.reinterpret()

public var Renderer.matrix: Matrix?
  get() = pango_renderer_get_matrix(this)?.reinterpret()
  set(`value`) {
    pango_renderer_set_matrix(this@matrix, `value`)
  }

public fun Renderer.activate(): Unit {
  pango_renderer_activate(this@activate)
}

public fun Renderer.deactivate(): Unit {
  pango_renderer_deactivate(this@deactivate)
}

public fun Renderer.drawErrorUnderline(
  x: Int,
  y: Int,
  width: Int,
  height: Int
): Unit {
  pango_renderer_draw_error_underline(this@drawErrorUnderline, x, y, width, height)
}

public fun Renderer.drawGlyph(
  font: Font?,
  glyph: UInt,
  x: Double,
  y: Double
): Unit {
  pango_renderer_draw_glyph(this@drawGlyph, font?.reinterpret(), glyph, x, y)
}

public fun Renderer.drawGlyphItem(
  text: String?,
  glyphItem: GlyphItem?,
  x: Int,
  y: Int
): Unit {
  pango_renderer_draw_glyph_item(this@drawGlyphItem, text, glyphItem?.reinterpret(), x, y)
}

public fun Renderer.drawGlyphs(
  font: Font?,
  glyphs: GlyphString?,
  x: Int,
  y: Int
): Unit {
  pango_renderer_draw_glyphs(this@drawGlyphs, font?.reinterpret(), glyphs?.reinterpret(), x, y)
}

public fun Renderer.drawLayout(
  layout: Layout?,
  x: Int,
  y: Int
): Unit {
  pango_renderer_draw_layout(this@drawLayout, layout?.reinterpret(), x, y)
}

public fun Renderer.drawLayoutLine(
  line: LayoutLine?,
  x: Int,
  y: Int
): Unit {
  pango_renderer_draw_layout_line(this@drawLayoutLine, line?.reinterpret(), x, y)
}

public fun Renderer.drawRectangle(
  part: RenderPart,
  x: Int,
  y: Int,
  width: Int,
  height: Int
): Unit {
  pango_renderer_draw_rectangle(this@drawRectangle, part, x, y, width, height)
}

public fun Renderer.drawTrapezoid(
  part: RenderPart,
  y1: Double,
  x11: Double,
  x21: Double,
  y2: Double,
  x12: Double,
  x22: Double
): Unit {
  pango_renderer_draw_trapezoid(this@drawTrapezoid, part, y1, x11, x21, y2, x12, x22)
}

public fun Renderer.getAlpha(part: RenderPart): UShort = pango_renderer_get_alpha(this@getAlpha,
    part)

public fun Renderer.getColor(part: RenderPart): Color? = pango_renderer_get_color(this@getColor,
    part)?.reinterpret()

public fun Renderer.partChanged(part: RenderPart): Unit {
  pango_renderer_part_changed(this@partChanged, part)
}

public fun Renderer.setAlpha(part: RenderPart, alpha: UShort): Unit {
  pango_renderer_set_alpha(this@setAlpha, part, alpha)
}

public fun Renderer.setColor(part: RenderPart, color: Color?): Unit {
  pango_renderer_set_color(this@setColor, part, color?.reinterpret())
}
