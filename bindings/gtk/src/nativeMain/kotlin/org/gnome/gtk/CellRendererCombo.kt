@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellRendererCombo
import interop.gtk_cell_renderer_combo_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

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

public val CellRendererCombo.parent: CellRendererText
  get() = pointed.parent.ptr

public fun CellRendererCombo.onChanged(callback: (CellRendererCombo) -> Unit): CellRendererCombo {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
