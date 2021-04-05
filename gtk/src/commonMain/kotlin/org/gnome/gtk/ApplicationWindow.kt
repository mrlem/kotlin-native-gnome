package org.gnome.gtk

import gtk3.GtkApplicationWindow
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ApplicationWindow = CPointer<GtkApplicationWindow>

public val ApplicationWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ApplicationWindow.asWidget: Widget
  get() = reinterpret()

public val ApplicationWindow.asContainer: Container
  get() = reinterpret()

public val ApplicationWindow.asBin: Bin
  get() = reinterpret()

public val ApplicationWindow.asWindow: Window
  get() = reinterpret()
