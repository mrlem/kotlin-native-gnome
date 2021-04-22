@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellRendererProgress
import gtk3.gtk_cell_renderer_progress_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererProgress = CPointer<GtkCellRendererProgress>

public val CellRendererProgress.asObject: Object
  get() = reinterpret()

public val CellRendererProgress.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererProgress.asCellRenderer: CellRenderer
  get() = reinterpret()

public object CellRendererProgressFactory {
  public fun new(): CellRendererProgress = gtk_cell_renderer_progress_new()!!.reinterpret()
}
