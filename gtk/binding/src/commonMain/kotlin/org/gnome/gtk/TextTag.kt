// TODO - event
//
package org.gnome.gtk

import gtk3.GtkTextTag
import gtk3.gtk_text_tag_changed
import gtk3.gtk_text_tag_get_priority
import gtk3.gtk_text_tag_set_priority
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toInt

public typealias TextTag = CPointer<GtkTextTag>

public val TextTag.asObject: Object
  get() = reinterpret()

public fun TextTag.changed(sizeChanged: Boolean): Unit {
  gtk_text_tag_changed(this, sizeChanged.toInt)
}

public fun TextTag.getPriority(): Int = gtk_text_tag_get_priority(this)

public fun TextTag.setPriority(priority: Int): Unit {
  gtk_text_tag_set_priority(this, priority)
}
