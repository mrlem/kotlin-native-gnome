@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellRendererToggle
import interop.gtk_cell_renderer_toggle_get_activatable
import interop.gtk_cell_renderer_toggle_get_active
import interop.gtk_cell_renderer_toggle_get_radio
import interop.gtk_cell_renderer_toggle_new
import interop.gtk_cell_renderer_toggle_set_activatable
import interop.gtk_cell_renderer_toggle_set_active
import interop.gtk_cell_renderer_toggle_set_radio
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias CellRendererToggle = CPointer<GtkCellRendererToggle>

public val CellRendererToggle.asObject: Object
  get() = reinterpret()

public val CellRendererToggle.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererToggle.asCellRenderer: CellRenderer
  get() = reinterpret()

public object CellRendererToggleFactory {
  public fun new(): CellRendererToggle = gtk_cell_renderer_toggle_new()!!.reinterpret()
}

public val CellRendererToggle.parent: CellRenderer
  get() = pointed.parent.ptr

public var CellRendererToggle.activatable: Boolean
  get() = gtk_cell_renderer_toggle_get_activatable(this).toBoolean()
  set(`value`) {
    gtk_cell_renderer_toggle_set_activatable(this@activatable, `value`.toInt())
  }

public var CellRendererToggle.active: Boolean
  get() = gtk_cell_renderer_toggle_get_active(this).toBoolean()
  set(`value`) {
    gtk_cell_renderer_toggle_set_active(this@active, `value`.toInt())
  }

public var CellRendererToggle.radio: Boolean
  get() = gtk_cell_renderer_toggle_get_radio(this).toBoolean()
  set(`value`) {
    gtk_cell_renderer_toggle_set_radio(this@radio, `value`.toInt())
  }

public fun CellRendererToggle.onToggled(callback: (CellRendererToggle) -> Unit):
    CellRendererToggle {
  // TODO - handle callback data

  asObject.connect("toggled") { callback(this) }
  return this
}
