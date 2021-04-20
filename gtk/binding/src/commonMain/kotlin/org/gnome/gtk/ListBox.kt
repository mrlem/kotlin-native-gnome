// TODO - bind_model
// TODO - get_selected_rows
// TODO - get_selection_mode
// TODO - selected_foreach
// TODO - set_filter_func
// TODO - set_header_func
// TODO - set_selection_mode
// TODO - set_sort_func
//
package org.gnome.gtk

import gtk3.GtkListBox
import gtk3.gtk_list_box_drag_highlight_row
import gtk3.gtk_list_box_drag_unhighlight_row
import gtk3.gtk_list_box_get_activate_on_single_click
import gtk3.gtk_list_box_get_adjustment
import gtk3.gtk_list_box_get_row_at_index
import gtk3.gtk_list_box_get_row_at_y
import gtk3.gtk_list_box_get_selected_row
import gtk3.gtk_list_box_insert
import gtk3.gtk_list_box_invalidate_filter
import gtk3.gtk_list_box_invalidate_headers
import gtk3.gtk_list_box_invalidate_sort
import gtk3.gtk_list_box_prepend
import gtk3.gtk_list_box_select_all
import gtk3.gtk_list_box_select_row
import gtk3.gtk_list_box_set_activate_on_single_click
import gtk3.gtk_list_box_set_adjustment
import gtk3.gtk_list_box_set_placeholder
import gtk3.gtk_list_box_unselect_all
import gtk3.gtk_list_box_unselect_row
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ListBox = CPointer<GtkListBox>

public val ListBox.asObject: Object
  get() = reinterpret()

public val ListBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBox.asWidget: Widget
  get() = reinterpret()

public val ListBox.asContainer: Container
  get() = reinterpret()

public var ListBox.activateOnSingleClick: Boolean
  get() = gtk_list_box_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_list_box_set_activate_on_single_click(this, value.toInt)
  }

public var ListBox.adjustment: Adjustment?
  get() = gtk_list_box_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_list_box_set_adjustment(this, value)
  }

public val ListBox.selectedRow: ListBoxRow?
  get() = gtk_list_box_get_selected_row(this)?.reinterpret()

public fun ListBox.dragHighlightRow(row: ListBoxRow): Unit {
  gtk_list_box_drag_highlight_row(this, row.reinterpret())
}

public fun ListBox.dragUnhighlightRow(): Unit {
  gtk_list_box_drag_unhighlight_row(this)
}

public fun ListBox.getRowAtIndex(index: Int): ListBoxRow? = gtk_list_box_get_row_at_index(this,
    index)?.reinterpret()

public fun ListBox.getRowAtY(y: Int): ListBoxRow? = gtk_list_box_get_row_at_y(this,
    y)?.reinterpret()

public fun ListBox.insert(child: Widget, position: Int): Unit {
  gtk_list_box_insert(this, child.reinterpret(), position)
}

public fun ListBox.invalidateFilter(): Unit {
  gtk_list_box_invalidate_filter(this)
}

public fun ListBox.invalidateHeaders(): Unit {
  gtk_list_box_invalidate_headers(this)
}

public fun ListBox.invalidateSort(): Unit {
  gtk_list_box_invalidate_sort(this)
}

public fun ListBox.prepend(child: Widget): Unit {
  gtk_list_box_prepend(this, child.reinterpret())
}

public fun ListBox.selectAll(): Unit {
  gtk_list_box_select_all(this)
}

public fun ListBox.selectRow(row: ListBoxRow): Unit {
  gtk_list_box_select_row(this, row.reinterpret())
}

public fun ListBox.setPlaceholder(placeholder: Widget): Unit {
  gtk_list_box_set_placeholder(this, placeholder.reinterpret())
}

public fun ListBox.unselectAll(): Unit {
  gtk_list_box_unselect_all(this)
}

public fun ListBox.unselectRow(row: ListBoxRow): Unit {
  gtk_list_box_unselect_row(this, row.reinterpret())
}
