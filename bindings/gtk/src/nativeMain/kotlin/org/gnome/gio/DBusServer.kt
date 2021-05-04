// TODO - constructor: new_sync
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusServer
import interop.g_dbus_server_get_client_address
import interop.g_dbus_server_get_flags
import interop.g_dbus_server_get_guid
import interop.g_dbus_server_is_active
import interop.g_dbus_server_start
import interop.g_dbus_server_stop
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusServer = CPointer<GDBusServer>

public val DBusServer.asObject: Object
  get() = reinterpret()

public object DBusServerFactory

public val DBusServer.clientAddress: String?
  get() = g_dbus_server_get_client_address(this).toKString()

public val DBusServer.flags: DBusServerFlags
  get() = g_dbus_server_get_flags(this)

public val DBusServer.guid: String?
  get() = g_dbus_server_get_guid(this).toKString()

public fun DBusServer.isActive(): Boolean = g_dbus_server_is_active(this@isActive).toBoolean()

public fun DBusServer.start(): Unit {
  g_dbus_server_start(this@start)
}

public fun DBusServer.stop(): Unit {
  g_dbus_server_stop(this@stop)
}

public fun DBusServer.onNewConnection(callback: (DBusServer) -> Unit): DBusServer {
  // TODO - handle callback data

  asObject.connect("new-connection") { callback(this) }
  return this
}
