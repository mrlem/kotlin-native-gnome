// TODO - method: bind_model (param type)
// TODO - method: get_selected_rows (return type)
// TODO - method: selected_foreach (param type)
// TODO - method: set_filter_func (param type)
// TODO - method: set_header_func (param type)
// TODO - method: set_sort_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkListBox
import interop.gtk_list_box_drag_highlight_row
import interop.gtk_list_box_drag_unhighlight_row
import interop.gtk_list_box_get_activate_on_single_click
import interop.gtk_list_box_get_adjustment
import interop.gtk_list_box_get_row_at_index
import interop.gtk_list_box_get_row_at_y
import interop.gtk_list_box_get_selected_row
import interop.gtk_list_box_get_selection_mode
import interop.gtk_list_box_insert
import interop.gtk_list_box_invalidate_filter
import interop.gtk_list_box_invalidate_headers
import interop.gtk_list_box_invalidate_sort
import interop.gtk_list_box_new
import interop.gtk_list_box_prepend
import interop.gtk_list_box_select_all
import interop.gtk_list_box_select_row
import interop.gtk_list_box_set_activate_on_single_click
import interop.gtk_list_box_set_adjustment
import interop.gtk_list_box_set_placeholder
import interop.gtk_list_box_set_selection_mode
import interop.gtk_list_box_unselect_all
import interop.gtk_list_box_unselect_row
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias ListBox = CPointer<GtkListBox>

public val ListBox.asObject: Object
  get() = reinterpret()

public val ListBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBox.asWidget: Widget
  get() = reinterpret()

public val ListBox.asContainer: Container
  get() = reinterpret()

public object ListBoxFactory {
  public fun new(): ListBox = gtk_list_box_new()!!.reinterpret()
}

public val ListBox.parentInstance: Container
  get() = pointed.parent_instance.ptr

public var ListBox.activateOnSingleClick: Boolean
  get() = gtk_list_box_get_activate_on_single_click(this).toBoolean()
  set(`value`) {
    gtk_list_box_set_activate_on_single_click(this@activateOnSingleClick, `value`.toInt())
  }

public var ListBox.adjustment: Adjustment?
  get() = gtk_list_box_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_list_box_set_adjustment(this@adjustment, `value`)
  }

public val ListBox.selectedRow: ListBoxRow?
  get() = gtk_list_box_get_selected_row(this)?.reinterpret()

public var ListBox.selectionMode: SelectionMode
  get() = gtk_list_box_get_selection_mode(this)
  set(`value`) {
    gtk_list_box_set_selection_mode(this@selectionMode, `value`)
  }

public fun ListBox.dragHighlightRow(row: ListBoxRow?): Unit {
  gtk_list_box_drag_highlight_row(this@dragHighlightRow, row?.reinterpret())
}

public fun ListBox.dragUnhighlightRow(): Unit {
  gtk_list_box_drag_unhighlight_row(this@dragUnhighlightRow)
}

public fun ListBox.getRowAtIndex(index: Int): ListBoxRow? =
    gtk_list_box_get_row_at_index(this@getRowAtIndex, index)?.reinterpret()

public fun ListBox.getRowAtY(y: Int): ListBoxRow? = gtk_list_box_get_row_at_y(this@getRowAtY,
    y)?.reinterpret()

public fun ListBox.insert(child: Widget?, position: Int): Unit {
  gtk_list_box_insert(this@insert, child?.reinterpret(), position)
}

public fun ListBox.invalidateFilter(): Unit {
  gtk_list_box_invalidate_filter(this@invalidateFilter)
}

public fun ListBox.invalidateHeaders(): Unit {
  gtk_list_box_invalidate_headers(this@invalidateHeaders)
}

public fun ListBox.invalidateSort(): Unit {
  gtk_list_box_invalidate_sort(this@invalidateSort)
}

public fun ListBox.prepend(child: Widget?): Unit {
  gtk_list_box_prepend(this@prepend, child?.reinterpret())
}

public fun ListBox.selectAll(): Unit {
  gtk_list_box_select_all(this@selectAll)
}

public fun ListBox.selectRow(row: ListBoxRow?): Unit {
  gtk_list_box_select_row(this@selectRow, row?.reinterpret())
}

public fun ListBox.setPlaceholder(placeholder: Widget?): Unit {
  gtk_list_box_set_placeholder(this@setPlaceholder, placeholder?.reinterpret())
}

public fun ListBox.unselectAll(): Unit {
  gtk_list_box_unselect_all(this@unselectAll)
}

public fun ListBox.unselectRow(row: ListBoxRow?): Unit {
  gtk_list_box_unselect_row(this@unselectRow, row?.reinterpret())
}

public fun ListBox.onActivateCursorRow(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("activate-cursor-row") { callback(this) }
  return this
}

public fun ListBox.onMoveCursor(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun ListBox.onRowActivated(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("row-activated") { callback(this) }
  return this
}

public fun ListBox.onRowSelected(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("row-selected") { callback(this) }
  return this
}

public fun ListBox.onSelectAll(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("select-all") { callback(this) }
  return this
}

public fun ListBox.onSelectedRowsChanged(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("selected-rows-changed") { callback(this) }
  return this
}

public fun ListBox.onToggleCursorRow(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("toggle-cursor-row") { callback(this) }
  return this
}

public fun ListBox.onUnselectAll(callback: (ListBox) -> Unit): ListBox {
  // TODO - handle callback data

  asObject.connect("unselect-all") { callback(this) }
  return this
}
