@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkCellRendererCombo
import gtk3.gtk_cell_renderer_combo_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias CellRendererCombo = CPointer<GtkCellRendererCombo>

public val CellRendererCombo.asObject: Object
  get() = reinterpret()

public val CellRendererCombo.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererCombo.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererCombo.asCellRendererText: CellRendererText
  get() = reinterpret()

public object CellRendererComboFactory {
  public fun new(): CellRendererCombo = gtk_cell_renderer_combo_new()!!.reinterpret()
}

public fun CellRendererCombo.onChanged(callback: (CellRendererCombo) -> Unit): CellRendererCombo {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
