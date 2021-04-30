// TODO - method: set_default_proxy
// TODO - method: set_ignore_hosts
// TODO - method: set_uri_proxy
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleProxyResolver
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimpleProxyResolver = CPointer<GSimpleProxyResolver>

public val SimpleProxyResolver.asObject: Object
  get() = reinterpret()

public val SimpleProxyResolver.parentInstance: Object
  get() = pointed.parent_instance.ptr
