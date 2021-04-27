// TODO - constructor: new
// TODO - method: add_interface
// TODO - method: remove_interface
// TODO - method: remove_interface_by_name
// TODO - method: set_object_path
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusObjectSkeleton
import interop.g_dbus_object_skeleton_flush
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DBusObjectSkeleton = CPointer<GDBusObjectSkeleton>

public val DBusObjectSkeleton.asObject: Object
  get() = reinterpret()

public object DBusObjectSkeletonFactory

public fun DBusObjectSkeleton.flush(): Unit {
  g_dbus_object_skeleton_flush(this)
}

public fun DBusObjectSkeleton.onAuthorizeMethod(callback: (DBusObjectSkeleton) -> Unit):
    DBusObjectSkeleton {
  // TODO - handle callback data

  asObject.connect("authorize-method") { callback(this) }
  return this
}
