package org.gnome.gtk

import gtk3.GtkCellRenderer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRenderer = CPointer<GtkCellRenderer>

public val CellRenderer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
