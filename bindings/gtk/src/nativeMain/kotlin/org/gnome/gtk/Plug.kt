// TODO - constructor: new
// TODO - constructor: new_for_display
// TODO - method: construct
// TODO - method: construct_for_display
// TODO - method: get_id
// TODO - method: get_socket_window
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPlug
import interop.gtk_plug_get_embedded
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Plug = CPointer<GtkPlug>

public val Plug.asObject: Object
  get() = reinterpret()

public val Plug.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Plug.asWidget: Widget
  get() = reinterpret()

public val Plug.asContainer: Container
  get() = reinterpret()

public val Plug.asBin: Bin
  get() = reinterpret()

public val Plug.asWindow: Window
  get() = reinterpret()

public object PlugFactory

public val Plug.window: Window
  get() = pointed.window.ptr

public val Plug.embedded: Boolean
  get() = gtk_plug_get_embedded(this).toBoolean

public fun Plug.onEmbedded(callback: (Plug) -> Unit): Plug {
  // TODO - handle callback data

  asObject.connect("embedded") { callback(this) }
  return this
}
