// TODO - method: activate (param type)
// TODO - method: find (param type)
// TODO - method: query (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAccelGroup
import interop.gtk_accel_group_connect
import interop.gtk_accel_group_connect_by_path
import interop.gtk_accel_group_disconnect
import interop.gtk_accel_group_disconnect_key
import interop.gtk_accel_group_get_is_locked
import interop.gtk_accel_group_get_modifier_mask
import interop.gtk_accel_group_lock
import interop.gtk_accel_group_new
import interop.gtk_accel_group_unlock
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.ModifierType
import org.gnome.gobject.Closure
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()

public object AccelGroupFactory {
  public fun new(): AccelGroup = gtk_accel_group_new()!!.reinterpret()
}

public val AccelGroup.parent: Object
  get() = pointed.parent.ptr

public val AccelGroup.isLocked: Boolean
  get() = gtk_accel_group_get_is_locked(this).toBoolean()

public val AccelGroup.modifierMask: ModifierType
  get() = gtk_accel_group_get_modifier_mask(this)

public fun AccelGroup.connect(
  accelKey: UInt,
  accelMods: ModifierType,
  accelFlags: AccelFlags,
  closure: Closure?
): Unit {
  gtk_accel_group_connect(this@connect, accelKey, accelMods, accelFlags, closure?.reinterpret())
}

public fun AccelGroup.connectByPath(accelPath: String?, closure: Closure?): Unit {
  gtk_accel_group_connect_by_path(this@connectByPath, accelPath, closure?.reinterpret())
}

public fun AccelGroup.disconnect(closure: Closure?): Boolean =
    gtk_accel_group_disconnect(this@disconnect, closure?.reinterpret()).toBoolean()

public fun AccelGroup.disconnectKey(accelKey: UInt, accelMods: ModifierType): Boolean =
    gtk_accel_group_disconnect_key(this@disconnectKey, accelKey, accelMods).toBoolean()

public fun AccelGroup.lock(): Unit {
  gtk_accel_group_lock(this@lock)
}

public fun AccelGroup.unlock(): Unit {
  gtk_accel_group_unlock(this@unlock)
}

public fun AccelGroup.onAccelActivate(callback: (AccelGroup) -> Unit): AccelGroup {
  // TODO - handle callback data

  asObject.connect("accel-activate") { callback(this) }
  return this
}

public fun AccelGroup.onAccelChanged(callback: (AccelGroup) -> Unit): AccelGroup {
  // TODO - handle callback data

  asObject.connect("accel-changed") { callback(this) }
  return this
}
