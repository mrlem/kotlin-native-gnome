package org.gnome.gtk

import gtk3.GtkCellRendererCombo
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRendererCombo = CPointer<GtkCellRendererCombo>

public val CellRendererCombo.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererCombo.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererCombo.asCellRendererText: CellRendererText
  get() = reinterpret()
