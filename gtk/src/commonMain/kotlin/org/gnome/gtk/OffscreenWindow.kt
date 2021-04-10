package org.gnome.gtk

import gtk3.GtkOffscreenWindow
import gtk3.gtk_offscreen_window_get_pixbuf
import gtk3.gtk_offscreen_window_get_surface
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias OffscreenWindow = CPointer<GtkOffscreenWindow>

public val OffscreenWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val OffscreenWindow.asWidget: Widget
  get() = reinterpret()

public val OffscreenWindow.asContainer: Container
  get() = reinterpret()

public val OffscreenWindow.asBin: Bin
  get() = reinterpret()

public val OffscreenWindow.asWindow: Window
  get() = reinterpret()

public fun OffscreenWindow.getPixbuf(): Unit {
  gtk_offscreen_window_get_pixbuf(this)
}

public fun OffscreenWindow.getSurface(): Unit {
  gtk_offscreen_window_get_surface(this)
}
