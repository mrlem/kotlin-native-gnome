// TODO - method: connect_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocketConnection
import interop.g_socket_connection_connect
import interop.g_socket_connection_connect_finish
import interop.g_socket_connection_get_local_address
import interop.g_socket_connection_get_remote_address
import interop.g_socket_connection_get_socket
import interop.g_socket_connection_is_connected
import kotlin.Boolean
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias SocketConnection = CPointer<GSocketConnection>

public val SocketConnection.asObject: Object
  get() = reinterpret()

public val SocketConnection.asIOStream: IOStream
  get() = reinterpret()

public val SocketConnection.parentInstance: IOStream
  get() = pointed.parent_instance.ptr

public val SocketConnection.socket: Socket?
  get() = g_socket_connection_get_socket(this)?.reinterpret()

@Throws(Error::class)
public fun SocketConnection.connect(address: SocketAddress?, cancellable: Cancellable?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_connection_connect(this@connect, address?.reinterpret(),
      cancellable?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketConnection.connectFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_connection_connect_finish(this@connectFinish,
      result?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketConnection.getLocalAddress(): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_connection_get_local_address(this@getLocalAddress,
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketConnection.getRemoteAddress(): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_connection_get_remote_address(this@getRemoteAddress,
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun SocketConnection.isConnected(): Boolean =
    g_socket_connection_is_connected(this@isConnected).toBoolean()
