// TODO - implement:
//   get_displayed_row
//   get_draw_sensitive
//   get_fit_model
//   get_model
//   get_size_of_row
//   set_background_color
//   set_background_rgba
//   set_displayed_row
//   set_draw_sensitive
//   set_fit_model
//   set_model
package org.gnome.gtk

import gtk3.GtkCellView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellView = CPointer<GtkCellView>

public val CellView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellView.asWidget: Widget
  get() = reinterpret()
