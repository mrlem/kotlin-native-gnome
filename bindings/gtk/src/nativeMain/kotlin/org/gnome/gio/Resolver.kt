// TODO - method: lookup_by_address
// TODO - method: lookup_by_address_async
// TODO - method: lookup_by_address_finish
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

import interop.GResolver
import interop.g_resolver_set_default
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias Resolver = CPointer<GResolver>

public val Resolver.asObject: Object
  get() = reinterpret()

public val Resolver.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun Resolver.setDefault(): Unit {
  g_resolver_set_default(this)
}

public fun Resolver.onReload(callback: (Resolver) -> Unit): Resolver {
  // TODO - handle callback data

  asObject.connect("reload") { callback(this) }
  return this
}
