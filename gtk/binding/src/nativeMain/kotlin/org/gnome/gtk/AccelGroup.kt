// TODO - method: activate
// TODO - method: connect
// TODO - method: disconnect_key
// TODO - method: find
// TODO - method: get_modifier_mask
// TODO - method: query
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAccelGroup
import interop.gtk_accel_group_connect_by_path
import interop.gtk_accel_group_disconnect
import interop.gtk_accel_group_get_is_locked
import interop.gtk_accel_group_lock
import interop.gtk_accel_group_new
import interop.gtk_accel_group_unlock
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Closure
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()

public object AccelGroupFactory {
  public fun new(): AccelGroup = gtk_accel_group_new()!!.reinterpret()
}

public val AccelGroup.isLocked: Boolean
  get() = gtk_accel_group_get_is_locked(this).toBoolean

public fun AccelGroup.connectByPath(accelPath: String, closure: Closure?): Unit {
  gtk_accel_group_connect_by_path(this, accelPath, closure?.reinterpret())
}

public fun AccelGroup.disconnect(closure: Closure?): Boolean = gtk_accel_group_disconnect(this,
    closure?.reinterpret()).toBoolean

public fun AccelGroup.lock(): Unit {
  gtk_accel_group_lock(this)
}

public fun AccelGroup.unlock(): Unit {
  gtk_accel_group_unlock(this)
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
