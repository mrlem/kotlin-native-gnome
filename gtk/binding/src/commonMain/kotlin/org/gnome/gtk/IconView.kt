// TODO - convert_widget_to_bin_window_coords
// TODO - create_drag_icon
// TODO - enable_model_drag_dest
// TODO - enable_model_drag_source
// TODO - get_cell_rect
// TODO - get_cursor
// TODO - get_dest_item_at_pos
// TODO - get_drag_dest_item
// TODO - get_item_at_pos
// TODO - get_item_orientation
// TODO - get_selected_items
// TODO - get_selection_mode
// TODO - get_tooltip_context
// TODO - get_visible_range
// TODO - selected_foreach
// TODO - set_drag_dest_item
// TODO - set_item_orientation
// TODO - set_selection_mode
//
package org.gnome.gtk

import gtk3.GtkIconView
import gtk3.gtk_icon_view_get_activate_on_single_click
import gtk3.gtk_icon_view_get_column_spacing
import gtk3.gtk_icon_view_get_columns
import gtk3.gtk_icon_view_get_item_column
import gtk3.gtk_icon_view_get_item_padding
import gtk3.gtk_icon_view_get_item_row
import gtk3.gtk_icon_view_get_item_width
import gtk3.gtk_icon_view_get_margin
import gtk3.gtk_icon_view_get_markup_column
import gtk3.gtk_icon_view_get_model
import gtk3.gtk_icon_view_get_path_at_pos
import gtk3.gtk_icon_view_get_pixbuf_column
import gtk3.gtk_icon_view_get_reorderable
import gtk3.gtk_icon_view_get_row_spacing
import gtk3.gtk_icon_view_get_spacing
import gtk3.gtk_icon_view_get_text_column
import gtk3.gtk_icon_view_get_tooltip_column
import gtk3.gtk_icon_view_item_activated
import gtk3.gtk_icon_view_path_is_selected
import gtk3.gtk_icon_view_scroll_to_path
import gtk3.gtk_icon_view_select_all
import gtk3.gtk_icon_view_select_path
import gtk3.gtk_icon_view_set_activate_on_single_click
import gtk3.gtk_icon_view_set_column_spacing
import gtk3.gtk_icon_view_set_columns
import gtk3.gtk_icon_view_set_cursor
import gtk3.gtk_icon_view_set_item_padding
import gtk3.gtk_icon_view_set_item_width
import gtk3.gtk_icon_view_set_margin
import gtk3.gtk_icon_view_set_markup_column
import gtk3.gtk_icon_view_set_model
import gtk3.gtk_icon_view_set_pixbuf_column
import gtk3.gtk_icon_view_set_reorderable
import gtk3.gtk_icon_view_set_row_spacing
import gtk3.gtk_icon_view_set_spacing
import gtk3.gtk_icon_view_set_text_column
import gtk3.gtk_icon_view_set_tooltip_cell
import gtk3.gtk_icon_view_set_tooltip_column
import gtk3.gtk_icon_view_set_tooltip_item
import gtk3.gtk_icon_view_unselect_all
import gtk3.gtk_icon_view_unselect_path
import gtk3.gtk_icon_view_unset_model_drag_dest
import gtk3.gtk_icon_view_unset_model_drag_source
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

public typealias IconView = CPointer<GtkIconView>

public val IconView.asObject: Object
  get() = reinterpret()

public val IconView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val IconView.asWidget: Widget
  get() = reinterpret()

public val IconView.asContainer: Container
  get() = reinterpret()

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

public fun IconView.getItemColumn(path: TreePath): Int = gtk_icon_view_get_item_column(this,
    path.reinterpret())

public fun IconView.getItemRow(path: TreePath): Int = gtk_icon_view_get_item_row(this,
    path.reinterpret())

public fun IconView.getPathAtPos(x: Int, y: Int): TreePath? = gtk_icon_view_get_path_at_pos(this, x,
    y)?.reinterpret()

public fun IconView.itemActivated(path: TreePath): Unit {
  gtk_icon_view_item_activated(this, path.reinterpret())
}

public fun IconView.pathIsSelected(path: TreePath): Boolean = gtk_icon_view_path_is_selected(this,
    path.reinterpret()).toBoolean

public fun IconView.scrollToPath(
  path: TreePath,
  useAlign: Boolean,
  rowAlign: Float,
  colAlign: Float
): Unit {
  gtk_icon_view_scroll_to_path(this, path.reinterpret(), useAlign.toInt, rowAlign, colAlign)
}

public fun IconView.selectAll(): Unit {
  gtk_icon_view_select_all(this)
}

public fun IconView.selectPath(path: TreePath): Unit {
  gtk_icon_view_select_path(this, path.reinterpret())
}

public fun IconView.setCursor(
  path: TreePath,
  cell: CellRenderer,
  startEditing: Boolean
): Unit {
  gtk_icon_view_set_cursor(this, path.reinterpret(), cell.reinterpret(), startEditing.toInt)
}

public fun IconView.setTooltipCell(
  tooltip: Tooltip,
  path: TreePath,
  cell: CellRenderer
): Unit {
  gtk_icon_view_set_tooltip_cell(this, tooltip.reinterpret(), path.reinterpret(),
      cell.reinterpret())
}

public fun IconView.setTooltipItem(tooltip: Tooltip, path: TreePath): Unit {
  gtk_icon_view_set_tooltip_item(this, tooltip.reinterpret(), path.reinterpret())
}

public fun IconView.unselectAll(): Unit {
  gtk_icon_view_unselect_all(this)
}

public fun IconView.unselectPath(path: TreePath): Unit {
  gtk_icon_view_unselect_path(this, path.reinterpret())
}

public fun IconView.unsetModelDragDest(): Unit {
  gtk_icon_view_unset_model_drag_dest(this)
}

public fun IconView.unsetModelDragSource(): Unit {
  gtk_icon_view_unset_model_drag_source(this)
}
