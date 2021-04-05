// TODO - implement:
//   allocate
//   get_allocation
//   get_area
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_width
//   get_preferred_width_for_height
//   push_preferred_height
//   push_preferred_width
//   reset
package org.gnome.gtk

import gtk3.GtkCellAreaContext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias CellAreaContext = CPointer<GtkCellAreaContext>

public val CellAreaContext.asObject: Object
  get() = reinterpret()
