// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectProxy
import interop.g_dbus_object_proxy_get_connection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DBusObjectProxy = CPointer<GDBusObjectProxy>

public val DBusObjectProxy.asObject: Object
  get() = reinterpret()

public object DBusObjectProxyFactory

public val DBusObjectProxy.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val DBusObjectProxy.connection: DBusConnection?
  get() = g_dbus_object_proxy_get_connection(this)?.reinterpret()
