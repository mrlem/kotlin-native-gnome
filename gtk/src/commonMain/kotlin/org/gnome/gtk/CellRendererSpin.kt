package org.gnome.gtk

import gtk3.GtkCellRendererSpin
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRendererSpin = CPointer<GtkCellRendererSpin>

public val CellRendererSpin.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererSpin.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererSpin.asCellRendererText: CellRendererText
  get() = reinterpret()
