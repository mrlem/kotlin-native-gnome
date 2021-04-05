// TODO - implement:
//   convert_widget_to_bin_window_coords
//   create_drag_icon
//   enable_model_drag_dest
//   enable_model_drag_source
//   get_activate_on_single_click
//   get_cell_rect
//   get_column_spacing
//   get_columns
//   get_cursor
//   get_dest_item_at_pos
//   get_drag_dest_item
//   get_item_at_pos
//   get_item_column
//   get_item_orientation
//   get_item_padding
//   get_item_row
//   get_item_width
//   get_margin
//   get_markup_column
//   get_model
//   get_path_at_pos
//   get_pixbuf_column
//   get_reorderable
//   get_row_spacing
//   get_selected_items
//   get_selection_mode
//   get_spacing
//   get_text_column
//   get_tooltip_column
//   get_tooltip_context
//   get_visible_range
//   item_activated
//   path_is_selected
//   scroll_to_path
//   select_all
//   select_path
//   selected_foreach
//   set_activate_on_single_click
//   set_column_spacing
//   set_columns
//   set_cursor
//   set_drag_dest_item
//   set_item_orientation
//   set_item_padding
//   set_item_width
//   set_margin
//   set_markup_column
//   set_model
//   set_pixbuf_column
//   set_reorderable
//   set_row_spacing
//   set_selection_mode
//   set_spacing
//   set_text_column
//   set_tooltip_cell
//   set_tooltip_column
//   set_tooltip_item
//   unselect_all
//   unselect_path
//   unset_model_drag_dest
//   unset_model_drag_source
package org.gnome.gtk

import gtk3.GtkIconView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias IconView = CPointer<GtkIconView>

public val IconView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val IconView.asWidget: Widget
  get() = reinterpret()

public val IconView.asContainer: Container
  get() = reinterpret()
