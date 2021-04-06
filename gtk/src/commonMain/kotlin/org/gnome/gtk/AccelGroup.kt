// TODO - implement:
//   activate
//   connect
//   connect_by_path
//   disconnect
//   disconnect_key
//   find
//   get_modifier_mask
//   lock
//   query
//   unlock
package org.gnome.gtk

import gtk3.GtkAccelGroup
import gtk3.gtk_accel_group_get_is_locked
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()

public val AccelGroup.isLocked: Boolean
  get() = gtk_accel_group_get_is_locked(this).toBoolean
