// TODO - method: convert_widget_to_bin_window_coords
// TODO - method: create_drag_icon
// TODO - method: enable_model_drag_dest
// TODO - method: enable_model_drag_source
// TODO - method: get_cell_rect
// TODO - method: get_cursor
// TODO - method: get_dest_item_at_pos
// TODO - method: get_drag_dest_item
// TODO - method: get_item_at_pos
// TODO - method: get_selected_items
// TODO - method: get_tooltip_context
// TODO - method: get_visible_range
// TODO - method: selected_foreach
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIconView
import interop.gtk_icon_view_get_activate_on_single_click
import interop.gtk_icon_view_get_column_spacing
import interop.gtk_icon_view_get_columns
import interop.gtk_icon_view_get_item_column
import interop.gtk_icon_view_get_item_orientation
import interop.gtk_icon_view_get_item_padding
import interop.gtk_icon_view_get_item_row
import interop.gtk_icon_view_get_item_width
import interop.gtk_icon_view_get_margin
import interop.gtk_icon_view_get_markup_column
import interop.gtk_icon_view_get_model
import interop.gtk_icon_view_get_path_at_pos
import interop.gtk_icon_view_get_pixbuf_column
import interop.gtk_icon_view_get_reorderable
import interop.gtk_icon_view_get_row_spacing
import interop.gtk_icon_view_get_selection_mode
import interop.gtk_icon_view_get_spacing
import interop.gtk_icon_view_get_text_column
import interop.gtk_icon_view_get_tooltip_column
import interop.gtk_icon_view_item_activated
import interop.gtk_icon_view_new
import interop.gtk_icon_view_new_with_area
import interop.gtk_icon_view_new_with_model
import interop.gtk_icon_view_path_is_selected
import interop.gtk_icon_view_scroll_to_path
import interop.gtk_icon_view_select_all
import interop.gtk_icon_view_select_path
import interop.gtk_icon_view_set_activate_on_single_click
import interop.gtk_icon_view_set_column_spacing
import interop.gtk_icon_view_set_columns
import interop.gtk_icon_view_set_cursor
import interop.gtk_icon_view_set_drag_dest_item
import interop.gtk_icon_view_set_item_orientation
import interop.gtk_icon_view_set_item_padding
import interop.gtk_icon_view_set_item_width
import interop.gtk_icon_view_set_margin
import interop.gtk_icon_view_set_markup_column
import interop.gtk_icon_view_set_model
import interop.gtk_icon_view_set_pixbuf_column
import interop.gtk_icon_view_set_reorderable
import interop.gtk_icon_view_set_row_spacing
import interop.gtk_icon_view_set_selection_mode
import interop.gtk_icon_view_set_spacing
import interop.gtk_icon_view_set_text_column
import interop.gtk_icon_view_set_tooltip_cell
import interop.gtk_icon_view_set_tooltip_column
import interop.gtk_icon_view_set_tooltip_item
import interop.gtk_icon_view_unselect_all
import interop.gtk_icon_view_unselect_path
import interop.gtk_icon_view_unset_model_drag_dest
import interop.gtk_icon_view_unset_model_drag_source
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias IconView = CPointer<GtkIconView>

public val IconView.asObject: Object
  get() = reinterpret()

public val IconView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val IconView.asWidget: Widget
  get() = reinterpret()

public val IconView.asContainer: Container
  get() = reinterpret()

public object IconViewFactory {
  public fun new(): IconView = gtk_icon_view_new()!!.reinterpret()

  public fun newWithArea(area: CellArea?): IconView =
      gtk_icon_view_new_with_area(area?.reinterpret())!!.reinterpret()

  public fun newWithModel(model: TreeModel?): IconView =
      gtk_icon_view_new_with_model(model?.reinterpret())!!.reinterpret()
}

public var IconView.activateOnSingleClick: Boolean
  get() = gtk_icon_view_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_icon_view_set_activate_on_single_click(this, value.toInt)
  }

public var IconView.columnSpacing: Int
  get() = gtk_icon_view_get_column_spacing(this)
  set(`value`) {
    gtk_icon_view_set_column_spacing(this, value)
  }

public var IconView.columns: Int
  get() = gtk_icon_view_get_columns(this)
  set(`value`) {
    gtk_icon_view_set_columns(this, value)
  }

public var IconView.itemOrientation: Orientation
  get() = gtk_icon_view_get_item_orientation(this)
  set(`value`) {
    gtk_icon_view_set_item_orientation(this, value)
  }

public var IconView.itemPadding: Int
  get() = gtk_icon_view_get_item_padding(this)
  set(`value`) {
    gtk_icon_view_set_item_padding(this, value)
  }

public var IconView.itemWidth: Int
  get() = gtk_icon_view_get_item_width(this)
  set(`value`) {
    gtk_icon_view_set_item_width(this, value)
  }

public var IconView.margin: Int
  get() = gtk_icon_view_get_margin(this)
  set(`value`) {
    gtk_icon_view_set_margin(this, value)
  }

public var IconView.markupColumn: Int
  get() = gtk_icon_view_get_markup_column(this)
  set(`value`) {
    gtk_icon_view_set_markup_column(this, value)
  }

public var IconView.model: TreeModel?
  get() = gtk_icon_view_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_icon_view_set_model(this, value)
  }

public var IconView.pixbufColumn: Int
  get() = gtk_icon_view_get_pixbuf_column(this)
  set(`value`) {
    gtk_icon_view_set_pixbuf_column(this, value)
  }

public var IconView.reorderable: Boolean
  get() = gtk_icon_view_get_reorderable(this).toBoolean
  set(`value`) {
    gtk_icon_view_set_reorderable(this, value.toInt)
  }

public var IconView.rowSpacing: Int
  get() = gtk_icon_view_get_row_spacing(this)
  set(`value`) {
    gtk_icon_view_set_row_spacing(this, value)
  }

public var IconView.selectionMode: SelectionMode
  get() = gtk_icon_view_get_selection_mode(this)
  set(`value`) {
    gtk_icon_view_set_selection_mode(this, value)
  }

public var IconView.spacing: Int
  get() = gtk_icon_view_get_spacing(this)
  set(`value`) {
    gtk_icon_view_set_spacing(this, value)
  }

public var IconView.textColumn: Int
  get() = gtk_icon_view_get_text_column(this)
  set(`value`) {
    gtk_icon_view_set_text_column(this, value)
  }

public var IconView.tooltipColumn: Int
  get() = gtk_icon_view_get_tooltip_column(this)
  set(`value`) {
    gtk_icon_view_set_tooltip_column(this, value)
  }

public fun IconView.getItemColumn(path: TreePath?): Int = gtk_icon_view_get_item_column(this,
    path?.reinterpret())

public fun IconView.getItemRow(path: TreePath?): Int = gtk_icon_view_get_item_row(this,
    path?.reinterpret())

public fun IconView.getPathAtPos(x: Int, y: Int): TreePath? = gtk_icon_view_get_path_at_pos(this, x,
    y)?.reinterpret()

public fun IconView.itemActivated(path: TreePath?): Unit {
  gtk_icon_view_item_activated(this, path?.reinterpret())
}

public fun IconView.pathIsSelected(path: TreePath?): Boolean = gtk_icon_view_path_is_selected(this,
    path?.reinterpret()).toBoolean

public fun IconView.scrollToPath(
  path: TreePath?,
  useAlign: Boolean,
  rowAlign: Float,
  colAlign: Float
): Unit {
  gtk_icon_view_scroll_to_path(this, path?.reinterpret(), useAlign.toInt, rowAlign, colAlign)
}

public fun IconView.selectAll(): Unit {
  gtk_icon_view_select_all(this)
}

public fun IconView.selectPath(path: TreePath?): Unit {
  gtk_icon_view_select_path(this, path?.reinterpret())
}

public fun IconView.setCursor(
  path: TreePath?,
  cell: CellRenderer?,
  startEditing: Boolean
): Unit {
  gtk_icon_view_set_cursor(this, path?.reinterpret(), cell?.reinterpret(), startEditing.toInt)
}

public fun IconView.setDragDestItem(path: TreePath?, pos: IconViewDropPosition): Unit {
  gtk_icon_view_set_drag_dest_item(this, path?.reinterpret(), pos)
}

public fun IconView.setTooltipCell(
  tooltip: Tooltip?,
  path: TreePath?,
  cell: CellRenderer?
): Unit {
  gtk_icon_view_set_tooltip_cell(this, tooltip?.reinterpret(), path?.reinterpret(),
      cell?.reinterpret())
}

public fun IconView.setTooltipItem(tooltip: Tooltip?, path: TreePath?): Unit {
  gtk_icon_view_set_tooltip_item(this, tooltip?.reinterpret(), path?.reinterpret())
}

public fun IconView.unselectAll(): Unit {
  gtk_icon_view_unselect_all(this)
}

public fun IconView.unselectPath(path: TreePath?): Unit {
  gtk_icon_view_unselect_path(this, path?.reinterpret())
}

public fun IconView.unsetModelDragDest(): Unit {
  gtk_icon_view_unset_model_drag_dest(this)
}

public fun IconView.unsetModelDragSource(): Unit {
  gtk_icon_view_unset_model_drag_source(this)
}

public fun IconView.onActivateCursorItem(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("activate-cursor-item") { callback(this) }
  return this
}

public fun IconView.onItemActivated(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("item-activated") { callback(this) }
  return this
}

public fun IconView.onMoveCursor(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun IconView.onSelectAll(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("select-all") { callback(this) }
  return this
}

public fun IconView.onSelectCursorItem(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("select-cursor-item") { callback(this) }
  return this
}

public fun IconView.onSelectionChanged(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("selection-changed") { callback(this) }
  return this
}

public fun IconView.onToggleCursorItem(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("toggle-cursor-item") { callback(this) }
  return this
}

public fun IconView.onUnselectAll(callback: (IconView) -> Unit): IconView {
  // TODO - handle callback data

  asObject.connect("unselect-all") { callback(this) }
  return this
}
