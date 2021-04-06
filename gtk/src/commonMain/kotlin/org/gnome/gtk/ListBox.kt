// TODO - implement:
//   bind_model
//   drag_highlight_row
//   drag_unhighlight_row
//   get_adjustment
//   get_row_at_index
//   get_row_at_y
//   get_selected_row
//   get_selected_rows
//   get_selection_mode
//   insert
//   invalidate_filter
//   invalidate_headers
//   invalidate_sort
//   prepend
//   select_all
//   select_row
//   selected_foreach
//   set_adjustment
//   set_filter_func
//   set_header_func
//   set_placeholder
//   set_selection_mode
//   set_sort_func
//   unselect_all
//   unselect_row
package org.gnome.gtk

import gtk3.GtkListBox
import gtk3.gtk_list_box_get_activate_on_single_click
import gtk3.gtk_list_box_set_activate_on_single_click
import kotlin.Boolean
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

public var ListBox.activateOnSingleClick: Boolean
  get() = gtk_list_box_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_list_box_set_activate_on_single_click(this, value.toInt)
  }
