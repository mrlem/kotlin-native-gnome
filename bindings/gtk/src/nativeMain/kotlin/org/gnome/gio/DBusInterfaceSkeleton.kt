// TODO - method: get_connections (return type)
// TODO - method: get_properties (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusInterfaceSkeleton
import interop.GError
import interop.g_dbus_interface_skeleton_export
import interop.g_dbus_interface_skeleton_flush
import interop.g_dbus_interface_skeleton_get_connection
import interop.g_dbus_interface_skeleton_get_flags
import interop.g_dbus_interface_skeleton_get_info
import interop.g_dbus_interface_skeleton_get_object_path
import interop.g_dbus_interface_skeleton_has_connection
import interop.g_dbus_interface_skeleton_set_flags
import interop.g_dbus_interface_skeleton_unexport
import interop.g_dbus_interface_skeleton_unexport_from_connection
import kotlin.Boolean
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusInterfaceSkeleton = CPointer<GDBusInterfaceSkeleton>

public val DBusInterfaceSkeleton.asObject: Object
  get() = reinterpret()

public val DBusInterfaceSkeleton.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val DBusInterfaceSkeleton.connection: DBusConnection?
  get() = g_dbus_interface_skeleton_get_connection(this)?.reinterpret()

public var DBusInterfaceSkeleton.flags: DBusInterfaceSkeletonFlags
  get() = g_dbus_interface_skeleton_get_flags(this)
  set(`value`) {
    g_dbus_interface_skeleton_set_flags(this@flags, `value`)
  }

public val DBusInterfaceSkeleton.info: DBusInterfaceInfo?
  get() = g_dbus_interface_skeleton_get_info(this)?.reinterpret()

public val DBusInterfaceSkeleton.objectPath: String?
  get() = g_dbus_interface_skeleton_get_object_path(this).toKString()

@Throws(Error::class)
public fun DBusInterfaceSkeleton.export(connection: DBusConnection?, objectPath: String?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_interface_skeleton_export(this@export, connection?.reinterpret(),
      objectPath, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun DBusInterfaceSkeleton.flush(): Unit {
  g_dbus_interface_skeleton_flush(this@flush)
}

public fun DBusInterfaceSkeleton.hasConnection(connection: DBusConnection?): Boolean =
    g_dbus_interface_skeleton_has_connection(this@hasConnection,
    connection?.reinterpret()).toBoolean()

public fun DBusInterfaceSkeleton.unexport(): Unit {
  g_dbus_interface_skeleton_unexport(this@unexport)
}

public fun DBusInterfaceSkeleton.unexportFromConnection(connection: DBusConnection?): Unit {
  g_dbus_interface_skeleton_unexport_from_connection(this@unexportFromConnection,
      connection?.reinterpret())
}

public fun DBusInterfaceSkeleton.onGAuthorizeMethod(callback: (DBusInterfaceSkeleton) -> Unit):
    DBusInterfaceSkeleton {
  // TODO - handle callback data

  asObject.connect("g-authorize-method") { callback(this) }
  return this
}
