@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkOverlay
import interop.gtk_overlay_add_overlay
import interop.gtk_overlay_get_overlay_pass_through
import interop.gtk_overlay_new
import interop.gtk_overlay_reorder_overlay
import interop.gtk_overlay_set_overlay_pass_through
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias Overlay = CPointer<GtkOverlay>

public val Overlay.asObject: Object
  get() = reinterpret()

public val Overlay.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Overlay.asWidget: Widget
  get() = reinterpret()

public val Overlay.asContainer: Container
  get() = reinterpret()

public val Overlay.asBin: Bin
  get() = reinterpret()

public object OverlayFactory {
  public fun new(): Overlay = gtk_overlay_new()!!.reinterpret()
}

public val Overlay.parent: Bin
  get() = pointed.parent.ptr

public fun Overlay.addOverlay(widget: Widget?): Unit {
  gtk_overlay_add_overlay(this, widget?.reinterpret())
}

public fun Overlay.getOverlayPassThrough(widget: Widget?): Boolean =
    gtk_overlay_get_overlay_pass_through(this, widget?.reinterpret()).toBoolean()

public fun Overlay.reorderOverlay(child: Widget?, index: Int): Unit {
  gtk_overlay_reorder_overlay(this, child?.reinterpret(), index)
}

public fun Overlay.setOverlayPassThrough(widget: Widget?, passThrough: Boolean): Unit {
  gtk_overlay_set_overlay_pass_through(this, widget?.reinterpret(), passThrough.toInt())
}

public fun Overlay.onGetChildPosition(callback: (Overlay) -> Unit): Overlay {
  // TODO - handle callback data

  asObject.connect("get-child-position") { callback(this) }
  return this
}
