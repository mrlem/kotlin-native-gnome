// TODO - method: next_async
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSocketAddressEnumerator
import interop.g_socket_address_enumerator_next
import interop.g_socket_address_enumerator_next_finish
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object

public typealias SocketAddressEnumerator = CPointer<GSocketAddressEnumerator>

public val SocketAddressEnumerator.asObject: Object
  get() = reinterpret()

public val SocketAddressEnumerator.parentInstance: Object
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun SocketAddressEnumerator.next(cancellable: Cancellable?): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_address_enumerator_next(this@next,
      cancellable?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun SocketAddressEnumerator.nextFinish(result: AsyncResult?): SocketAddress? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: SocketAddress? = g_socket_address_enumerator_next_finish(this@nextFinish,
      result?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
