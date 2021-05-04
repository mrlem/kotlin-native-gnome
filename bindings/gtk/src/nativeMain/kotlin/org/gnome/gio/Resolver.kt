// TODO - method: lookup_by_address_async
// TODO - method: lookup_by_name
// TODO - method: lookup_by_name_async
// TODO - method: lookup_by_name_finish
// TODO - method: lookup_by_name_with_flags
// TODO - method: lookup_by_name_with_flags_async
// TODO - method: lookup_by_name_with_flags_finish
// TODO - method: lookup_records
// TODO - method: lookup_records_async
// TODO - method: lookup_records_finish
// TODO - method: lookup_service
// TODO - method: lookup_service_async
// TODO - method: lookup_service_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GResolver
import interop.g_resolver_lookup_by_address
import interop.g_resolver_lookup_by_address_finish
import interop.g_resolver_set_default
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Resolver = CPointer<GResolver>

public val Resolver.asObject: Object
  get() = reinterpret()

public val Resolver.parentInstance: Object
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun Resolver.lookupByAddress(address: InetAddress?, cancellable: Cancellable?): String? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: String? = g_resolver_lookup_by_address(this@lookupByAddress, address?.reinterpret(),
      cancellable?.reinterpret(), errors).toKString()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupByAddressFinish(result: AsyncResult?): String? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: String? = g_resolver_lookup_by_address_finish(this@lookupByAddressFinish,
      result?.reinterpret(), errors).toKString()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Resolver.setDefault(): Unit {
  g_resolver_set_default(this@setDefault)
}

public fun Resolver.onReload(callback: (Resolver) -> Unit): Resolver {
  // TODO - handle callback data

  asObject.connect("reload") { callback(this) }
  return this
}
