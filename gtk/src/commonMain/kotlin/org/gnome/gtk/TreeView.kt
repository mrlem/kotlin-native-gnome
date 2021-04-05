// TODO - implement:
//   append_column
//   collapse_all
//   collapse_row
//   columns_autosize
//   convert_bin_window_to_tree_coords
//   convert_bin_window_to_widget_coords
//   convert_tree_to_bin_window_coords
//   convert_tree_to_widget_coords
//   convert_widget_to_bin_window_coords
//   convert_widget_to_tree_coords
//   create_row_drag_icon
//   enable_model_drag_dest
//   enable_model_drag_source
//   expand_all
//   expand_row
//   expand_to_path
//   get_activate_on_single_click
//   get_background_area
//   get_bin_window
//   get_cell_area
//   get_column
//   get_columns
//   get_cursor
//   get_dest_row_at_pos
//   get_drag_dest_row
//   get_enable_search
//   get_enable_tree_lines
//   get_expander_column
//   get_fixed_height_mode
//   get_grid_lines
//   get_hadjustment
//   get_headers_clickable
//   get_headers_visible
//   get_hover_expand
//   get_hover_selection
//   get_level_indentation
//   get_model
//   get_n_columns
//   get_path_at_pos
//   get_reorderable
//   get_row_separator_func
//   get_rubber_banding
//   get_rules_hint
//   get_search_column
//   get_search_entry
//   get_search_equal_func
//   get_search_position_func
//   get_selection
//   get_show_expanders
//   get_tooltip_column
//   get_tooltip_context
//   get_vadjustment
//   get_visible_range
//   get_visible_rect
//   insert_column
//   insert_column_with_attributes
//   insert_column_with_data_func
//   is_blank_at_pos
//   is_rubber_banding_active
//   map_expanded_rows
//   move_column_after
//   remove_column
//   row_activated
//   row_expanded
//   scroll_to_cell
//   scroll_to_point
//   set_activate_on_single_click
//   set_column_drag_function
//   set_cursor
//   set_cursor_on_cell
//   set_destroy_count_func
//   set_drag_dest_row
//   set_enable_search
//   set_enable_tree_lines
//   set_expander_column
//   set_fixed_height_mode
//   set_grid_lines
//   set_hadjustment
//   set_headers_clickable
//   set_headers_visible
//   set_hover_expand
//   set_hover_selection
//   set_level_indentation
//   set_model
//   set_reorderable
//   set_row_separator_func
//   set_rubber_banding
//   set_rules_hint
//   set_search_column
//   set_search_entry
//   set_search_equal_func
//   set_search_position_func
//   set_show_expanders
//   set_tooltip_cell
//   set_tooltip_column
//   set_tooltip_row
//   set_vadjustment
//   unset_rows_drag_dest
//   unset_rows_drag_source
package org.gnome.gtk

import gtk3.GtkTreeView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias TreeView = CPointer<GtkTreeView>

public val TreeView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TreeView.asWidget: Widget
  get() = reinterpret()

public val TreeView.asContainer: Container
  get() = reinterpret()
