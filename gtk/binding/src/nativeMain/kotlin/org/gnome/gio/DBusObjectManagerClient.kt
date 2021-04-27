// TODO - constructor: new_finish
// TODO - constructor: new_for_bus_finish
// TODO - constructor: new_for_bus_sync
// TODO - constructor: new_sync
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectManagerClient
import interop.g_dbus_object_manager_client_get_connection
import interop.g_dbus_object_manager_client_get_flags
import interop.g_dbus_object_manager_client_get_name
import interop.g_dbus_object_manager_client_get_name_owner
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusObjectManagerClient = CPointer<GDBusObjectManagerClient>

public val DBusObjectManagerClient.asObject: Object
  get() = reinterpret()

public object DBusObjectManagerClientFactory

public val DBusObjectManagerClient.connection: DBusConnection?
  get() = g_dbus_object_manager_client_get_connection(this)?.reinterpret()

public val DBusObjectManagerClient.flags: DBusObjectManagerClientFlags
  get() = g_dbus_object_manager_client_get_flags(this)

public val DBusObjectManagerClient.name: String
  get() = g_dbus_object_manager_client_get_name(this).toKString

public val DBusObjectManagerClient.nameOwner: String
  get() = g_dbus_object_manager_client_get_name_owner(this).toKString

public
    fun DBusObjectManagerClient.onInterfaceProxyPropertiesChanged(callback: (DBusObjectManagerClient) ->
    Unit): DBusObjectManagerClient {
  // TODO - handle callback data

  asObject.connect("interface-proxy-properties-changed") { callback(this) }
  return this
}

public fun DBusObjectManagerClient.onInterfaceProxySignal(callback: (DBusObjectManagerClient) ->
    Unit): DBusObjectManagerClient {
  // TODO - handle callback data

  asObject.connect("interface-proxy-signal") { callback(this) }
  return this
}
