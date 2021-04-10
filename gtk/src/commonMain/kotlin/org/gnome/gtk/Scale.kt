// TODO - implement:
//   add_mark
//   get_layout_offsets
//   set_value_pos
package org.gnome.gtk

import gtk3.GtkScale
import gtk3.gtk_scale_clear_marks
import gtk3.gtk_scale_get_digits
import gtk3.gtk_scale_get_draw_value
import gtk3.gtk_scale_get_has_origin
import gtk3.gtk_scale_get_layout
import gtk3.gtk_scale_get_value_pos
import gtk3.gtk_scale_set_digits
import gtk3.gtk_scale_set_draw_value
import gtk3.gtk_scale_set_has_origin
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias Scale = CPointer<GtkScale>

public val Scale.asObject: Object
  get() = reinterpret()

public val Scale.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scale.asWidget: Widget
  get() = reinterpret()

public val Scale.asRange: Range
  get() = reinterpret()

public fun Scale.clearMarks(): Unit {
  gtk_scale_clear_marks(this)
}

public fun Scale.getLayout(): Unit {
  gtk_scale_get_layout(this)
}

public fun Scale.getValuePos(): Unit {
  gtk_scale_get_value_pos(this)
}

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
