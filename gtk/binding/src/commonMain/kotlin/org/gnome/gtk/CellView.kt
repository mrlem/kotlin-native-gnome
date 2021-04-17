// TODO - implement:
//   get_size_of_row
//   set_background_color
//   set_background_rgba
//   set_displayed_row
//   set_model
package org.gnome.gtk

import gtk3.GtkCellView
import gtk3.gtk_cell_view_get_displayed_row
import gtk3.gtk_cell_view_get_draw_sensitive
import gtk3.gtk_cell_view_get_fit_model
import gtk3.gtk_cell_view_get_model
import gtk3.gtk_cell_view_set_draw_sensitive
import gtk3.gtk_cell_view_set_fit_model
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias CellView = CPointer<GtkCellView>

public val CellView.asObject: Object
  get() = reinterpret()

public val CellView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellView.asWidget: Widget
  get() = reinterpret()

public fun CellView.getDisplayedRow(): Unit {
  gtk_cell_view_get_displayed_row(this)
}

public fun CellView.getModel(): Unit {
  gtk_cell_view_get_model(this)
}

public var CellView.drawSensitive: Boolean
  get() = gtk_cell_view_get_draw_sensitive(this).toBoolean
  set(`value`) {
    gtk_cell_view_set_draw_sensitive(this, value.toInt)
  }

public var CellView.fitModel: Boolean
  get() = gtk_cell_view_get_fit_model(this).toBoolean
  set(`value`) {
    gtk_cell_view_set_fit_model(this, value.toInt)
  }
