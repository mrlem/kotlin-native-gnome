package org.gnome.gtk

import gtk3.GtkCellRendererAccel
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRendererAccel = CPointer<GtkCellRendererAccel>

public val CellRendererAccel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererAccel.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererAccel.asCellRendererText: CellRendererText
  get() = reinterpret()
