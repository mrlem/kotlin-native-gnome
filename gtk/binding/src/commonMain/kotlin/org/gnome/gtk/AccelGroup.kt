// TODO - method: activate
// TODO - method: connect
// TODO - method: connect_by_path
// TODO - method: disconnect
// TODO - method: disconnect_key
// TODO - method: find
// TODO - method: get_modifier_mask
// TODO - method: query
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkAccelGroup
import gtk3.gtk_accel_group_get_is_locked
import gtk3.gtk_accel_group_lock
import gtk3.gtk_accel_group_unlock
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()

public val AccelGroup.isLocked: Boolean
  get() = gtk_accel_group_get_is_locked(this).toBoolean

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
