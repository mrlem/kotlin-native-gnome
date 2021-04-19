package org.gnome.gtk

import gtk3.GtkCellRendererToggle
import gtk3.gtk_cell_renderer_toggle_get_activatable
import gtk3.gtk_cell_renderer_toggle_get_active
import gtk3.gtk_cell_renderer_toggle_get_radio
import gtk3.gtk_cell_renderer_toggle_set_activatable
import gtk3.gtk_cell_renderer_toggle_set_active
import gtk3.gtk_cell_renderer_toggle_set_radio
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias CellRendererToggle = CPointer<GtkCellRendererToggle>

public val CellRendererToggle.asObject: Object
  get() = reinterpret()

public val CellRendererToggle.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererToggle.asCellRenderer: CellRenderer
  get() = reinterpret()

public fun CellRendererToggle.getActivatable(): Boolean =
    gtk_cell_renderer_toggle_get_activatable(this).toBoolean

public fun CellRendererToggle.getActive(): Boolean =
    gtk_cell_renderer_toggle_get_active(this).toBoolean

public fun CellRendererToggle.getRadio(): Boolean =
    gtk_cell_renderer_toggle_get_radio(this).toBoolean

public fun CellRendererToggle.setActivatable(setting: Boolean): Unit {
  gtk_cell_renderer_toggle_set_activatable(this, setting.toInt)
}

public fun CellRendererToggle.setActive(setting: Boolean): Unit {
  gtk_cell_renderer_toggle_set_active(this, setting.toInt)
}

public fun CellRendererToggle.setRadio(radio: Boolean): Unit {
  gtk_cell_renderer_toggle_set_radio(this, radio.toInt)
}
