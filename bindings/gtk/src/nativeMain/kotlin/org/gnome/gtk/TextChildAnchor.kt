@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkTextChildAnchor
import interop.gtk_text_child_anchor_get_deleted
import interop.gtk_text_child_anchor_get_widgets
import interop.gtk_text_child_anchor_new
import kotlin.Boolean
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toKList

public typealias TextChildAnchor = CPointer<GtkTextChildAnchor>

public val TextChildAnchor.asObject: Object
  get() = reinterpret()

public object TextChildAnchorFactory {
  public fun new(): TextChildAnchor = gtk_text_child_anchor_new()!!.reinterpret()
}

public val TextChildAnchor.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TextChildAnchor.deleted: Boolean
  get() = gtk_text_child_anchor_get_deleted(this).toBoolean()

public val TextChildAnchor.widgets: List<Widget>?
  get() = gtk_text_child_anchor_get_widgets(this)?.reinterpret<GList>()?.toKList()
