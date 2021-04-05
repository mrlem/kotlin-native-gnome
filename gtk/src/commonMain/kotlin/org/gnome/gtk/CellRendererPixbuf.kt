package org.gnome.gtk

import gtk3.GtkCellRendererPixbuf
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRendererPixbuf = CPointer<GtkCellRendererPixbuf>

public val CellRendererPixbuf.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererPixbuf.asCellRenderer: CellRenderer
  get() = reinterpret()
