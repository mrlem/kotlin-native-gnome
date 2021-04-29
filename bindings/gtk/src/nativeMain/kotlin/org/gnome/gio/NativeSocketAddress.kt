// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNativeSocketAddress
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NativeSocketAddress = CPointer<GNativeSocketAddress>

public val NativeSocketAddress.asObject: Object
  get() = reinterpret()

public val NativeSocketAddress.asSocketAddress: SocketAddress
  get() = reinterpret()

public object NativeSocketAddressFactory
