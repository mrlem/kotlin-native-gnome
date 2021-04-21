@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellRendererText
import gtk3.gtk_cell_renderer_text_set_fixed_height_from_font
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias CellRendererText = CPointer<GtkCellRendererText>

public val CellRendererText.asObject: Object
  get() = reinterpret()

public val CellRendererText.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererText.asCellRenderer: CellRenderer
  get() = reinterpret()

public fun CellRendererText.setFixedHeightFromFont(numberOfRows: Int): Unit {
  gtk_cell_renderer_text_set_fixed_height_from_font(this, numberOfRows)
}

public fun CellRendererText.onEdited(callback: (CellRendererText) -> Unit): CellRendererText {
  // TODO - handle callback data

  asObject.connect("edited") { callback(this) }
  return this
}
