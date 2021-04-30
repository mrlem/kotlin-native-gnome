@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GProxyAddressEnumerator
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ProxyAddressEnumerator = CPointer<GProxyAddressEnumerator>

public val ProxyAddressEnumerator.asObject: Object
  get() = reinterpret()

public val ProxyAddressEnumerator.asSocketAddressEnumerator: SocketAddressEnumerator
  get() = reinterpret()

public val ProxyAddressEnumerator.parentInstance: SocketAddressEnumerator
  get() = pointed.parent_instance.ptr
