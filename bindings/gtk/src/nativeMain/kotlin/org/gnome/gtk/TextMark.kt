@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextMark
import interop.gtk_text_mark_get_buffer
import interop.gtk_text_mark_get_deleted
import interop.gtk_text_mark_get_left_gravity
import interop.gtk_text_mark_get_name
import interop.gtk_text_mark_get_visible
import interop.gtk_text_mark_new
import interop.gtk_text_mark_set_visible
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias TextMark = CPointer<GtkTextMark>

public val TextMark.asObject: Object
  get() = reinterpret()

public object TextMarkFactory {
  public fun new(name: String, leftGravity: Boolean): TextMark = gtk_text_mark_new(name,
      leftGravity.toInt)!!.reinterpret()
}

public val TextMark.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TextMark.buffer: TextBuffer?
  get() = gtk_text_mark_get_buffer(this)?.reinterpret()

public val TextMark.deleted: Boolean
  get() = gtk_text_mark_get_deleted(this).toBoolean

public val TextMark.leftGravity: Boolean
  get() = gtk_text_mark_get_left_gravity(this).toBoolean

public val TextMark.name: String
  get() = gtk_text_mark_get_name(this).toKString

public var TextMark.visible: Boolean
  get() = gtk_text_mark_get_visible(this).toBoolean
  set(`value`) {
    gtk_text_mark_set_visible(this, value.toInt)
  }
