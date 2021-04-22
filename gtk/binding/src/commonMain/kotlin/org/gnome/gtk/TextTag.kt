// TODO - method: event
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkTextTag
import gtk3.gtk_text_tag_changed
import gtk3.gtk_text_tag_get_priority
import gtk3.gtk_text_tag_new
import gtk3.gtk_text_tag_set_priority
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toInt

public typealias TextTag = CPointer<GtkTextTag>

public val TextTag.asObject: Object
  get() = reinterpret()

public object TextTagFactory {
  public fun new(name: String): TextTag = gtk_text_tag_new(name)!!.reinterpret()
}

public var TextTag.priority: Int
  get() = gtk_text_tag_get_priority(this)
  set(`value`) {
    gtk_text_tag_set_priority(this, value)
  }

public fun TextTag.changed(sizeChanged: Boolean): Unit {
  gtk_text_tag_changed(this, sizeChanged.toInt)
}

public fun TextTag.onEvent(callback: (TextTag) -> Unit): TextTag {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
