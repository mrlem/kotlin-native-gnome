@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleProxyResolver
import interop.g_simple_proxy_resolver_set_default_proxy
import interop.g_simple_proxy_resolver_set_ignore_hosts
import interop.g_simple_proxy_resolver_set_uri_proxy
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toCArray

public typealias SimpleProxyResolver = CPointer<GSimpleProxyResolver>

public val SimpleProxyResolver.asObject: Object
  get() = reinterpret()

public val SimpleProxyResolver.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun SimpleProxyResolver.setDefaultProxy(defaultProxy: String?): Unit {
  g_simple_proxy_resolver_set_default_proxy(this@setDefaultProxy, defaultProxy)
}

public fun SimpleProxyResolver.setIgnoreHosts(ignoreHosts: Array<String>?): Unit {
  memScoped { g_simple_proxy_resolver_set_ignore_hosts(this@setIgnoreHosts,
      ignoreHosts?.toCArray(memScope)) }
}

public fun SimpleProxyResolver.setUriProxy(uriScheme: String?, proxy: String?): Unit {
  g_simple_proxy_resolver_set_uri_proxy(this@setUriProxy, uriScheme, proxy)
}
