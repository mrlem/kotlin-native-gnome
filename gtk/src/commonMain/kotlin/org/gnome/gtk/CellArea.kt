package org.gnome.gtk

import gtk3.GtkCellArea
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellArea = CPointer<GtkCellArea>

public val CellArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
