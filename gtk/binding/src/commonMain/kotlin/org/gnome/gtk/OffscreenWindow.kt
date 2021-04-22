// TODO - method: get_pixbuf
// TODO - method: get_surface
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkOffscreenWindow
import gtk3.gtk_offscreen_window_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias OffscreenWindow = CPointer<GtkOffscreenWindow>

public val OffscreenWindow.asObject: Object
  get() = reinterpret()

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

public object OffscreenWindowFactory {
  public fun new(): OffscreenWindow = gtk_offscreen_window_new()!!.reinterpret()
}
