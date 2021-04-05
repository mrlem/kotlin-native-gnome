// TODO - implement:
//   get_pixbuf
//   get_surface
package org.gnome.gtk

import gtk3.GtkOffscreenWindow
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
