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
//   get_background_area
//   get_bin_window
//   get_cell_area
//   get_column
//   get_columns
//   get_cursor
//   get_dest_row_at_pos
//   get_drag_dest_row
//   get_expander_column
//   get_grid_lines
//   get_hadjustment
//   get_model
//   get_path_at_pos
//   get_row_separator_func
//   get_search_entry
//   get_search_equal_func
//   get_search_position_func
//   get_selection
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
//   set_column_drag_function
//   set_cursor
//   set_cursor_on_cell
//   set_destroy_count_func
//   set_drag_dest_row
//   set_expander_column
//   set_grid_lines
//   set_hadjustment
//   set_model
//   set_row_separator_func
//   set_search_entry
//   set_search_equal_func
//   set_search_position_func
//   set_tooltip_cell
//   set_tooltip_row
//   set_vadjustment
//   unset_rows_drag_dest
//   unset_rows_drag_source
package org.gnome.gtk

import gtk3.GtkTreeView
import gtk3.gtk_tree_view_get_activate_on_single_click
import gtk3.gtk_tree_view_get_enable_search
import gtk3.gtk_tree_view_get_enable_tree_lines
import gtk3.gtk_tree_view_get_fixed_height_mode
import gtk3.gtk_tree_view_get_headers_clickable
import gtk3.gtk_tree_view_get_headers_visible
import gtk3.gtk_tree_view_get_hover_expand
import gtk3.gtk_tree_view_get_hover_selection
import gtk3.gtk_tree_view_get_level_indentation
import gtk3.gtk_tree_view_get_n_columns
import gtk3.gtk_tree_view_get_reorderable
import gtk3.gtk_tree_view_get_rubber_banding
import gtk3.gtk_tree_view_get_rules_hint
import gtk3.gtk_tree_view_get_search_column
import gtk3.gtk_tree_view_get_show_expanders
import gtk3.gtk_tree_view_get_tooltip_column
import gtk3.gtk_tree_view_set_activate_on_single_click
import gtk3.gtk_tree_view_set_enable_search
import gtk3.gtk_tree_view_set_enable_tree_lines
import gtk3.gtk_tree_view_set_fixed_height_mode
import gtk3.gtk_tree_view_set_headers_clickable
import gtk3.gtk_tree_view_set_headers_visible
import gtk3.gtk_tree_view_set_hover_expand
import gtk3.gtk_tree_view_set_hover_selection
import gtk3.gtk_tree_view_set_level_indentation
import gtk3.gtk_tree_view_set_reorderable
import gtk3.gtk_tree_view_set_rubber_banding
import gtk3.gtk_tree_view_set_rules_hint
import gtk3.gtk_tree_view_set_search_column
import gtk3.gtk_tree_view_set_show_expanders
import gtk3.gtk_tree_view_set_tooltip_column
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias TreeView = CPointer<GtkTreeView>

public val TreeView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TreeView.asWidget: Widget
  get() = reinterpret()

public val TreeView.asContainer: Container
  get() = reinterpret()

public var TreeView.activateOnSingleClick: Boolean
  get() = gtk_tree_view_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_activate_on_single_click(this, value.toInt)
  }

public var TreeView.enableSearch: Boolean
  get() = gtk_tree_view_get_enable_search(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_enable_search(this, value.toInt)
  }

public var TreeView.enableTreeLines: Boolean
  get() = gtk_tree_view_get_enable_tree_lines(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_enable_tree_lines(this, value.toInt)
  }

public var TreeView.fixedHeightMode: Boolean
  get() = gtk_tree_view_get_fixed_height_mode(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_fixed_height_mode(this, value.toInt)
  }

public var TreeView.headersClickable: Boolean
  get() = gtk_tree_view_get_headers_clickable(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_headers_clickable(this, value.toInt)
  }

public var TreeView.headersVisible: Boolean
  get() = gtk_tree_view_get_headers_visible(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_headers_visible(this, value.toInt)
  }

public var TreeView.hoverExpand: Boolean
  get() = gtk_tree_view_get_hover_expand(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_hover_expand(this, value.toInt)
  }

public var TreeView.hoverSelection: Boolean
  get() = gtk_tree_view_get_hover_selection(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_hover_selection(this, value.toInt)
  }

public var TreeView.levelIndentation: Int
  get() = gtk_tree_view_get_level_indentation(this)
  set(`value`) {
    gtk_tree_view_set_level_indentation(this, value)
  }

public var TreeView.reorderable: Boolean
  get() = gtk_tree_view_get_reorderable(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_reorderable(this, value.toInt)
  }

public var TreeView.rubberBanding: Boolean
  get() = gtk_tree_view_get_rubber_banding(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_rubber_banding(this, value.toInt)
  }

public var TreeView.rulesHint: Boolean
  get() = gtk_tree_view_get_rules_hint(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_rules_hint(this, value.toInt)
  }

public var TreeView.searchColumn: Int
  get() = gtk_tree_view_get_search_column(this)
  set(`value`) {
    gtk_tree_view_set_search_column(this, value)
  }

public var TreeView.showExpanders: Boolean
  get() = gtk_tree_view_get_show_expanders(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_show_expanders(this, value.toInt)
  }

public var TreeView.tooltipColumn: Int
  get() = gtk_tree_view_get_tooltip_column(this)
  set(`value`) {
    gtk_tree_view_set_tooltip_column(this, value)
  }

public val TreeView.nColumns: UInt
  get() = gtk_tree_view_get_n_columns(this)
