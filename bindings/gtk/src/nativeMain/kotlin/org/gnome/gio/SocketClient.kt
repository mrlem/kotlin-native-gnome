// TODO - method: add_application_proxy
// TODO - method: connect
// TODO - method: connect_async
// TODO - method: connect_finish
// TODO - method: connect_to_host
// TODO - method: connect_to_host_async
// TODO - method: connect_to_host_finish
// TODO - method: connect_to_service
// TODO - method: connect_to_service_async
// TODO - method: connect_to_service_finish
// TODO - method: connect_to_uri
// TODO - method: connect_to_uri_async
// TODO - method: connect_to_uri_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketClient
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
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
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
  get() = g_socket_client_get_enable_proxy(this).toBoolean
  set(`value`) {
    g_socket_client_set_enable_proxy(this, `value`.toInt)
  }

public var SocketClient.family: SocketFamily
  get() = g_socket_client_get_family(this)
  set(`value`) {
    g_socket_client_set_family(this, `value`)
  }

public var SocketClient.localAddress: SocketAddress?
  get() = g_socket_client_get_local_address(this)?.reinterpret()
  set(`value`) {
    g_socket_client_set_local_address(this, `value`)
  }

public var SocketClient.protocol: SocketProtocol
  get() = g_socket_client_get_protocol(this)
  set(`value`) {
    g_socket_client_set_protocol(this, `value`)
  }

public var SocketClient.proxyResolver: ProxyResolver?
  get() = g_socket_client_get_proxy_resolver(this)?.reinterpret()
  set(`value`) {
    g_socket_client_set_proxy_resolver(this, `value`)
  }

public var SocketClient.socketType: SocketType
  get() = g_socket_client_get_socket_type(this)
  set(`value`) {
    g_socket_client_set_socket_type(this, `value`)
  }

public var SocketClient.timeout: UInt
  get() = g_socket_client_get_timeout(this)
  set(`value`) {
    g_socket_client_set_timeout(this, `value`)
  }

public var SocketClient.tls: Boolean
  get() = g_socket_client_get_tls(this).toBoolean
  set(`value`) {
    g_socket_client_set_tls(this, `value`.toInt)
  }

public var SocketClient.tlsValidationFlags: TlsCertificateFlags
  get() = g_socket_client_get_tls_validation_flags(this)
  set(`value`) {
    g_socket_client_set_tls_validation_flags(this, `value`)
  }

public fun SocketClient.onEvent(callback: (SocketClient) -> Unit): SocketClient {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
