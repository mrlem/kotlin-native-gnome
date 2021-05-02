// TODO - constructor: new_from_bytes
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GInetAddress
import interop.g_inet_address_equal
import interop.g_inet_address_get_family
import interop.g_inet_address_get_is_any
import interop.g_inet_address_get_is_link_local
import interop.g_inet_address_get_is_loopback
import interop.g_inet_address_get_is_mc_global
import interop.g_inet_address_get_is_mc_link_local
import interop.g_inet_address_get_is_mc_node_local
import interop.g_inet_address_get_is_mc_org_local
import interop.g_inet_address_get_is_mc_site_local
import interop.g_inet_address_get_is_multicast
import interop.g_inet_address_get_is_site_local
import interop.g_inet_address_get_native_size
import interop.g_inet_address_new_any
import interop.g_inet_address_new_from_string
import interop.g_inet_address_new_loopback
import interop.g_inet_address_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias InetAddress = CPointer<GInetAddress>

public val InetAddress.asObject: Object
  get() = reinterpret()

public object InetAddressFactory {
  public fun newAny(family: SocketFamily): InetAddress =
      g_inet_address_new_any(family)!!.reinterpret()

  public fun newFromString(string: String): InetAddress =
      g_inet_address_new_from_string(string)!!.reinterpret()

  public fun newLoopback(family: SocketFamily): InetAddress =
      g_inet_address_new_loopback(family)!!.reinterpret()
}

public val InetAddress.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val InetAddress.family: SocketFamily
  get() = g_inet_address_get_family(this)

public val InetAddress.isAny: Boolean
  get() = g_inet_address_get_is_any(this).toBoolean()

public val InetAddress.isLinkLocal: Boolean
  get() = g_inet_address_get_is_link_local(this).toBoolean()

public val InetAddress.isLoopback: Boolean
  get() = g_inet_address_get_is_loopback(this).toBoolean()

public val InetAddress.isMcGlobal: Boolean
  get() = g_inet_address_get_is_mc_global(this).toBoolean()

public val InetAddress.isMcLinkLocal: Boolean
  get() = g_inet_address_get_is_mc_link_local(this).toBoolean()

public val InetAddress.isMcNodeLocal: Boolean
  get() = g_inet_address_get_is_mc_node_local(this).toBoolean()

public val InetAddress.isMcOrgLocal: Boolean
  get() = g_inet_address_get_is_mc_org_local(this).toBoolean()

public val InetAddress.isMcSiteLocal: Boolean
  get() = g_inet_address_get_is_mc_site_local(this).toBoolean()

public val InetAddress.isMulticast: Boolean
  get() = g_inet_address_get_is_multicast(this).toBoolean()

public val InetAddress.isSiteLocal: Boolean
  get() = g_inet_address_get_is_site_local(this).toBoolean()

public val InetAddress.nativeSize: ULong
  get() = g_inet_address_get_native_size(this)

public fun InetAddress.equal(otherAddress: InetAddress?): Boolean = g_inet_address_equal(this,
    otherAddress?.reinterpret()).toBoolean()

public fun InetAddress.toString(): String = g_inet_address_to_string(this).toKString()
