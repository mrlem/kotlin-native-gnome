@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectSkeleton
import interop.g_dbus_object_skeleton_add_interface
import interop.g_dbus_object_skeleton_flush
import interop.g_dbus_object_skeleton_new
import interop.g_dbus_object_skeleton_remove_interface
import interop.g_dbus_object_skeleton_remove_interface_by_name
import interop.g_dbus_object_skeleton_set_object_path
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DBusObjectSkeleton = CPointer<GDBusObjectSkeleton>

public val DBusObjectSkeleton.asObject: Object
  get() = reinterpret()

public object DBusObjectSkeletonFactory {
  public fun new(objectPath: String): DBusObjectSkeleton =
      g_dbus_object_skeleton_new(objectPath)!!.reinterpret()
}

public val DBusObjectSkeleton.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun DBusObjectSkeleton.addInterface(`interface`: DBusInterfaceSkeleton?): Unit {
  g_dbus_object_skeleton_add_interface(this, `interface`?.reinterpret())
}

public fun DBusObjectSkeleton.flush(): Unit {
  g_dbus_object_skeleton_flush(this)
}

public fun DBusObjectSkeleton.removeInterface(`interface`: DBusInterfaceSkeleton?): Unit {
  g_dbus_object_skeleton_remove_interface(this, `interface`?.reinterpret())
}

public fun DBusObjectSkeleton.removeInterfaceByName(interfaceName: String): Unit {
  g_dbus_object_skeleton_remove_interface_by_name(this, interfaceName)
}

public fun DBusObjectSkeleton.setObjectPath(objectPath: String): Unit {
  g_dbus_object_skeleton_set_object_path(this, objectPath)
}

public fun DBusObjectSkeleton.onAuthorizeMethod(callback: (DBusObjectSkeleton) -> Unit):
    DBusObjectSkeleton {
  // TODO - handle callback data

  asObject.connect("authorize-method") { callback(this) }
  return this
}
