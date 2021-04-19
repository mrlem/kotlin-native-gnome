// TODO - get_modifier_mask
// TODO - activate
// TODO - connect
// TODO - connect_by_path
// TODO - disconnect
// TODO - disconnect_key
// TODO - find
// TODO - get_modifier_mask
// TODO - query
//
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
