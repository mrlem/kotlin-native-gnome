@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellRendererAccel
import interop.gtk_cell_renderer_accel_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias CellRendererAccel = CPointer<GtkCellRendererAccel>

public val CellRendererAccel.asObject: Object
  get() = reinterpret()

public val CellRendererAccel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererAccel.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererAccel.asCellRendererText: CellRendererText
  get() = reinterpret()

public object CellRendererAccelFactory {
  public fun new(): CellRendererAccel = gtk_cell_renderer_accel_new()!!.reinterpret()
}

public val CellRendererAccel.parent: CellRendererText
  get() = pointed.parent.ptr

public fun CellRendererAccel.onAccelCleared(callback: (CellRendererAccel) -> Unit):
    CellRendererAccel {
  // TODO - handle callback data

  asObject.connect("accel-cleared") { callback(this) }
  return this
}

public fun CellRendererAccel.onAccelEdited(callback: (CellRendererAccel) -> Unit):
    CellRendererAccel {
  // TODO - handle callback data

  asObject.connect("accel-edited") { callback(this) }
  return this
}
