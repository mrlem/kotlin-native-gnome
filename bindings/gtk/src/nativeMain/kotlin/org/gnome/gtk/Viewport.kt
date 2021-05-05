@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkViewport
import interop.gtk_viewport_get_bin_window
import interop.gtk_viewport_get_shadow_type
import interop.gtk_viewport_get_view_window
import interop.gtk_viewport_new
import interop.gtk_viewport_set_shadow_type
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Window
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

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

public object ViewportFactory {
  public fun new(hadjustment: Adjustment?, vadjustment: Adjustment?): Viewport =
      gtk_viewport_new(hadjustment?.reinterpret(), vadjustment?.reinterpret())!!.reinterpret()
}

public val Viewport.bin: Bin
  get() = pointed.bin.ptr

public val Viewport.binWindow: Window?
  get() = gtk_viewport_get_bin_window(this)?.reinterpret()

public var Viewport.shadowType: ShadowType
  get() = gtk_viewport_get_shadow_type(this)
  set(`value`) {
    gtk_viewport_set_shadow_type(this@shadowType, `value`)
  }

public val Viewport.viewWindow: Window?
  get() = gtk_viewport_get_view_window(this)?.reinterpret()
