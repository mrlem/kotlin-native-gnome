// TODO - method: accept (param type)
// TODO - method: accept_async (param type)
// TODO - method: accept_finish (param type)
// TODO - method: accept_socket (param type)
// TODO - method: accept_socket_async (param type)
// TODO - method: accept_socket_finish (param type)
// TODO - method: add_address (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocketListener
import interop.g_socket_listener_add_any_inet_port
import interop.g_socket_listener_add_inet_port
import interop.g_socket_listener_add_socket
import interop.g_socket_listener_close
import interop.g_socket_listener_new
import interop.g_socket_listener_set_backlog
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.gobject.connect

public typealias SocketListener = CPointer<GSocketListener>

public val SocketListener.asObject: Object
  get() = reinterpret()

public object SocketListenerFactory {
  public fun new(): SocketListener = g_socket_listener_new()!!.reinterpret()
}

public val SocketListener.parentInstance: Object
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun SocketListener.addAnyInetPort(sourceObject: Object?): UShort = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UShort = g_socket_listener_add_any_inet_port(this@addAnyInetPort,
      sourceObject?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketListener.addInetPort(port: UShort, sourceObject: Object?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_listener_add_inet_port(this@addInetPort, port,
      sourceObject?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketListener.addSocket(socket: Socket?, sourceObject: Object?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_listener_add_socket(this@addSocket, socket?.reinterpret(),
      sourceObject?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun SocketListener.close(): Unit {
  g_socket_listener_close(this@close)
}

public fun SocketListener.setBacklog(listenBacklog: Int): Unit {
  g_socket_listener_set_backlog(this@setBacklog, listenBacklog)
}

public fun SocketListener.onEvent(callback: (SocketListener) -> Unit): SocketListener {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
