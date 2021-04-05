package org.gnome.gtk

import gtk3.GtkScrolledWindow
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ScrolledWindow = CPointer<GtkScrolledWindow>

public val ScrolledWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ScrolledWindow.asWidget: Widget
  get() = reinterpret()

public val ScrolledWindow.asContainer: Container
  get() = reinterpret()

public val ScrolledWindow.asBin: Bin
  get() = reinterpret()
