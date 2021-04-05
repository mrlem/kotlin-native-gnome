package org.gnome.gtk

import gtk3.GtkCellAreaContext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias CellAreaContext = CPointer<GtkCellAreaContext>

public val CellAreaContext.asObject: Object
  get() = reinterpret()
