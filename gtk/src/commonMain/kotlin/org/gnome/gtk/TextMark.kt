// TODO - implement:
//   get_buffer
package org.gnome.gtk

import gtk3.GtkTextMark
import gtk3.gtk_text_mark_get_deleted
import gtk3.gtk_text_mark_get_left_gravity
import gtk3.gtk_text_mark_get_name
import gtk3.gtk_text_mark_get_visible
import gtk3.gtk_text_mark_set_visible
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias TextMark = CPointer<GtkTextMark>

public val TextMark.asObject: Object
  get() = reinterpret()

public var TextMark.visible: Boolean
  get() = gtk_text_mark_get_visible(this).toBoolean
  set(`value`) {
    gtk_text_mark_set_visible(this, value.toInt)
  }

public val TextMark.deleted: Boolean
  get() = gtk_text_mark_get_deleted(this).toBoolean

public val TextMark.leftGravity: Boolean
  get() = gtk_text_mark_get_left_gravity(this).toBoolean

public val TextMark.name: String?
  get() = gtk_text_mark_get_name(this).toKString
