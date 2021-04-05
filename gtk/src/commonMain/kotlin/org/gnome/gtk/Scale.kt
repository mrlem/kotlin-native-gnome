// TODO - implement:
//   add_mark
//   clear_marks
//   get_digits
//   get_draw_value
//   get_has_origin
//   get_layout
//   get_layout_offsets
//   get_value_pos
//   set_digits
//   set_draw_value
//   set_has_origin
//   set_value_pos
package org.gnome.gtk

import gtk3.GtkScale
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Scale = CPointer<GtkScale>

public val Scale.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scale.asWidget: Widget
  get() = reinterpret()

public val Scale.asRange: Range
  get() = reinterpret()
