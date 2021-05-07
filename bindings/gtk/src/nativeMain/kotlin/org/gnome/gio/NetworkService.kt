@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNetworkService
import interop.g_network_service_get_domain
import interop.g_network_service_get_protocol
import interop.g_network_service_get_scheme
import interop.g_network_service_get_service
import interop.g_network_service_new
import interop.g_network_service_set_scheme
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toKString

public typealias NetworkService = CPointer<GNetworkService>

public val NetworkService.asObject: Object
  get() = reinterpret()

public object NetworkServiceFactory {
  public fun new(
    service: String?,
    protocol: String?,
    domain: String?
  ): NetworkService = g_network_service_new(service, protocol, domain)!!.reinterpret()
}

public val NetworkService.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val NetworkService.domain: String?
  get() = g_network_service_get_domain(this).toKString()

public val NetworkService.protocol: String?
  get() = g_network_service_get_protocol(this).toKString()

public var NetworkService.scheme: String?
  get() = g_network_service_get_scheme(this).toKString()
  set(`value`) {
    g_network_service_set_scheme(this@scheme, `value`)
  }

public val NetworkService.service: String?
  get() = g_network_service_get_service(this).toKString()
