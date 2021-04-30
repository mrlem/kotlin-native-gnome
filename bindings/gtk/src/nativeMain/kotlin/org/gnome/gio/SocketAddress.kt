// TODO - constructor: new_from_native
// TODO - method: to_native
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketAddress
import interop.g_socket_address_get_family
import interop.g_socket_address_get_native_size
import kotlin.Long
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SocketAddress = CPointer<GSocketAddress>

public val SocketAddress.asObject: Object
  get() = reinterpret()

public object SocketAddressFactory

public val SocketAddress.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val SocketAddress.family: SocketFamily
  get() = g_socket_address_get_family(this)

public val SocketAddress.nativeSize: Long
  get() = g_socket_address_get_native_size(this)
