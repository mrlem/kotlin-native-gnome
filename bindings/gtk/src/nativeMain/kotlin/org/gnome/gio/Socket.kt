// TODO - constructor: new
// TODO - constructor: new_from_fd
// TODO - method: accept
// TODO - method: bind
// TODO - method: condition_check
// TODO - method: condition_timed_wait
// TODO - method: condition_wait
// TODO - method: connect
// TODO - method: get_option
// TODO - method: join_multicast_group
// TODO - method: join_multicast_group_ssm
// TODO - method: leave_multicast_group
// TODO - method: leave_multicast_group_ssm
// TODO - method: receive
// TODO - method: receive_from
// TODO - method: receive_message
// TODO - method: receive_messages
// TODO - method: receive_with_blocking
// TODO - method: send
// TODO - method: send_message
// TODO - method: send_message_with_timeout
// TODO - method: send_messages
// TODO - method: send_to
// TODO - method: send_with_blocking
// TODO - method: set_option
// TODO - method: shutdown
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocket
import interop.g_socket_check_connect_result
import interop.g_socket_close
import interop.g_socket_connection_factory_create_connection
import interop.g_socket_get_available_bytes
import interop.g_socket_get_blocking
import interop.g_socket_get_broadcast
import interop.g_socket_get_credentials
import interop.g_socket_get_family
import interop.g_socket_get_fd
import interop.g_socket_get_keepalive
import interop.g_socket_get_listen_backlog
import interop.g_socket_get_local_address
import interop.g_socket_get_multicast_loopback
import interop.g_socket_get_multicast_ttl
import interop.g_socket_get_protocol
import interop.g_socket_get_remote_address
import interop.g_socket_get_socket_type
import interop.g_socket_get_timeout
import interop.g_socket_get_ttl
import interop.g_socket_is_closed
import interop.g_socket_is_connected
import interop.g_socket_listen
import interop.g_socket_set_blocking
import interop.g_socket_set_broadcast
import interop.g_socket_set_keepalive
import interop.g_socket_set_listen_backlog
import interop.g_socket_set_multicast_loopback
import interop.g_socket_set_multicast_ttl
import interop.g_socket_set_timeout
import interop.g_socket_set_ttl
import interop.g_socket_speaks_ipv4
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Throws
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Socket = CPointer<GSocket>

public val Socket.asObject: Object
  get() = reinterpret()

public object SocketFactory

public val Socket.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Socket.availableBytes: Long
  get() = g_socket_get_available_bytes(this)

public var Socket.blocking: Boolean
  get() = g_socket_get_blocking(this).toBoolean
  set(`value`) {
    g_socket_set_blocking(this, `value`.toInt)
  }

public var Socket.broadcast: Boolean
  get() = g_socket_get_broadcast(this).toBoolean
  set(`value`) {
    g_socket_set_broadcast(this, `value`.toInt)
  }

public val Socket.family: SocketFamily
  get() = g_socket_get_family(this)

public val Socket.fd: Int
  get() = g_socket_get_fd(this)

public var Socket.keepalive: Boolean
  get() = g_socket_get_keepalive(this).toBoolean
  set(`value`) {
    g_socket_set_keepalive(this, `value`.toInt)
  }

public var Socket.listenBacklog: Int
  get() = g_socket_get_listen_backlog(this)
  set(`value`) {
    g_socket_set_listen_backlog(this, `value`)
  }

public var Socket.multicastLoopback: Boolean
  get() = g_socket_get_multicast_loopback(this).toBoolean
  set(`value`) {
    g_socket_set_multicast_loopback(this, `value`.toInt)
  }

public var Socket.multicastTtl: UInt
  get() = g_socket_get_multicast_ttl(this)
  set(`value`) {
    g_socket_set_multicast_ttl(this, `value`)
  }

public val Socket.protocol: SocketProtocol
  get() = g_socket_get_protocol(this)

public val Socket.socketType: SocketType
  get() = g_socket_get_socket_type(this)

public var Socket.timeout: UInt
  get() = g_socket_get_timeout(this)
  set(`value`) {
    g_socket_set_timeout(this, `value`)
  }

public var Socket.ttl: UInt
  get() = g_socket_get_ttl(this)
  set(`value`) {
    g_socket_set_ttl(this, `value`)
  }

@Throws(Error::class)
public fun Socket.checkConnectResult(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_check_connect_result(this@checkConnectResult, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.close(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_close(this@close, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Socket.connectionFactoryCreateConnection(): SocketConnection? =
    g_socket_connection_factory_create_connection(this)?.reinterpret()

@Throws(Error::class)
public fun Socket.getCredentials(): Credentials? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Credentials? = g_socket_get_credentials(this@getCredentials, errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.getLocalAddress(): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_get_local_address(this@getLocalAddress,
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.getRemoteAddress(): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_get_remote_address(this@getRemoteAddress,
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Socket.isClosed(): Boolean = g_socket_is_closed(this).toBoolean

public fun Socket.isConnected(): Boolean = g_socket_is_connected(this).toBoolean

@Throws(Error::class)
public fun Socket.listen(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_listen(this@listen, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Socket.speaksIpv4(): Boolean = g_socket_speaks_ipv4(this).toBoolean
