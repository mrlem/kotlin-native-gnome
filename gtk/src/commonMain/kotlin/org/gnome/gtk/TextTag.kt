// TODO - implement:
//   changed
//   event
//   get_priority
//   set_priority
package org.gnome.gtk

import gtk3.GtkTextTag
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextTag = CPointer<GtkTextTag>

public val TextTag.asObject: Object
  get() = reinterpret()
