@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextTag
import interop.gtk_text_tag_changed
import interop.gtk_text_tag_event
import interop.gtk_text_tag_get_priority
import interop.gtk_text_tag_new
import interop.gtk_text_tag_set_priority
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias TextTag = CPointer<GtkTextTag>

public val TextTag.asObject: Object
  get() = reinterpret()

public object TextTagFactory {
  public fun new(name: String?): TextTag = gtk_text_tag_new(name)!!.reinterpret()
}

public val TextTag.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var TextTag.priority: Int
  get() = gtk_text_tag_get_priority(this)
  set(`value`) {
    gtk_text_tag_set_priority(this@priority, `value`)
  }

public fun TextTag.changed(sizeChanged: Boolean): Unit {
  gtk_text_tag_changed(this@changed, sizeChanged.toInt())
}

public fun TextTag.event(
  eventObject: Object?,
  event: Event?,
  iter: TextIter?
): Boolean = gtk_text_tag_event(this@event, eventObject?.reinterpret(), event?.reinterpret(),
    iter?.reinterpret()).toBoolean()

public fun TextTag.onEvent(callback: (TextTag) -> Unit): TextTag {
  // TODO - handle callback data

  asObject.connect("event") { callback(this) }
  return this
}
