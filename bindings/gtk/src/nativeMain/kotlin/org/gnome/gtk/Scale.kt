// TODO - method: get_layout_offsets (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScale
import interop.gtk_scale_add_mark
import interop.gtk_scale_clear_marks
import interop.gtk_scale_get_digits
import interop.gtk_scale_get_draw_value
import interop.gtk_scale_get_has_origin
import interop.gtk_scale_get_layout
import interop.gtk_scale_get_value_pos
import interop.gtk_scale_new
import interop.gtk_scale_new_with_range
import interop.gtk_scale_set_digits
import interop.gtk_scale_set_draw_value
import interop.gtk_scale_set_has_origin
import interop.gtk_scale_set_value_pos
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.pango.Layout
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias Scale = CPointer<GtkScale>

public val Scale.asObject: Object
  get() = reinterpret()

public val Scale.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scale.asWidget: Widget
  get() = reinterpret()

public val Scale.asRange: Range
  get() = reinterpret()

public object ScaleFactory {
  public fun new(orientation: Orientation, adjustment: Adjustment?): Scale =
      gtk_scale_new(orientation, adjustment?.reinterpret())!!.reinterpret()

  public fun newWithRange(
    orientation: Orientation,
    min: Double,
    max: Double,
    step: Double
  ): Scale = gtk_scale_new_with_range(orientation, min, max, step)!!.reinterpret()
}

public val Scale.range: Range
  get() = pointed.range.ptr

public var Scale.digits: Int
  get() = gtk_scale_get_digits(this)
  set(`value`) {
    gtk_scale_set_digits(this@digits, `value`)
  }

public var Scale.drawValue: Boolean
  get() = gtk_scale_get_draw_value(this).toBoolean()
  set(`value`) {
    gtk_scale_set_draw_value(this@drawValue, `value`.toInt())
  }

public var Scale.hasOrigin: Boolean
  get() = gtk_scale_get_has_origin(this).toBoolean()
  set(`value`) {
    gtk_scale_set_has_origin(this@hasOrigin, `value`.toInt())
  }

public val Scale.layout: Layout?
  get() = gtk_scale_get_layout(this)?.reinterpret()

public var Scale.valuePos: PositionType
  get() = gtk_scale_get_value_pos(this)
  set(`value`) {
    gtk_scale_set_value_pos(this@valuePos, `value`)
  }

public fun Scale.addMark(
  `value`: Double,
  position: PositionType,
  markup: String?
): Unit {
  gtk_scale_add_mark(this@addMark, `value`, position, markup)
}

public fun Scale.clearMarks(): Unit {
  gtk_scale_clear_marks(this@clearMarks)
}

public fun Scale.onFormatValue(callback: (Scale) -> Unit): Scale {
  // TODO - handle callback data

  asObject.connect("format-value") { callback(this) }
  return this
}
