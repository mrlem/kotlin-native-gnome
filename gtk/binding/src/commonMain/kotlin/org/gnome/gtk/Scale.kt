// TODO - method: get_layout
// TODO - method: get_layout_offsets
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkScale
import gtk3.gtk_scale_add_mark
import gtk3.gtk_scale_clear_marks
import gtk3.gtk_scale_get_digits
import gtk3.gtk_scale_get_draw_value
import gtk3.gtk_scale_get_has_origin
import gtk3.gtk_scale_get_value_pos
import gtk3.gtk_scale_set_digits
import gtk3.gtk_scale_set_draw_value
import gtk3.gtk_scale_set_has_origin
import gtk3.gtk_scale_set_value_pos
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Scale = CPointer<GtkScale>

public val Scale.asObject: Object
  get() = reinterpret()

public val Scale.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scale.asWidget: Widget
  get() = reinterpret()

public val Scale.asRange: Range
  get() = reinterpret()

public var Scale.digits: Int
  get() = gtk_scale_get_digits(this)
  set(`value`) {
    gtk_scale_set_digits(this, value)
  }

public var Scale.drawValue: Boolean
  get() = gtk_scale_get_draw_value(this).toBoolean
  set(`value`) {
    gtk_scale_set_draw_value(this, value.toInt)
  }

public var Scale.hasOrigin: Boolean
  get() = gtk_scale_get_has_origin(this).toBoolean
  set(`value`) {
    gtk_scale_set_has_origin(this, value.toInt)
  }

public var Scale.valuePos: PositionType
  get() = gtk_scale_get_value_pos(this)
  set(`value`) {
    gtk_scale_set_value_pos(this, value)
  }

public fun Scale.addMark(
  `value`: Double,
  position: PositionType,
  markup: String
): Unit {
  gtk_scale_add_mark(this, value, position, markup)
}

public fun Scale.clearMarks(): Unit {
  gtk_scale_clear_marks(this)
}

public fun Scale.onFormatValue(callback: (Scale) -> Unit): Scale {
  // TODO - handle callback data

  asObject.connect("format-value") { callback(this) }
  return this
}
