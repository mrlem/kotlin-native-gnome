@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkListBoxRow
import interop.gtk_list_box_row_changed
import interop.gtk_list_box_row_get_activatable
import interop.gtk_list_box_row_get_header
import interop.gtk_list_box_row_get_index
import interop.gtk_list_box_row_get_selectable
import interop.gtk_list_box_row_is_selected
import interop.gtk_list_box_row_new
import interop.gtk_list_box_row_set_activatable
import interop.gtk_list_box_row_set_header
import interop.gtk_list_box_row_set_selectable
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias ListBoxRow = CPointer<GtkListBoxRow>

public val ListBoxRow.asObject: Object
  get() = reinterpret()

public val ListBoxRow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBoxRow.asWidget: Widget
  get() = reinterpret()

public val ListBoxRow.asContainer: Container
  get() = reinterpret()

public val ListBoxRow.asBin: Bin
  get() = reinterpret()

public object ListBoxRowFactory {
  public fun new(): ListBoxRow = gtk_list_box_row_new()!!.reinterpret()
}

public val ListBoxRow.parentInstance: Bin
  get() = pointed.parent_instance.ptr

public var ListBoxRow.activatable: Boolean
  get() = gtk_list_box_row_get_activatable(this).toBoolean()
  set(`value`) {
    gtk_list_box_row_set_activatable(this@activatable, `value`.toInt())
  }

public var ListBoxRow.header: Widget?
  get() = gtk_list_box_row_get_header(this)?.reinterpret()
  set(`value`) {
    gtk_list_box_row_set_header(this@header, `value`)
  }

public val ListBoxRow.index: Int
  get() = gtk_list_box_row_get_index(this)

public var ListBoxRow.selectable: Boolean
  get() = gtk_list_box_row_get_selectable(this).toBoolean()
  set(`value`) {
    gtk_list_box_row_set_selectable(this@selectable, `value`.toInt())
  }

public fun ListBoxRow.changed(): Unit {
  gtk_list_box_row_changed(this@changed)
}

public fun ListBoxRow.isSelected(): Boolean =
    gtk_list_box_row_is_selected(this@isSelected).toBoolean()

public fun ListBoxRow.onActivate(callback: (ListBoxRow) -> Unit): ListBoxRow {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}
