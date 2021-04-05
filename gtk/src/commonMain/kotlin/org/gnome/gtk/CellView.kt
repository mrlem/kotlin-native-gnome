package org.gnome.gtk

import gtk3.GtkCellView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellView = CPointer<GtkCellView>

public val CellView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellView.asWidget: Widget
  get() = reinterpret()
