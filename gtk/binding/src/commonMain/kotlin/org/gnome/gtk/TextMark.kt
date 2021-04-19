package org.gnome.gtk

import gtk3.GtkTextMark
import gtk3.gtk_text_mark_get_buffer
import gtk3.gtk_text_mark_get_deleted
import gtk3.gtk_text_mark_get_left_gravity
import gtk3.gtk_text_mark_get_name
import gtk3.gtk_text_mark_get_visible
import gtk3.gtk_text_mark_set_visible
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias TextMark = CPointer<GtkTextMark>

public val TextMark.asObject: Object
  get() = reinterpret()

public fun TextMark.getBuffer(): TextBuffer? = gtk_text_mark_get_buffer(this)?.reinterpret()

public fun TextMark.getDeleted(): Boolean = gtk_text_mark_get_deleted(this).toBoolean

public fun TextMark.getLeftGravity(): Boolean = gtk_text_mark_get_left_gravity(this).toBoolean

public fun TextMark.getName(): String = gtk_text_mark_get_name(this).toKString

public fun TextMark.getVisible(): Boolean = gtk_text_mark_get_visible(this).toBoolean

public fun TextMark.setVisible(setting: Boolean): Unit {
  gtk_text_mark_set_visible(this, setting.toInt)
}
