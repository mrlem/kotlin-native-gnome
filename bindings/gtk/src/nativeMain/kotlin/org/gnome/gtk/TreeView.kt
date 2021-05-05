// TODO - method: convert_bin_window_to_tree_coords (param type)
// TODO - method: convert_bin_window_to_widget_coords (param type)
// TODO - method: convert_tree_to_bin_window_coords (param type)
// TODO - method: convert_tree_to_widget_coords (param type)
// TODO - method: convert_widget_to_bin_window_coords (param type)
// TODO - method: convert_widget_to_tree_coords (param type)
// TODO - method: create_row_drag_icon (return type)
// TODO - method: get_background_area (param type)
// TODO - method: get_cell_area (param type)
// TODO - method: get_columns (return type)
// TODO - method: get_cursor (param type)
// TODO - method: get_dest_row_at_pos (param type)
// TODO - method: get_drag_dest_row (param type)
// TODO - method: get_path_at_pos (param type)
// TODO - method: get_tooltip_context (param type)
// TODO - method: get_visible_range (param type)
// TODO - method: get_visible_rect (param type)
// TODO - method: insert_column_with_attributes (param type)
// TODO - method: insert_column_with_data_func (param type)
// TODO - method: is_blank_at_pos (param type)
// TODO - method: map_expanded_rows (param type)
// TODO - method: set_column_drag_function (param type)
// TODO - method: set_row_separator_func (param type)
// TODO - method: set_search_equal_func (param type)
// TODO - method: set_search_position_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeView
import interop.gtk_tree_view_append_column
import interop.gtk_tree_view_collapse_all
import interop.gtk_tree_view_collapse_row
import interop.gtk_tree_view_columns_autosize
import interop.gtk_tree_view_enable_model_drag_dest
import interop.gtk_tree_view_enable_model_drag_source
import interop.gtk_tree_view_expand_all
import interop.gtk_tree_view_expand_row
import interop.gtk_tree_view_expand_to_path
import interop.gtk_tree_view_get_activate_on_single_click
import interop.gtk_tree_view_get_bin_window
import interop.gtk_tree_view_get_column
import interop.gtk_tree_view_get_enable_search
import interop.gtk_tree_view_get_enable_tree_lines
import interop.gtk_tree_view_get_expander_column
import interop.gtk_tree_view_get_fixed_height_mode
import interop.gtk_tree_view_get_grid_lines
import interop.gtk_tree_view_get_headers_clickable
import interop.gtk_tree_view_get_headers_visible
import interop.gtk_tree_view_get_hover_expand
import interop.gtk_tree_view_get_hover_selection
import interop.gtk_tree_view_get_level_indentation
import interop.gtk_tree_view_get_model
import interop.gtk_tree_view_get_n_columns
import interop.gtk_tree_view_get_reorderable
import interop.gtk_tree_view_get_row_separator_func
import interop.gtk_tree_view_get_rubber_banding
import interop.gtk_tree_view_get_search_column
import interop.gtk_tree_view_get_search_entry
import interop.gtk_tree_view_get_search_equal_func
import interop.gtk_tree_view_get_search_position_func
import interop.gtk_tree_view_get_selection
import interop.gtk_tree_view_get_show_expanders
import interop.gtk_tree_view_get_tooltip_column
import interop.gtk_tree_view_insert_column
import interop.gtk_tree_view_is_rubber_banding_active
import interop.gtk_tree_view_move_column_after
import interop.gtk_tree_view_new
import interop.gtk_tree_view_new_with_model
import interop.gtk_tree_view_remove_column
import interop.gtk_tree_view_row_activated
import interop.gtk_tree_view_row_expanded
import interop.gtk_tree_view_scroll_to_cell
import interop.gtk_tree_view_scroll_to_point
import interop.gtk_tree_view_set_activate_on_single_click
import interop.gtk_tree_view_set_cursor
import interop.gtk_tree_view_set_cursor_on_cell
import interop.gtk_tree_view_set_drag_dest_row
import interop.gtk_tree_view_set_enable_search
import interop.gtk_tree_view_set_enable_tree_lines
import interop.gtk_tree_view_set_expander_column
import interop.gtk_tree_view_set_fixed_height_mode
import interop.gtk_tree_view_set_grid_lines
import interop.gtk_tree_view_set_headers_clickable
import interop.gtk_tree_view_set_headers_visible
import interop.gtk_tree_view_set_hover_expand
import interop.gtk_tree_view_set_hover_selection
import interop.gtk_tree_view_set_level_indentation
import interop.gtk_tree_view_set_model
import interop.gtk_tree_view_set_reorderable
import interop.gtk_tree_view_set_rubber_banding
import interop.gtk_tree_view_set_search_column
import interop.gtk_tree_view_set_search_entry
import interop.gtk_tree_view_set_show_expanders
import interop.gtk_tree_view_set_tooltip_cell
import interop.gtk_tree_view_set_tooltip_column
import interop.gtk_tree_view_set_tooltip_row
import interop.gtk_tree_view_unset_rows_drag_dest
import interop.gtk_tree_view_unset_rows_drag_source
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.DragAction
import org.gnome.gdk.ModifierType
import org.gnome.gdk.Window
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias TreeView = CPointer<GtkTreeView>

public val TreeView.asObject: Object
  get() = reinterpret()

public val TreeView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TreeView.asWidget: Widget
  get() = reinterpret()

public val TreeView.asContainer: Container
  get() = reinterpret()

public object TreeViewFactory {
  public fun new(): TreeView = gtk_tree_view_new()!!.reinterpret()

  public fun newWithModel(model: TreeModel?): TreeView =
      gtk_tree_view_new_with_model(model?.reinterpret())!!.reinterpret()
}

public val TreeView.parent: Container
  get() = pointed.parent.ptr

public var TreeView.activateOnSingleClick: Boolean
  get() = gtk_tree_view_get_activate_on_single_click(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_activate_on_single_click(this@activateOnSingleClick, `value`.toInt())
  }

public val TreeView.binWindow: Window?
  get() = gtk_tree_view_get_bin_window(this)?.reinterpret()

public var TreeView.enableSearch: Boolean
  get() = gtk_tree_view_get_enable_search(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_enable_search(this@enableSearch, `value`.toInt())
  }

public var TreeView.enableTreeLines: Boolean
  get() = gtk_tree_view_get_enable_tree_lines(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_enable_tree_lines(this@enableTreeLines, `value`.toInt())
  }

public var TreeView.expanderColumn: TreeViewColumn?
  get() = gtk_tree_view_get_expander_column(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_expander_column(this@expanderColumn, `value`)
  }

public var TreeView.fixedHeightMode: Boolean
  get() = gtk_tree_view_get_fixed_height_mode(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_fixed_height_mode(this@fixedHeightMode, `value`.toInt())
  }

public var TreeView.gridLines: TreeViewGridLines
  get() = gtk_tree_view_get_grid_lines(this)
  set(`value`) {
    gtk_tree_view_set_grid_lines(this@gridLines, `value`)
  }

public var TreeView.headersClickable: Boolean
  get() = gtk_tree_view_get_headers_clickable(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_headers_clickable(this@headersClickable, `value`.toInt())
  }

public var TreeView.headersVisible: Boolean
  get() = gtk_tree_view_get_headers_visible(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_headers_visible(this@headersVisible, `value`.toInt())
  }

public var TreeView.hoverExpand: Boolean
  get() = gtk_tree_view_get_hover_expand(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_hover_expand(this@hoverExpand, `value`.toInt())
  }

public var TreeView.hoverSelection: Boolean
  get() = gtk_tree_view_get_hover_selection(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_hover_selection(this@hoverSelection, `value`.toInt())
  }

public var TreeView.levelIndentation: Int
  get() = gtk_tree_view_get_level_indentation(this)
  set(`value`) {
    gtk_tree_view_set_level_indentation(this@levelIndentation, `value`)
  }

public var TreeView.model: TreeModel?
  get() = gtk_tree_view_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_model(this@model, `value`)
  }

public val TreeView.nColumns: UInt
  get() = gtk_tree_view_get_n_columns(this)

public var TreeView.reorderable: Boolean
  get() = gtk_tree_view_get_reorderable(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_reorderable(this@reorderable, `value`.toInt())
  }

public val TreeView.rowSeparatorFunc: TreeViewRowSeparatorFunc?
  get() = gtk_tree_view_get_row_separator_func(this)?.reinterpret()

public var TreeView.rubberBanding: Boolean
  get() = gtk_tree_view_get_rubber_banding(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_rubber_banding(this@rubberBanding, `value`.toInt())
  }

public var TreeView.searchColumn: Int
  get() = gtk_tree_view_get_search_column(this)
  set(`value`) {
    gtk_tree_view_set_search_column(this@searchColumn, `value`)
  }

public var TreeView.searchEntry: Entry?
  get() = gtk_tree_view_get_search_entry(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_set_search_entry(this@searchEntry, `value`)
  }

public val TreeView.searchEqualFunc: TreeViewSearchEqualFunc?
  get() = gtk_tree_view_get_search_equal_func(this)?.reinterpret()

public val TreeView.searchPositionFunc: TreeViewSearchPositionFunc?
  get() = gtk_tree_view_get_search_position_func(this)?.reinterpret()

public val TreeView.selection: TreeSelection?
  get() = gtk_tree_view_get_selection(this)?.reinterpret()

public var TreeView.showExpanders: Boolean
  get() = gtk_tree_view_get_show_expanders(this).toBoolean()
  set(`value`) {
    gtk_tree_view_set_show_expanders(this@showExpanders, `value`.toInt())
  }

public var TreeView.tooltipColumn: Int
  get() = gtk_tree_view_get_tooltip_column(this)
  set(`value`) {
    gtk_tree_view_set_tooltip_column(this@tooltipColumn, `value`)
  }

public fun TreeView.appendColumn(column: TreeViewColumn?): Int =
    gtk_tree_view_append_column(this@appendColumn, column?.reinterpret())

public fun TreeView.collapseAll(): Unit {
  gtk_tree_view_collapse_all(this@collapseAll)
}

public fun TreeView.collapseRow(path: TreePath?): Boolean =
    gtk_tree_view_collapse_row(this@collapseRow, path?.reinterpret()).toBoolean()

public fun TreeView.columnsAutosize(): Unit {
  gtk_tree_view_columns_autosize(this@columnsAutosize)
}

public fun TreeView.enableModelDragDest(
  targets: Array<TargetEntry>?,
  nTargets: Int,
  actions: DragAction
): Unit {
  memScoped { gtk_tree_view_enable_model_drag_dest(this@enableModelDragDest, targets?.map {
      it.pointed }?.toTypedArray()?.toCArray(memScope), nTargets, actions) }
}

public fun TreeView.enableModelDragSource(
  startButtonMask: ModifierType,
  targets: Array<TargetEntry>?,
  nTargets: Int,
  actions: DragAction
): Unit {
  memScoped { gtk_tree_view_enable_model_drag_source(this@enableModelDragSource, startButtonMask,
      targets?.map { it.pointed }?.toTypedArray()?.toCArray(memScope), nTargets, actions) }
}

public fun TreeView.expandAll(): Unit {
  gtk_tree_view_expand_all(this@expandAll)
}

public fun TreeView.expandRow(path: TreePath?, openAll: Boolean): Boolean =
    gtk_tree_view_expand_row(this@expandRow, path?.reinterpret(), openAll.toInt()).toBoolean()

public fun TreeView.expandToPath(path: TreePath?): Unit {
  gtk_tree_view_expand_to_path(this@expandToPath, path?.reinterpret())
}

public fun TreeView.getColumn(n: Int): TreeViewColumn? = gtk_tree_view_get_column(this@getColumn,
    n)?.reinterpret()

public fun TreeView.insertColumn(column: TreeViewColumn?, position: Int): Int =
    gtk_tree_view_insert_column(this@insertColumn, column?.reinterpret(), position)

public fun TreeView.isRubberBandingActive(): Boolean =
    gtk_tree_view_is_rubber_banding_active(this@isRubberBandingActive).toBoolean()

public fun TreeView.moveColumnAfter(column: TreeViewColumn?, baseColumn: TreeViewColumn?): Unit {
  gtk_tree_view_move_column_after(this@moveColumnAfter, column?.reinterpret(),
      baseColumn?.reinterpret())
}

public fun TreeView.removeColumn(column: TreeViewColumn?): Int =
    gtk_tree_view_remove_column(this@removeColumn, column?.reinterpret())

public fun TreeView.rowActivated(path: TreePath?, column: TreeViewColumn?): Unit {
  gtk_tree_view_row_activated(this@rowActivated, path?.reinterpret(), column?.reinterpret())
}

public fun TreeView.rowExpanded(path: TreePath?): Boolean =
    gtk_tree_view_row_expanded(this@rowExpanded, path?.reinterpret()).toBoolean()

public fun TreeView.scrollToCell(
  path: TreePath?,
  column: TreeViewColumn?,
  useAlign: Boolean,
  rowAlign: Float,
  colAlign: Float
): Unit {
  gtk_tree_view_scroll_to_cell(this@scrollToCell, path?.reinterpret(), column?.reinterpret(),
      useAlign.toInt(), rowAlign, colAlign)
}

public fun TreeView.scrollToPoint(treeX: Int, treeY: Int): Unit {
  gtk_tree_view_scroll_to_point(this@scrollToPoint, treeX, treeY)
}

public fun TreeView.setCursor(
  path: TreePath?,
  focusColumn: TreeViewColumn?,
  startEditing: Boolean
): Unit {
  gtk_tree_view_set_cursor(this@setCursor, path?.reinterpret(), focusColumn?.reinterpret(),
      startEditing.toInt())
}

public fun TreeView.setCursorOnCell(
  path: TreePath?,
  focusColumn: TreeViewColumn?,
  focusCell: CellRenderer?,
  startEditing: Boolean
): Unit {
  gtk_tree_view_set_cursor_on_cell(this@setCursorOnCell, path?.reinterpret(),
      focusColumn?.reinterpret(), focusCell?.reinterpret(), startEditing.toInt())
}

public fun TreeView.setDragDestRow(path: TreePath?, pos: TreeViewDropPosition): Unit {
  gtk_tree_view_set_drag_dest_row(this@setDragDestRow, path?.reinterpret(), pos)
}

public fun TreeView.setTooltipCell(
  tooltip: Tooltip?,
  path: TreePath?,
  column: TreeViewColumn?,
  cell: CellRenderer?
): Unit {
  gtk_tree_view_set_tooltip_cell(this@setTooltipCell, tooltip?.reinterpret(), path?.reinterpret(),
      column?.reinterpret(), cell?.reinterpret())
}

public fun TreeView.setTooltipRow(tooltip: Tooltip?, path: TreePath?): Unit {
  gtk_tree_view_set_tooltip_row(this@setTooltipRow, tooltip?.reinterpret(), path?.reinterpret())
}

public fun TreeView.unsetRowsDragDest(): Unit {
  gtk_tree_view_unset_rows_drag_dest(this@unsetRowsDragDest)
}

public fun TreeView.unsetRowsDragSource(): Unit {
  gtk_tree_view_unset_rows_drag_source(this@unsetRowsDragSource)
}

public fun TreeView.onColumnsChanged(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("columns-changed") { callback(this) }
  return this
}

public fun TreeView.onCursorChanged(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("cursor-changed") { callback(this) }
  return this
}

public fun TreeView.onExpandCollapseCursorRow(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("expand-collapse-cursor-row") { callback(this) }
  return this
}

public fun TreeView.onMoveCursor(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun TreeView.onRowActivated(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("row-activated") { callback(this) }
  return this
}

public fun TreeView.onRowCollapsed(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("row-collapsed") { callback(this) }
  return this
}

public fun TreeView.onRowExpanded(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("row-expanded") { callback(this) }
  return this
}

public fun TreeView.onSelectAll(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("select-all") { callback(this) }
  return this
}

public fun TreeView.onSelectCursorParent(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("select-cursor-parent") { callback(this) }
  return this
}

public fun TreeView.onSelectCursorRow(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("select-cursor-row") { callback(this) }
  return this
}

public fun TreeView.onStartInteractiveSearch(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("start-interactive-search") { callback(this) }
  return this
}

public fun TreeView.onTestCollapseRow(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("test-collapse-row") { callback(this) }
  return this
}

public fun TreeView.onTestExpandRow(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("test-expand-row") { callback(this) }
  return this
}

public fun TreeView.onToggleCursorRow(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("toggle-cursor-row") { callback(this) }
  return this
}

public fun TreeView.onUnselectAll(callback: (TreeView) -> Unit): TreeView {
  // TODO - handle callback data

  asObject.connect("unselect-all") { callback(this) }
  return this
}
