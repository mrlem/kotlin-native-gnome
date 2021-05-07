@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectManagerServer
import interop.g_dbus_object_manager_server_export
import interop.g_dbus_object_manager_server_export_uniquely
import interop.g_dbus_object_manager_server_get_connection
import interop.g_dbus_object_manager_server_is_exported
import interop.g_dbus_object_manager_server_new
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
import org.mrlem.gnome.toBoolean

public typealias DBusObjectManagerServer = CPointer<GDBusObjectManagerServer>

public val DBusObjectManagerServer.asObject: Object
  get() = reinterpret()

public object DBusObjectManagerServerFactory {
  public fun new(objectPath: String?): DBusObjectManagerServer =
      g_dbus_object_manager_server_new(objectPath)!!.reinterpret()
}

public val DBusObjectManagerServer.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var DBusObjectManagerServer.connection: DBusConnection?
  get() = g_dbus_object_manager_server_get_connection(this)?.reinterpret()
  set(`value`) {
    g_dbus_object_manager_server_set_connection(this@connection, `value`)
  }

public fun DBusObjectManagerServer.export(`object`: DBusObjectSkeleton?): Unit {
  g_dbus_object_manager_server_export(this@export, `object`?.reinterpret())
}

public fun DBusObjectManagerServer.exportUniquely(`object`: DBusObjectSkeleton?): Unit {
  g_dbus_object_manager_server_export_uniquely(this@exportUniquely, `object`?.reinterpret())
}

public fun DBusObjectManagerServer.isExported(`object`: DBusObjectSkeleton?): Boolean =
    g_dbus_object_manager_server_is_exported(this@isExported, `object`?.reinterpret()).toBoolean()

public fun DBusObjectManagerServer.unexport(objectPath: String?): Boolean =
    g_dbus_object_manager_server_unexport(this@unexport, objectPath).toBoolean()
