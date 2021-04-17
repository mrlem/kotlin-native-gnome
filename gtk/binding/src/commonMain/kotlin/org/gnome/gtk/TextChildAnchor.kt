package org.gnome.gtk

import gtk3.GtkTextChildAnchor
import gtk3.gtk_text_child_anchor_get_deleted
import gtk3.gtk_text_child_anchor_get_widgets
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean

public typealias TextChildAnchor = CPointer<GtkTextChildAnchor>

public val TextChildAnchor.asObject: Object
  get() = reinterpret()

public fun TextChildAnchor.getWidgets(): Unit {
  gtk_text_child_anchor_get_widgets(this)
}

public val TextChildAnchor.deleted: Boolean
  get() = gtk_text_child_anchor_get_deleted(this).toBoolean
