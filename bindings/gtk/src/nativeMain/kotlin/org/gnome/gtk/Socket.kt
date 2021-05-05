// TODO - method: add_id (param type)
// TODO - method: get_id (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSocket
import interop.gtk_socket_get_plug_window
import interop.gtk_socket_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Window
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias Socket = CPointer<GtkSocket>

public val Socket.asObject: Object
  get() = reinterpret()

public val Socket.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Socket.asWidget: Widget
  get() = reinterpret()

public val Socket.asContainer: Container
  get() = reinterpret()

public object SocketFactory {
  public fun new(): Socket = gtk_socket_new()!!.reinterpret()
}

public val Socket.container: Container
  get() = pointed.container.ptr

public val Socket.plugWindow: Window?
  get() = gtk_socket_get_plug_window(this)?.reinterpret()

public fun Socket.onPlugAdded(callback: (Socket) -> Unit): Socket {
  // TODO - handle callback data

  asObject.connect("plug-added") { callback(this) }
  return this
}

public fun Socket.onPlugRemoved(callback: (Socket) -> Unit): Socket {
  // TODO - handle callback data

  asObject.connect("plug-removed") { callback(this) }
  return this
}
