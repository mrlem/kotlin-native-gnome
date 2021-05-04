// TODO - method: get_pixbuf (return type)
// TODO - method: get_surface (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkOffscreenWindow
import interop.gtk_offscreen_window_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val OffscreenWindow.parentObject: Window
  get() = pointed.parent_object.ptr
