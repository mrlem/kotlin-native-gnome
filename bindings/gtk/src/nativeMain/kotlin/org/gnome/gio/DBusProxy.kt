// TODO - constructor: new_finish
// TODO - constructor: new_for_bus_finish
// TODO - constructor: new_for_bus_sync
// TODO - constructor: new_sync
// TODO - method: call
// TODO - method: call_finish
// TODO - method: call_sync
// TODO - method: call_with_unix_fd_list
// TODO - method: call_with_unix_fd_list_finish
// TODO - method: call_with_unix_fd_list_sync
// TODO - method: get_cached_property
// TODO - method: set_cached_property
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusProxy
import interop.g_dbus_proxy_get_cached_property_names
import interop.g_dbus_proxy_get_connection
import interop.g_dbus_proxy_get_default_timeout
import interop.g_dbus_proxy_get_flags
import interop.g_dbus_proxy_get_interface_info
import interop.g_dbus_proxy_get_interface_name
import interop.g_dbus_proxy_get_name
import interop.g_dbus_proxy_get_name_owner
import interop.g_dbus_proxy_get_object_path
import interop.g_dbus_proxy_set_default_timeout
import interop.g_dbus_proxy_set_interface_info
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKArray
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusProxy = CPointer<GDBusProxy>

public val DBusProxy.asObject: Object
  get() = reinterpret()

public object DBusProxyFactory

public val DBusProxy.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val DBusProxy.cachedPropertyNames: Array<String>?
  get() = g_dbus_proxy_get_cached_property_names(this)?.toKArray { it.toKString()!! }

public val DBusProxy.connection: DBusConnection?
  get() = g_dbus_proxy_get_connection(this)?.reinterpret()

public var DBusProxy.defaultTimeout: Int
  get() = g_dbus_proxy_get_default_timeout(this)
  set(`value`) {
    g_dbus_proxy_set_default_timeout(this@defaultTimeout, `value`)
  }

public val DBusProxy.flags: DBusProxyFlags
  get() = g_dbus_proxy_get_flags(this)

public var DBusProxy.interfaceInfo: DBusInterfaceInfo?
  get() = g_dbus_proxy_get_interface_info(this)?.reinterpret()
  set(`value`) {
    g_dbus_proxy_set_interface_info(this@interfaceInfo, `value`)
  }

public val DBusProxy.interfaceName: String?
  get() = g_dbus_proxy_get_interface_name(this).toKString()

public val DBusProxy.name: String?
  get() = g_dbus_proxy_get_name(this).toKString()

public val DBusProxy.nameOwner: String?
  get() = g_dbus_proxy_get_name_owner(this).toKString()

public val DBusProxy.objectPath: String?
  get() = g_dbus_proxy_get_object_path(this).toKString()

public fun DBusProxy.onGPropertiesChanged(callback: (DBusProxy) -> Unit): DBusProxy {
  // TODO - handle callback data

  asObject.connect("g-properties-changed") { callback(this) }
  return this
}

public fun DBusProxy.onGSignal(callback: (DBusProxy) -> Unit): DBusProxy {
  // TODO - handle callback data

  asObject.connect("g-signal") { callback(this) }
  return this
}
