// TODO - constructor: new
// TODO - constructor: new_abstract
// TODO - constructor: new_with_type
// TODO - method: get_is_abstract
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixSocketAddress
import interop.g_unix_socket_address_get_address_type
import interop.g_unix_socket_address_get_path
import interop.g_unix_socket_address_get_path_len
import kotlin.String
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias UnixSocketAddress = CPointer<GUnixSocketAddress>

public val UnixSocketAddress.asObject: Object
  get() = reinterpret()

public val UnixSocketAddress.asSocketAddress: SocketAddress
  get() = reinterpret()

public object UnixSocketAddressFactory

public val UnixSocketAddress.parentInstance: SocketAddress
  get() = pointed.parent_instance.ptr

public val UnixSocketAddress.addressType: UnixSocketAddressType
  get() = g_unix_socket_address_get_address_type(this)

public val UnixSocketAddress.path: String
  get() = g_unix_socket_address_get_path(this).toKString

public val UnixSocketAddress.pathLen: ULong
  get() = g_unix_socket_address_get_path_len(this)
