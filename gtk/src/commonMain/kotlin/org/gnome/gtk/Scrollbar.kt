package org.gnome.gtk

import gtk3.GtkScrollbar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Scrollbar = CPointer<GtkScrollbar>

public val Scrollbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Scrollbar.asWidget: Widget
  get() = reinterpret()

public val Scrollbar.asRange: Range
  get() = reinterpret()
