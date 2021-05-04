// TODO - constructor: new
// TODO - constructor: new_from_fd
// TODO - method: condition_check (return type)
// TODO - method: condition_timed_wait (param type)
// TODO - method: condition_wait (param type)
// TODO - method: get_option (param type)
// TODO - method: receive_from (param type)
// TODO - method: receive_message (param type)
// TODO - method: send_message_with_timeout (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocket
import interop.g_socket_accept
import interop.g_socket_bind
import interop.g_socket_check_connect_result
import interop.g_socket_close
import interop.g_socket_connect
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
import interop.g_socket_join_multicast_group
import interop.g_socket_join_multicast_group_ssm
import interop.g_socket_leave_multicast_group
import interop.g_socket_leave_multicast_group_ssm
import interop.g_socket_listen
import interop.g_socket_receive
import interop.g_socket_receive_messages
import interop.g_socket_receive_with_blocking
import interop.g_socket_send
import interop.g_socket_send_message
import interop.g_socket_send_messages
import interop.g_socket_send_to
import interop.g_socket_send_with_blocking
import interop.g_socket_set_blocking
import interop.g_socket_set_broadcast
import interop.g_socket_set_keepalive
import interop.g_socket_set_listen_backlog
import interop.g_socket_set_multicast_loopback
import interop.g_socket_set_multicast_ttl
import interop.g_socket_set_option
import interop.g_socket_set_timeout
import interop.g_socket_set_ttl
import interop.g_socket_shutdown
import interop.g_socket_speaks_ipv4
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Throws
import kotlin.UInt
import kotlin.ULong
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
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
  get() = g_socket_get_blocking(this).toBoolean()
  set(`value`) {
    g_socket_set_blocking(this@blocking, `value`.toInt())
  }

public var Socket.broadcast: Boolean
  get() = g_socket_get_broadcast(this).toBoolean()
  set(`value`) {
    g_socket_set_broadcast(this@broadcast, `value`.toInt())
  }

public val Socket.family: SocketFamily
  get() = g_socket_get_family(this)

public val Socket.fd: Int
  get() = g_socket_get_fd(this)

public var Socket.keepalive: Boolean
  get() = g_socket_get_keepalive(this).toBoolean()
  set(`value`) {
    g_socket_set_keepalive(this@keepalive, `value`.toInt())
  }

public var Socket.listenBacklog: Int
  get() = g_socket_get_listen_backlog(this)
  set(`value`) {
    g_socket_set_listen_backlog(this@listenBacklog, `value`)
  }

public var Socket.multicastLoopback: Boolean
  get() = g_socket_get_multicast_loopback(this).toBoolean()
  set(`value`) {
    g_socket_set_multicast_loopback(this@multicastLoopback, `value`.toInt())
  }

public var Socket.multicastTtl: UInt
  get() = g_socket_get_multicast_ttl(this)
  set(`value`) {
    g_socket_set_multicast_ttl(this@multicastTtl, `value`)
  }

public val Socket.protocol: SocketProtocol
  get() = g_socket_get_protocol(this)

public val Socket.socketType: SocketType
  get() = g_socket_get_socket_type(this)

public var Socket.timeout: UInt
  get() = g_socket_get_timeout(this)
  set(`value`) {
    g_socket_set_timeout(this@timeout, `value`)
  }

public var Socket.ttl: UInt
  get() = g_socket_get_ttl(this)
  set(`value`) {
    g_socket_set_ttl(this@ttl, `value`)
  }

@Throws(Error::class)
public fun Socket.accept(cancellable: Cancellable?): Socket? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Socket? = g_socket_accept(this@accept, cancellable?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.bind(address: SocketAddress?, allowReuse: Boolean): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_bind(this@bind, address?.reinterpret(), allowReuse.toInt(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.checkConnectResult(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_check_connect_result(this@checkConnectResult, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.close(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_close(this@close, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.connect(address: SocketAddress?, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_connect(this@connect, address?.reinterpret(),
      cancellable?.reinterpret(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Socket.connectionFactoryCreateConnection(): SocketConnection? =
    g_socket_connection_factory_create_connection(this@connectionFactoryCreateConnection)?.reinterpret()

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

public fun Socket.isClosed(): Boolean = g_socket_is_closed(this@isClosed).toBoolean()

public fun Socket.isConnected(): Boolean = g_socket_is_connected(this@isConnected).toBoolean()

@Throws(Error::class)
public fun Socket.joinMulticastGroup(
  group: InetAddress?,
  sourceSpecific: Boolean,
  iface: String?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_join_multicast_group(this@joinMulticastGroup, group?.reinterpret(),
      sourceSpecific.toInt(), iface, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.joinMulticastGroupSsm(
  group: InetAddress?,
  sourceSpecific: InetAddress?,
  iface: String?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_join_multicast_group_ssm(this@joinMulticastGroupSsm,
      group?.reinterpret(), sourceSpecific?.reinterpret(), iface, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.leaveMulticastGroup(
  group: InetAddress?,
  sourceSpecific: Boolean,
  iface: String?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_leave_multicast_group(this@leaveMulticastGroup,
      group?.reinterpret(), sourceSpecific.toInt(), iface, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.leaveMulticastGroupSsm(
  group: InetAddress?,
  sourceSpecific: InetAddress?,
  iface: String?
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_leave_multicast_group_ssm(this@leaveMulticastGroupSsm,
      group?.reinterpret(), sourceSpecific?.reinterpret(), iface, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.listen(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_listen(this@listen, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.receive(
  buffer: Array<Byte>?,
  size: ULong,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = memScoped { g_socket_receive(this@receive, buffer?.toCArray(memScope), size,
      cancellable?.reinterpret(), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.receiveMessages(
  messages: Array<InputMessage>?,
  numMessages: UInt,
  flags: Int,
  cancellable: Cancellable?
): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = memScoped { g_socket_receive_messages(this@receiveMessages, messages?.map {
      it.pointed }?.toTypedArray()?.toCArray(memScope), numMessages, flags,
      cancellable?.reinterpret(), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.receiveWithBlocking(
  buffer: Array<Byte>?,
  size: ULong,
  blocking: Boolean,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = memScoped { g_socket_receive_with_blocking(this@receiveWithBlocking,
      buffer?.toCArray(memScope), size, blocking.toInt(), cancellable?.reinterpret(), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.send(
  buffer: String?,
  size: ULong,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_socket_send(this@send, buffer, size, cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.sendMessage(
  address: SocketAddress?,
  vectors: Array<OutputVector>?,
  numVectors: Int,
  messages: Array<SocketControlMessage>?,
  numMessages: Int,
  flags: Int,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = memScoped { g_socket_send_message(this@sendMessage, address?.reinterpret(),
      vectors?.map { it.pointed }?.toTypedArray()?.toCArray(memScope), numVectors,
      messages?.toCArray(memScope), numMessages, flags, cancellable?.reinterpret(), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.sendMessages(
  messages: Array<OutputMessage>?,
  numMessages: UInt,
  flags: Int,
  cancellable: Cancellable?
): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = memScoped { g_socket_send_messages(this@sendMessages, messages?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), numMessages, flags, cancellable?.reinterpret(), errors)
      }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.sendTo(
  address: SocketAddress?,
  buffer: String?,
  size: ULong,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_socket_send_to(this@sendTo, address?.reinterpret(), buffer, size,
      cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.sendWithBlocking(
  buffer: String?,
  size: ULong,
  blocking: Boolean,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_socket_send_with_blocking(this@sendWithBlocking, buffer, size,
      blocking.toInt(), cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.setOption(
  level: Int,
  optname: Int,
  `value`: Int
): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_set_option(this@setOption, level, optname, `value`,
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Socket.shutdown(shutdownRead: Boolean, shutdownWrite: Boolean): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_socket_shutdown(this@shutdown, shutdownRead.toInt(),
      shutdownWrite.toInt(), errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Socket.speaksIpv4(): Boolean = g_socket_speaks_ipv4(this@speaksIpv4).toBoolean()
