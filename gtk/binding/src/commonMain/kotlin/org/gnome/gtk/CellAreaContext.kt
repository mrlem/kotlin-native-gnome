// TODO - implement:
//   allocate
//   get_allocation
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_width
//   get_preferred_width_for_height
//   push_preferred_height
//   push_preferred_width
package org.gnome.gtk

import gtk3.GtkCellAreaContext
import gtk3.gtk_cell_area_context_get_area
import gtk3.gtk_cell_area_context_reset
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias CellAreaContext = CPointer<GtkCellAreaContext>

public val CellAreaContext.asObject: Object
  get() = reinterpret()

public fun CellAreaContext.getArea(): Unit {
  gtk_cell_area_context_get_area(this)
}

public fun CellAreaContext.reset(): Unit {
  gtk_cell_area_context_reset(this)
}
