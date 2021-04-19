package org.gnome.gtk

import gtk3.GtkCellRendererPixbuf
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererPixbuf = CPointer<GtkCellRendererPixbuf>

public val CellRendererPixbuf.asObject: Object
  get() = reinterpret()

public val CellRendererPixbuf.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererPixbuf.asCellRenderer: CellRenderer
  get() = reinterpret()
