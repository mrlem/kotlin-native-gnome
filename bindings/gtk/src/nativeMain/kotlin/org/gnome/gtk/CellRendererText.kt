@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellRendererText
import interop.gtk_cell_renderer_text_new
import interop.gtk_cell_renderer_text_set_fixed_height_from_font
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias CellRendererText = CPointer<GtkCellRendererText>

public val CellRendererText.asObject: Object
  get() = reinterpret()

public val CellRendererText.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererText.asCellRenderer: CellRenderer
  get() = reinterpret()

public object CellRendererTextFactory {
  public fun new(): CellRendererText = gtk_cell_renderer_text_new()!!.reinterpret()
}

public val CellRendererText.parent: CellRenderer
  get() = pointed.parent.ptr

public fun CellRendererText.setFixedHeightFromFont(numberOfRows: Int): Unit {
  gtk_cell_renderer_text_set_fixed_height_from_font(this, numberOfRows)
}

public fun CellRendererText.onEdited(callback: (CellRendererText) -> Unit): CellRendererText {
  // TODO - handle callback data

  asObject.connect("edited") { callback(this) }
  return this
}
