// TODO - implement:
//   activate
//   connect
//   connect_by_path
//   disconnect
//   disconnect_key
//   find
//   get_is_locked
//   get_modifier_mask
//   lock
//   query
//   unlock
package org.gnome.gtk

import gtk3.GtkAccelGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias AccelGroup = CPointer<GtkAccelGroup>

public val AccelGroup.asObject: Object
  get() = reinterpret()
