// TODO - method: lookup_by_address_async (param type)
// TODO - method: lookup_by_name_async (param type)
// TODO - method: lookup_by_name_with_flags_async (param type)
// TODO - method: lookup_records_async (param type)
// TODO - method: lookup_service_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GList
import interop.GResolver
import interop.g_resolver_lookup_by_address
import interop.g_resolver_lookup_by_address_finish
import interop.g_resolver_lookup_by_name
import interop.g_resolver_lookup_by_name_finish
import interop.g_resolver_lookup_by_name_with_flags
import interop.g_resolver_lookup_by_name_with_flags_finish
import interop.g_resolver_lookup_records
import interop.g_resolver_lookup_records_finish
import interop.g_resolver_lookup_service
import interop.g_resolver_lookup_service_finish
import interop.g_resolver_set_default
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toKList
import org.mrlem.gnome.toKString

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

@Throws(Error::class)
public fun Resolver.lookupByName(hostname: String?, cancellable: Cancellable?): List<InetAddress>? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<InetAddress>? = g_resolver_lookup_by_name(this@lookupByName, hostname,
      cancellable?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupByNameFinish(result: AsyncResult?): List<InetAddress>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<InetAddress>? = g_resolver_lookup_by_name_finish(this@lookupByNameFinish,
      result?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupByNameWithFlags(
  hostname: String?,
  flags: ResolverNameLookupFlags,
  cancellable: Cancellable?
): List<InetAddress>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<InetAddress>? = g_resolver_lookup_by_name_with_flags(this@lookupByNameWithFlags,
      hostname, flags, cancellable?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupByNameWithFlagsFinish(result: AsyncResult?): List<InetAddress>? =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<InetAddress>? =
      g_resolver_lookup_by_name_with_flags_finish(this@lookupByNameWithFlagsFinish,
      result?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupRecords(
  rrname: String?,
  recordType: ResolverRecordType,
  cancellable: Cancellable?
): List<Variant>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<Variant>? = g_resolver_lookup_records(this@lookupRecords, rrname, recordType,
      cancellable?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupRecordsFinish(result: AsyncResult?): List<Variant>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<Variant>? = g_resolver_lookup_records_finish(this@lookupRecordsFinish,
      result?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupService(
  service: String?,
  protocol: String?,
  domain: String?,
  cancellable: Cancellable?
): List<SrvTarget>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<SrvTarget>? = g_resolver_lookup_service(this@lookupService, service, protocol,
      domain, cancellable?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Resolver.lookupServiceFinish(result: AsyncResult?): List<SrvTarget>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<SrvTarget>? = g_resolver_lookup_service_finish(this@lookupServiceFinish,
      result?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
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
