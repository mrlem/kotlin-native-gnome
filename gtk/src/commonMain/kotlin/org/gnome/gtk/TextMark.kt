// TODO - implement:
//   get_buffer
//   get_deleted
//   get_left_gravity
//   get_name
//   get_visible
//   set_visible
package org.gnome.gtk

import gtk3.GtkTextMark
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextMark = CPointer<GtkTextMark>

public val TextMark.asObject: Object
  get() = reinterpret()
