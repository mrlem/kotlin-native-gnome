@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellRendererSpin
import gtk3.gtk_cell_renderer_spin_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererSpin = CPointer<GtkCellRendererSpin>

public val CellRendererSpin.asObject: Object
  get() = reinterpret()

public val CellRendererSpin.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererSpin.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererSpin.asCellRendererText: CellRendererText
  get() = reinterpret()

public object CellRendererSpinFactory {
  public fun new(): CellRendererSpin = gtk_cell_renderer_spin_new()!!.reinterpret()
}
