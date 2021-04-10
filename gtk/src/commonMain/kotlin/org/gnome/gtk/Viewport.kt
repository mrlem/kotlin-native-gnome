// TODO - implement:
//   set_hadjustment
//   set_shadow_type
//   set_vadjustment
package org.gnome.gtk

import gtk3.GtkViewport
import gtk3.gtk_viewport_get_bin_window
import gtk3.gtk_viewport_get_shadow_type
import gtk3.gtk_viewport_get_view_window
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Viewport = CPointer<GtkViewport>

public val Viewport.asObject: Object
  get() = reinterpret()

public val Viewport.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Viewport.asWidget: Widget
  get() = reinterpret()

public val Viewport.asContainer: Container
  get() = reinterpret()

public val Viewport.asBin: Bin
  get() = reinterpret()

public fun Viewport.getBinWindow(): Unit {
  gtk_viewport_get_bin_window(this)
}

public fun Viewport.getShadowType(): Unit {
  gtk_viewport_get_shadow_type(this)
}

public fun Viewport.getViewWindow(): Unit {
  gtk_viewport_get_view_window(this)
}
