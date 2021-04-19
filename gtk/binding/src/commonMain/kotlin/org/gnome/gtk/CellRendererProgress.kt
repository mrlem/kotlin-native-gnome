package org.gnome.gtk

import gtk3.GtkCellRendererProgress
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererProgress = CPointer<GtkCellRendererProgress>

public val CellRendererProgress.asObject: Object
  get() = reinterpret()

public val CellRendererProgress.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererProgress.asCellRenderer: CellRenderer
  get() = reinterpret()
