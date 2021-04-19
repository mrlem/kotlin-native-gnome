// TODO - get_bin_window
// TODO - get_columns
// TODO - get_grid_lines
// TODO - convert_bin_window_to_tree_coords
// TODO - convert_bin_window_to_widget_coords
// TODO - convert_tree_to_bin_window_coords
// TODO - convert_tree_to_widget_coords
// TODO - convert_widget_to_bin_window_coords
// TODO - convert_widget_to_tree_coords
// TODO - create_row_drag_icon
// TODO - enable_model_drag_dest
// TODO - enable_model_drag_source
// TODO - get_background_area
// TODO - get_bin_window
// TODO - get_cell_area
// TODO - get_columns
// TODO - get_cursor
// TODO - get_dest_row_at_pos
// TODO - get_drag_dest_row
// TODO - get_grid_lines
// TODO - get_path_at_pos
// TODO - get_tooltip_context
// TODO - get_visible_range
// TODO - get_visible_rect
// TODO - insert_column_with_attributes
// TODO - insert_column_with_data_func
// TODO - is_blank_at_pos
// TODO - map_expanded_rows
// TODO - set_column_drag_function
// TODO - set_drag_dest_row
// TODO - set_grid_lines
// TODO - set_row_separator_func
// TODO - set_search_equal_func
// TODO - set_search_position_func
//
package org.gnome.gtk

import gtk3.GtkTreeView
import gtk3.gtk_tree_view_append_column
import gtk3.gtk_tree_view_collapse_all
import gtk3.gtk_tree_view_collapse_row
import gtk3.gtk_tree_view_columns_autosize
import gtk3.gtk_tree_view_expand_all
import gtk3.gtk_tree_view_expand_row
import gtk3.gtk_tree_view_expand_to_path
import gtk3.gtk_tree_view_get_activate_on_single_click
import gtk3.gtk_tree_view_get_column
import gtk3.gtk_tree_view_get_enable_search
import gtk3.gtk_tree_view_get_enable_tree_lines
import gtk3.gtk_tree_view_get_expander_column
import gtk3.gtk_tree_view_get_fixed_height_mode
import gtk3.gtk_tree_view_get_headers_clickable
import gtk3.gtk_tree_view_get_headers_visible
import gtk3.gtk_tree_view_get_hover_expand
import gtk3.gtk_tree_view_get_hover_selection
import gtk3.gtk_tree_view_get_level_indentation
import gtk3.gtk_tree_view_get_model
import gtk3.gtk_tree_view_get_n_columns
import gtk3.gtk_tree_view_get_reorderable
import gtk3.gtk_tree_view_get_row_separator_func
import gtk3.gtk_tree_view_get_rubber_banding
import gtk3.gtk_tree_view_get_search_column
import gtk3.gtk_tree_view_get_search_entry
import gtk3.gtk_tree_view_get_search_equal_func
import gtk3.gtk_tree_view_get_search_position_func
import gtk3.gtk_tree_view_get_selection
import gtk3.gtk_tree_view_get_show_expanders
import gtk3.gtk_tree_view_get_tooltip_column
import gtk3.gtk_tree_view_insert_column
import gtk3.gtk_tree_view_is_rubber_banding_active
import gtk3.gtk_tree_view_move_column_after
import gtk3.gtk_tree_view_remove_column
import gtk3.gtk_tree_view_row_activated
import gtk3.gtk_tree_view_row_expanded
import gtk3.gtk_tree_view_scroll_to_cell
import gtk3.gtk_tree_view_scroll_to_point
import gtk3.gtk_tree_view_set_activate_on_single_click
import gtk3.gtk_tree_view_set_cursor
import gtk3.gtk_tree_view_set_cursor_on_cell
import gtk3.gtk_tree_view_set_enable_search
import gtk3.gtk_tree_view_set_enable_tree_lines
import gtk3.gtk_tree_view_set_expander_column
import gtk3.gtk_tree_view_set_fixed_height_mode
import gtk3.gtk_tree_view_set_headers_clickable
import gtk3.gtk_tree_view_set_headers_visible
import gtk3.gtk_tree_view_set_hover_expand
import gtk3.gtk_tree_view_set_hover_selection
import gtk3.gtk_tree_view_set_level_indentation
import gtk3.gtk_tree_view_set_model
import gtk3.gtk_tree_view_set_reorderable
import gtk3.gtk_tree_view_set_rubber_banding
import gtk3.gtk_tree_view_set_search_column
import gtk3.gtk_tree_view_set_search_entry
import gtk3.gtk_tree_view_set_show_expanders
import gtk3.gtk_tree_view_set_tooltip_cell
import gtk3.gtk_tree_view_set_tooltip_column
import gtk3.gtk_tree_view_set_tooltip_row
import gtk3.gtk_tree_view_unset_rows_drag_dest
import gtk3.gtk_tree_view_unset_rows_drag_source
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias TreeView = CPointer<GtkTreeView>

public val TreeView.asObject: Object
  get() = reinterpret()

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

public var TreeView.expanderColumn: TreeViewColumn?
  get() = gtk_tree_view_get_expander_column(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_expander_column(this, value)
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

public var TreeView.model: TreeModel?
  get() = gtk_tree_view_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_model(this, value)
  }

public val TreeView.nColumns: UInt
  get() = gtk_tree_view_get_n_columns(this)

public var TreeView.reorderable: Boolean
  get() = gtk_tree_view_get_reorderable(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_reorderable(this, value.toInt)
  }

public val TreeView.rowSeparatorFunc: TreeViewRowSeparatorFunc?
  get() = gtk_tree_view_get_row_separator_func(this)?.reinterpret()

public var TreeView.rubberBanding: Boolean
  get() = gtk_tree_view_get_rubber_banding(this).toBoolean
  set(`value`) {
    gtk_tree_view_set_rubber_banding(this, value.toInt)
  }

public var TreeView.searchColumn: Int
  get() = gtk_tree_view_get_search_column(this)
  set(`value`) {
    gtk_tree_view_set_search_column(this, value)
  }

public var TreeView.searchEntry: Entry?
  get() = gtk_tree_view_get_search_entry(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_search_entry(this, value)
  }

public val TreeView.searchEqualFunc: TreeViewSearchEqualFunc?
  get() = gtk_tree_view_get_search_equal_func(this)?.reinterpret()

public val TreeView.searchPositionFunc: TreeViewSearchPositionFunc?
  get() = gtk_tree_view_get_search_position_func(this)?.reinterpret()

public val TreeView.selection: TreeSelection?
  get() = gtk_tree_view_get_selection(this)?.reinterpret()

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

public fun TreeView.appendColumn(column: TreeViewColumn): Int = gtk_tree_view_append_column(this,
    column.reinterpret())

public fun TreeView.collapseAll(): Unit {
  gtk_tree_view_collapse_all(this)
}

public fun TreeView.collapseRow(path: TreePath): Boolean = gtk_tree_view_collapse_row(this,
    path.reinterpret()).toBoolean

public fun TreeView.columnsAutosize(): Unit {
  gtk_tree_view_columns_autosize(this)
}

public fun TreeView.expandAll(): Unit {
  gtk_tree_view_expand_all(this)
}

public fun TreeView.expandRow(path: TreePath, openAll: Boolean): Boolean =
    gtk_tree_view_expand_row(this, path.reinterpret(), openAll.toInt).toBoolean

public fun TreeView.expandToPath(path: TreePath): Unit {
  gtk_tree_view_expand_to_path(this, path.reinterpret())
}

public fun TreeView.getColumn(n: Int): TreeViewColumn? = gtk_tree_view_get_column(this,
    n)?.reinterpret()

public fun TreeView.insertColumn(column: TreeViewColumn, position: Int): Int =
    gtk_tree_view_insert_column(this, column.reinterpret(), position)

public fun TreeView.isRubberBandingActive(): Boolean =
    gtk_tree_view_is_rubber_banding_active(this).toBoolean

public fun TreeView.moveColumnAfter(column: TreeViewColumn, baseColumn: TreeViewColumn): Unit {
  gtk_tree_view_move_column_after(this, column.reinterpret(), baseColumn.reinterpret())
}

public fun TreeView.removeColumn(column: TreeViewColumn): Int = gtk_tree_view_remove_column(this,
    column.reinterpret())

public fun TreeView.rowActivated(path: TreePath, column: TreeViewColumn): Unit {
  gtk_tree_view_row_activated(this, path.reinterpret(), column.reinterpret())
}

public fun TreeView.rowExpanded(path: TreePath): Boolean = gtk_tree_view_row_expanded(this,
    path.reinterpret()).toBoolean

public fun TreeView.scrollToCell(
  path: TreePath,
  column: TreeViewColumn,
  useAlign: Boolean,
  rowAlign: Float,
  colAlign: Float
): Unit {
  gtk_tree_view_scroll_to_cell(this, path.reinterpret(), column.reinterpret(), useAlign.toInt,
      rowAlign, colAlign)
}

public fun TreeView.scrollToPoint(treeX: Int, treeY: Int): Unit {
  gtk_tree_view_scroll_to_point(this, treeX, treeY)
}

public fun TreeView.setCursor(
  path: TreePath,
  focusColumn: TreeViewColumn,
  startEditing: Boolean
): Unit {
  gtk_tree_view_set_cursor(this, path.reinterpret(), focusColumn.reinterpret(), startEditing.toInt)
}

public fun TreeView.setCursorOnCell(
  path: TreePath,
  focusColumn: TreeViewColumn,
  focusCell: CellRenderer,
  startEditing: Boolean
): Unit {
  gtk_tree_view_set_cursor_on_cell(this, path.reinterpret(), focusColumn.reinterpret(),
      focusCell.reinterpret(), startEditing.toInt)
}

public fun TreeView.setTooltipCell(
  tooltip: Tooltip,
  path: TreePath,
  column: TreeViewColumn,
  cell: CellRenderer
): Unit {
  gtk_tree_view_set_tooltip_cell(this, tooltip.reinterpret(), path.reinterpret(),
      column.reinterpret(), cell.reinterpret())
}

public fun TreeView.setTooltipRow(tooltip: Tooltip, path: TreePath): Unit {
  gtk_tree_view_set_tooltip_row(this, tooltip.reinterpret(), path.reinterpret())
}

public fun TreeView.unsetRowsDragDest(): Unit {
  gtk_tree_view_unset_rows_drag_dest(this)
}

public fun TreeView.unsetRowsDragSource(): Unit {
  gtk_tree_view_unset_rows_drag_source(this)
}
