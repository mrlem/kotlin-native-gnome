// TODO - implement:
//   activate
//   connect
//   connect_by_path
//   disconnect
//   disconnect_key
//   find
//   query
package org.gnome.gtk

import gtk3.GtkAccelGroup
import gtk3.gtk_accel_group_get_is_locked
import gtk3.gtk_accel_group_get_modifier_mask
import gtk3.gtk_accel_group_lock
import gtk3.gtk_accel_group_unlock
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()

public fun AccelGroup.getModifierMask(): Unit {
  gtk_accel_group_get_modifier_mask(this)
}

public fun AccelGroup.lock(): Unit {
  gtk_accel_group_lock(this)
}

public fun AccelGroup.unlock(): Unit {
  gtk_accel_group_unlock(this)
}

public val AccelGroup.isLocked: Boolean
  get() = gtk_accel_group_get_is_locked(this).toBoolean
