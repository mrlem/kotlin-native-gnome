// TODO - method: accept
// TODO - method: accept_async
// TODO - method: accept_finish
// TODO - method: accept_socket
// TODO - method: accept_socket_async
// TODO - method: accept_socket_finish
// TODO - method: add_address
// TODO - method: add_any_inet_port
// TODO - method: add_inet_port
// TODO - method: add_socket
// TODO - method: set_backlog
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketListener
import interop.g_socket_listener_close
import interop.g_socket_listener_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias SocketListener = CPointer<GSocketListener>

public val SocketListener.asObject: Object
  get() = reinterpret()

public object SocketListenerFactory {
  public fun new(): SocketListener = g_socket_listener_new()!!.reinterpret()
}

public val SocketListener.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun SocketListener.close(): Unit {
  g_socket_listener_close(this)
}

public fun SocketListener.onEvent(callback: (SocketListener) -> Unit): SocketListener {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
