// TODO - implement:
//   changed
//   event
package org.gnome.gtk

import gtk3.GtkTextTag
import gtk3.gtk_text_tag_get_priority
import gtk3.gtk_text_tag_set_priority
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextTag = CPointer<GtkTextTag>

public val TextTag.asObject: Object
  get() = reinterpret()

public var TextTag.priority: Int
  get() = gtk_text_tag_get_priority(this)
  set(`value`) {
    gtk_text_tag_set_priority(this, value)
  }
