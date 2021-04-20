package org.gnome.gtk

import gtk3.GtkOverlay
import gtk3.gtk_overlay_add_overlay
import gtk3.gtk_overlay_get_overlay_pass_through
import gtk3.gtk_overlay_reorder_overlay
import gtk3.gtk_overlay_set_overlay_pass_through
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public fun Overlay.addOverlay(widget: Widget?): Unit {
  gtk_overlay_add_overlay(this, widget?.reinterpret())
}

public fun Overlay.getOverlayPassThrough(widget: Widget?): Boolean =
    gtk_overlay_get_overlay_pass_through(this, widget?.reinterpret()).toBoolean

public fun Overlay.reorderOverlay(child: Widget?, index: Int): Unit {
  gtk_overlay_reorder_overlay(this, child?.reinterpret(), index)
}

public fun Overlay.setOverlayPassThrough(widget: Widget?, passThrough: Boolean): Unit {
  gtk_overlay_set_overlay_pass_through(this, widget?.reinterpret(), passThrough.toInt)
}
