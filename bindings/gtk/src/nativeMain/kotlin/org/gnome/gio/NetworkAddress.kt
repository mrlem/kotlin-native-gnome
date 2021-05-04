@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNetworkAddress
import interop.g_network_address_get_hostname
import interop.g_network_address_get_port
import interop.g_network_address_get_scheme
import interop.g_network_address_new
import interop.g_network_address_new_loopback
import kotlin.String
import kotlin.UShort
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias NetworkAddress = CPointer<GNetworkAddress>

public val NetworkAddress.asObject: Object
  get() = reinterpret()

public object NetworkAddressFactory {
  public fun new(hostname: String?, port: UShort): NetworkAddress = g_network_address_new(hostname,
      port)!!.reinterpret()

  public fun newLoopback(port: UShort): NetworkAddress =
      g_network_address_new_loopback(port)!!.reinterpret()
}

public val NetworkAddress.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val NetworkAddress.hostname: String?
  get() = g_network_address_get_hostname(this).toKString()

public val NetworkAddress.port: UShort
  get() = g_network_address_get_port(this)

public val NetworkAddress.scheme: String?
  get() = g_network_address_get_scheme(this).toKString()
