// TODO - constructor: new
// TODO - method: export
// TODO - method: export_uniquely
// TODO - method: is_exported
// TODO - method: unexport
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectManagerServer
import interop.g_dbus_object_manager_server_get_connection
import interop.g_dbus_object_manager_server_set_connection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias DBusObjectManagerServer = CPointer<GDBusObjectManagerServer>

public val DBusObjectManagerServer.asObject: Object
  get() = reinterpret()

public object DBusObjectManagerServerFactory

public var DBusObjectManagerServer.connection: DBusConnection?
  get() = g_dbus_object_manager_server_get_connection(this)?.reinterpret()
  set(`value`) {
    g_dbus_object_manager_server_set_connection(this, value)
  }
