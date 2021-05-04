// TODO - constructor: new
// TODO - constructor: new_from_string
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GInetAddressMask
import interop.g_inet_address_mask_equal
import interop.g_inet_address_mask_get_address
import interop.g_inet_address_mask_get_family
import interop.g_inet_address_mask_get_length
import interop.g_inet_address_mask_matches
import interop.g_inet_address_mask_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias InetAddressMask = CPointer<GInetAddressMask>

public val InetAddressMask.asObject: Object
  get() = reinterpret()

public object InetAddressMaskFactory

public val InetAddressMask.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val InetAddressMask.address: InetAddress?
  get() = g_inet_address_mask_get_address(this)?.reinterpret()

public val InetAddressMask.family: SocketFamily
  get() = g_inet_address_mask_get_family(this)

public val InetAddressMask.length: UInt
  get() = g_inet_address_mask_get_length(this)

public fun InetAddressMask.equal(mask2: InetAddressMask?): Boolean =
    g_inet_address_mask_equal(this@equal, mask2?.reinterpret()).toBoolean()

public fun InetAddressMask.matches(address: InetAddress?): Boolean =
    g_inet_address_mask_matches(this@matches, address?.reinterpret()).toBoolean()

public fun InetAddressMask.toString(): String? =
    g_inet_address_mask_to_string(this@toString).toKString()
