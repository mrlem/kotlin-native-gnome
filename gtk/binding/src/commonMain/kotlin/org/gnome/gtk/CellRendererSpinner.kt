@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkCellRendererSpinner
import gtk3.gtk_cell_renderer_spinner_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererSpinner = CPointer<GtkCellRendererSpinner>

public val CellRendererSpinner.asObject: Object
  get() = reinterpret()

public val CellRendererSpinner.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererSpinner.asCellRenderer: CellRenderer
  get() = reinterpret()

public object CellRendererSpinnerFactory {
  public fun new(): CellRendererSpinner = gtk_cell_renderer_spinner_new()!!.reinterpret()
}
