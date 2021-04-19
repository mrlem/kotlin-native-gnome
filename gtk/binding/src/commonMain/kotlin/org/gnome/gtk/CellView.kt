// TODO - set_background_rgba
//
package org.gnome.gtk

import gtk3.GtkCellView
import gtk3.gtk_cell_view_get_displayed_row
import gtk3.gtk_cell_view_get_draw_sensitive
import gtk3.gtk_cell_view_get_fit_model
import gtk3.gtk_cell_view_get_model
import gtk3.gtk_cell_view_set_displayed_row
import gtk3.gtk_cell_view_set_draw_sensitive
import gtk3.gtk_cell_view_set_fit_model
import gtk3.gtk_cell_view_set_model
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias CellView = CPointer<GtkCellView>

public val CellView.asObject: Object
  get() = reinterpret()

public val CellView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellView.asWidget: Widget
  get() = reinterpret()

public fun CellView.getDisplayedRow(): TreePath? =
    gtk_cell_view_get_displayed_row(this)?.reinterpret()

public fun CellView.getDrawSensitive(): Boolean = gtk_cell_view_get_draw_sensitive(this).toBoolean

public fun CellView.getFitModel(): Boolean = gtk_cell_view_get_fit_model(this).toBoolean

public fun CellView.getModel(): TreeModel? = gtk_cell_view_get_model(this)?.reinterpret()

public fun CellView.setDisplayedRow(path: TreePath): Unit {
  gtk_cell_view_set_displayed_row(this, path.reinterpret())
}

public fun CellView.setDrawSensitive(drawSensitive: Boolean): Unit {
  gtk_cell_view_set_draw_sensitive(this, drawSensitive.toInt)
}

public fun CellView.setFitModel(fitModel: Boolean): Unit {
  gtk_cell_view_set_fit_model(this, fitModel.toInt)
}

public fun CellView.setModel(model: TreeModel): Unit {
  gtk_cell_view_set_model(this, model.reinterpret())
}
