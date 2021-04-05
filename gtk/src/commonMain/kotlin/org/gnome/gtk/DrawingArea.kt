package org.gnome.gtk

import gtk3.GtkDrawingArea
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias DrawingArea = CPointer<GtkDrawingArea>

public val DrawingArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val DrawingArea.asWidget: Widget
  get() = reinterpret()
