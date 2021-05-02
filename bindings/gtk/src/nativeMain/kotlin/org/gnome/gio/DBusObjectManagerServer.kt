// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectManagerServer
import interop.g_dbus_object_manager_server_export
import interop.g_dbus_object_manager_server_export_uniquely
import interop.g_dbus_object_manager_server_get_connection
import interop.g_dbus_object_manager_server_is_exported
import interop.g_dbus_object_manager_server_set_connection
import interop.g_dbus_object_manager_server_unexport
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias DBusObjectManagerServer = CPointer<GDBusObjectManagerServer>

public val DBusObjectManagerServer.asObject: Object
  get() = reinterpret()

public object DBusObjectManagerServerFactory

public val DBusObjectManagerServer.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var DBusObjectManagerServer.connection: DBusConnection?
  get() = g_dbus_object_manager_server_get_connection(this)?.reinterpret()
  set(`value`) {
    g_dbus_object_manager_server_set_connection(this, `value`)
  }

public fun DBusObjectManagerServer.export(`object`: DBusObjectSkeleton?): Unit {
  g_dbus_object_manager_server_export(this, `object`?.reinterpret())
}

public fun DBusObjectManagerServer.exportUniquely(`object`: DBusObjectSkeleton?): Unit {
  g_dbus_object_manager_server_export_uniquely(this, `object`?.reinterpret())
}

public fun DBusObjectManagerServer.isExported(`object`: DBusObjectSkeleton?): Boolean =
    g_dbus_object_manager_server_is_exported(this, `object`?.reinterpret()).toBoolean

public fun DBusObjectManagerServer.unexport(objectPath: String): Boolean =
    g_dbus_object_manager_server_unexport(this, objectPath).toBoolean
