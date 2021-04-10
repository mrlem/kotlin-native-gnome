// TODO - implement:
//   bind_model
//   drag_highlight_row
//   get_row_at_index
//   get_row_at_y
//   insert
//   prepend
//   select_row
//   selected_foreach
//   set_adjustment
//   set_filter_func
//   set_header_func
//   set_placeholder
//   set_selection_mode
//   set_sort_func
//   unselect_row
package org.gnome.gtk

import gtk3.GtkListBox
import gtk3.gtk_list_box_drag_unhighlight_row
import gtk3.gtk_list_box_get_activate_on_single_click
import gtk3.gtk_list_box_get_adjustment
import gtk3.gtk_list_box_get_selected_row
import gtk3.gtk_list_box_get_selected_rows
import gtk3.gtk_list_box_get_selection_mode
import gtk3.gtk_list_box_invalidate_filter
import gtk3.gtk_list_box_invalidate_headers
import gtk3.gtk_list_box_invalidate_sort
import gtk3.gtk_list_box_select_all
import gtk3.gtk_list_box_set_activate_on_single_click
import gtk3.gtk_list_box_unselect_all
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias ListBox = CPointer<GtkListBox>

public val ListBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBox.asWidget: Widget
  get() = reinterpret()

public val ListBox.asContainer: Container
  get() = reinterpret()

public fun ListBox.dragUnhighlightRow(): Unit {
  gtk_list_box_drag_unhighlight_row(this)
}

public fun ListBox.getAdjustment(): Unit {
  gtk_list_box_get_adjustment(this)
}

public fun ListBox.getSelectedRow(): Unit {
  gtk_list_box_get_selected_row(this)
}

public fun ListBox.getSelectedRows(): Unit {
  gtk_list_box_get_selected_rows(this)
}

public fun ListBox.getSelectionMode(): Unit {
  gtk_list_box_get_selection_mode(this)
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

public fun ListBox.selectAll(): Unit {
  gtk_list_box_select_all(this)
}

public fun ListBox.unselectAll(): Unit {
  gtk_list_box_unselect_all(this)
}

public var ListBox.activateOnSingleClick: Boolean
  get() = gtk_list_box_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_list_box_set_activate_on_single_click(this, value.toInt)
  }
