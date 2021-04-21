// TODO - method: event
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

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

public var TextTag.priority: Int
  get() = gtk_text_tag_get_priority(this)
  set(`value`) {
    gtk_text_tag_set_priority(this, value)
  }

public fun TextTag.changed(sizeChanged: Boolean): Unit {
  gtk_text_tag_changed(this, sizeChanged.toInt)
}
