@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GInetSocketAddress
import interop.g_inet_socket_address_get_address
import interop.g_inet_socket_address_get_flowinfo
import interop.g_inet_socket_address_get_port
import interop.g_inet_socket_address_get_scope_id
import interop.g_inet_socket_address_new
import interop.g_inet_socket_address_new_from_string
import kotlin.String
import kotlin.UInt
import kotlin.UShort
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias InetSocketAddress = CPointer<GInetSocketAddress>

public val InetSocketAddress.asObject: Object
  get() = reinterpret()

public val InetSocketAddress.asSocketAddress: SocketAddress
  get() = reinterpret()

public object InetSocketAddressFactory {
  public fun new(address: InetAddress?, port: UShort): InetSocketAddress =
      g_inet_socket_address_new(address?.reinterpret(), port)!!.reinterpret()

  public fun newFromString(address: String?, port: UInt): InetSocketAddress =
      g_inet_socket_address_new_from_string(address, port)!!.reinterpret()
}

public val InetSocketAddress.parentInstance: SocketAddress
  get() = pointed.parent_instance.ptr

public val InetSocketAddress.address: InetAddress?
  get() = g_inet_socket_address_get_address(this)?.reinterpret()

public val InetSocketAddress.flowinfo: UInt
  get() = g_inet_socket_address_get_flowinfo(this)

public val InetSocketAddress.port: UShort
  get() = g_inet_socket_address_get_port(this)

public val InetSocketAddress.scopeId: UInt
  get() = g_inet_socket_address_get_scope_id(this)
