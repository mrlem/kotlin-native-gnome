// TODO - method: connect_async (param type)
// TODO - method: connect_to_host_async (param type)
// TODO - method: connect_to_service_async (param type)
// TODO - method: connect_to_uri_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocketClient
import interop.g_socket_client_add_application_proxy
import interop.g_socket_client_connect
import interop.g_socket_client_connect_finish
import interop.g_socket_client_connect_to_host
import interop.g_socket_client_connect_to_host_finish
import interop.g_socket_client_connect_to_service
import interop.g_socket_client_connect_to_service_finish
import interop.g_socket_client_connect_to_uri
import interop.g_socket_client_connect_to_uri_finish
import interop.g_socket_client_get_enable_proxy
import interop.g_socket_client_get_family
import interop.g_socket_client_get_local_address
import interop.g_socket_client_get_protocol
import interop.g_socket_client_get_proxy_resolver
import interop.g_socket_client_get_socket_type
import interop.g_socket_client_get_timeout
import interop.g_socket_client_get_tls
import interop.g_socket_client_get_tls_validation_flags
import interop.g_socket_client_new
import interop.g_socket_client_set_enable_proxy
import interop.g_socket_client_set_family
import interop.g_socket_client_set_local_address
import interop.g_socket_client_set_protocol
import interop.g_socket_client_set_proxy_resolver
import interop.g_socket_client_set_socket_type
import interop.g_socket_client_set_timeout
import interop.g_socket_client_set_tls
import interop.g_socket_client_set_tls_validation_flags
import kotlin.Boolean
import kotlin.String
import kotlin.Throws
import kotlin.UInt
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
import org.gnome.toInt
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.gobject.connect

public typealias SocketClient = CPointer<GSocketClient>

public val SocketClient.asObject: Object
  get() = reinterpret()

public object SocketClientFactory {
  public fun new(): SocketClient = g_socket_client_new()!!.reinterpret()
}

public val SocketClient.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var SocketClient.enableProxy: Boolean
  get() = g_socket_client_get_enable_proxy(this).toBoolean()
  set(`value`) {
    g_socket_client_set_enable_proxy(this@enableProxy, `value`.toInt())
  }

public var SocketClient.family: SocketFamily
  get() = g_socket_client_get_family(this)
  set(`value`) {
    g_socket_client_set_family(this@family, `value`)
  }

public var SocketClient.localAddress: SocketAddress?
  get() = g_socket_client_get_local_address(this)?.reinterpret()
  set(`value`) {
    g_socket_client_set_local_address(this@localAddress, `value`)
  }

public var SocketClient.protocol: SocketProtocol
  get() = g_socket_client_get_protocol(this)
  set(`value`) {
    g_socket_client_set_protocol(this@protocol, `value`)
  }

public var SocketClient.proxyResolver: ProxyResolver?
  get() = g_socket_client_get_proxy_resolver(this)?.reinterpret()
  set(`value`) {
    g_socket_client_set_proxy_resolver(this@proxyResolver, `value`)
  }

public var SocketClient.socketType: SocketType
  get() = g_socket_client_get_socket_type(this)
  set(`value`) {
    g_socket_client_set_socket_type(this@socketType, `value`)
  }

public var SocketClient.timeout: UInt
  get() = g_socket_client_get_timeout(this)
  set(`value`) {
    g_socket_client_set_timeout(this@timeout, `value`)
  }

public var SocketClient.tls: Boolean
  get() = g_socket_client_get_tls(this).toBoolean()
  set(`value`) {
    g_socket_client_set_tls(this@tls, `value`.toInt())
  }

public var SocketClient.tlsValidationFlags: TlsCertificateFlags
  get() = g_socket_client_get_tls_validation_flags(this)
  set(`value`) {
    g_socket_client_set_tls_validation_flags(this@tlsValidationFlags, `value`)
  }

public fun SocketClient.addApplicationProxy(protocol: String?): Unit {
  g_socket_client_add_application_proxy(this@addApplicationProxy, protocol)
}

@Throws(Error::class)
public fun SocketClient.connect(connectable: SocketConnectable?, cancellable: Cancellable?):
    SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect(this@connect, connectable?.reinterpret(),
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectFinish(result: AsyncResult?): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_finish(this@connectFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToHost(
  hostAndPort: String?,
  defaultPort: UShort,
  cancellable: Cancellable?
): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_to_host(this@connectToHost, hostAndPort,
      defaultPort, cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToHostFinish(result: AsyncResult?): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_to_host_finish(this@connectToHostFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToService(
  domain: String?,
  service: String?,
  cancellable: Cancellable?
): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_to_service(this@connectToService, domain,
      service, cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToServiceFinish(result: AsyncResult?): SocketConnection? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? =
      g_socket_client_connect_to_service_finish(this@connectToServiceFinish, result?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToUri(
  uri: String?,
  defaultPort: UShort,
  cancellable: Cancellable?
): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_to_uri(this@connectToUri, uri,
      defaultPort, cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketClient.connectToUriFinish(result: AsyncResult?): SocketConnection? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketConnection? = g_socket_client_connect_to_uri_finish(this@connectToUriFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun SocketClient.onEvent(callback: (SocketClient) -> Unit): SocketClient {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
