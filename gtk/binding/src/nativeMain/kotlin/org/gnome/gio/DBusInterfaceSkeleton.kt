// TODO - method: export
// TODO - method: get_connections
// TODO - method: get_properties
// TODO - method: has_connection
// TODO - method: unexport_from_connection
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusInterfaceSkeleton
import interop.g_dbus_interface_skeleton_flush
import interop.g_dbus_interface_skeleton_get_connection
import interop.g_dbus_interface_skeleton_get_flags
import interop.g_dbus_interface_skeleton_get_info
import interop.g_dbus_interface_skeleton_get_object_path
import interop.g_dbus_interface_skeleton_set_flags
import interop.g_dbus_interface_skeleton_unexport
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusInterfaceSkeleton = CPointer<GDBusInterfaceSkeleton>

public val DBusInterfaceSkeleton.asObject: Object
  get() = reinterpret()

public val DBusInterfaceSkeleton.connection: DBusConnection?
  get() = g_dbus_interface_skeleton_get_connection(this)?.reinterpret()

public var DBusInterfaceSkeleton.flags: DBusInterfaceSkeletonFlags
  get() = g_dbus_interface_skeleton_get_flags(this)
  set(`value`) {
    g_dbus_interface_skeleton_set_flags(this, value)
  }

public val DBusInterfaceSkeleton.info: DBusInterfaceInfo?
  get() = g_dbus_interface_skeleton_get_info(this)?.reinterpret()

public val DBusInterfaceSkeleton.objectPath: String
  get() = g_dbus_interface_skeleton_get_object_path(this).toKString

public fun DBusInterfaceSkeleton.flush(): Unit {
  g_dbus_interface_skeleton_flush(this)
}

public fun DBusInterfaceSkeleton.unexport(): Unit {
  g_dbus_interface_skeleton_unexport(this)
}

public fun DBusInterfaceSkeleton.onGAuthorizeMethod(callback: (DBusInterfaceSkeleton) -> Unit):
    DBusInterfaceSkeleton {
  // TODO - handle callback data

  asObject.connect("g-authorize-method") { callback(this) }
  return this
}
