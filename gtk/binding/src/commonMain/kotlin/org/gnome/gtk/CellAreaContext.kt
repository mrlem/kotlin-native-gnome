// TODO - get_allocation
// TODO - get_preferred_height
// TODO - get_preferred_height_for_width
// TODO - get_preferred_width
// TODO - get_preferred_width_for_height
//
package org.gnome.gtk

import gtk3.GtkCellAreaContext
import gtk3.gtk_cell_area_context_allocate
import gtk3.gtk_cell_area_context_get_area
import gtk3.gtk_cell_area_context_push_preferred_height
import gtk3.gtk_cell_area_context_push_preferred_width
import gtk3.gtk_cell_area_context_reset
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias CellAreaContext = CPointer<GtkCellAreaContext>

public val CellAreaContext.asObject: Object
  get() = reinterpret()

public val CellAreaContext.area: CellArea?
  get() = gtk_cell_area_context_get_area(this)?.reinterpret()

public fun CellAreaContext.allocate(width: Int, height: Int): Unit {
  gtk_cell_area_context_allocate(this, width, height)
}

public fun CellAreaContext.pushPreferredHeight(minimumHeight: Int, naturalHeight: Int): Unit {
  gtk_cell_area_context_push_preferred_height(this, minimumHeight, naturalHeight)
}

public fun CellAreaContext.pushPreferredWidth(minimumWidth: Int, naturalWidth: Int): Unit {
  gtk_cell_area_context_push_preferred_width(this, minimumWidth, naturalWidth)
}

public fun CellAreaContext.reset(): Unit {
  gtk_cell_area_context_reset(this)
}
