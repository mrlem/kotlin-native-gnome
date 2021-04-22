// TODO - method: get_widgets
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextChildAnchor
import interop.gtk_text_child_anchor_get_deleted
import interop.gtk_text_child_anchor_new
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TextChildAnchor = CPointer<GtkTextChildAnchor>

public val TextChildAnchor.asObject: Object
  get() = reinterpret()

public object TextChildAnchorFactory {
  public fun new(): TextChildAnchor = gtk_text_child_anchor_new()!!.reinterpret()
}

public val TextChildAnchor.deleted: Boolean
  get() = gtk_text_child_anchor_get_deleted(this).toBoolean
