// TODO - cell_get_position
// TODO - cell_get_size
// TODO - get_sizing
// TODO - get_sort_order
// TODO - set_attributes
// TODO - set_cell_data_func
// TODO - set_sizing
// TODO - set_sort_order
//
package org.gnome.gtk

import gtk3.GtkTreeViewColumn
import gtk3.gtk_tree_view_column_add_attribute
import gtk3.gtk_tree_view_column_cell_is_visible
import gtk3.gtk_tree_view_column_cell_set_cell_data
import gtk3.gtk_tree_view_column_clear
import gtk3.gtk_tree_view_column_clear_attributes
import gtk3.gtk_tree_view_column_clicked
import gtk3.gtk_tree_view_column_focus_cell
import gtk3.gtk_tree_view_column_get_alignment
import gtk3.gtk_tree_view_column_get_button
import gtk3.gtk_tree_view_column_get_clickable
import gtk3.gtk_tree_view_column_get_expand
import gtk3.gtk_tree_view_column_get_fixed_width
import gtk3.gtk_tree_view_column_get_max_width
import gtk3.gtk_tree_view_column_get_min_width
import gtk3.gtk_tree_view_column_get_reorderable
import gtk3.gtk_tree_view_column_get_resizable
import gtk3.gtk_tree_view_column_get_sort_column_id
import gtk3.gtk_tree_view_column_get_sort_indicator
import gtk3.gtk_tree_view_column_get_spacing
import gtk3.gtk_tree_view_column_get_title
import gtk3.gtk_tree_view_column_get_tree_view
import gtk3.gtk_tree_view_column_get_visible
import gtk3.gtk_tree_view_column_get_widget
import gtk3.gtk_tree_view_column_get_width
import gtk3.gtk_tree_view_column_get_x_offset
import gtk3.gtk_tree_view_column_pack_end
import gtk3.gtk_tree_view_column_pack_start
import gtk3.gtk_tree_view_column_queue_resize
import gtk3.gtk_tree_view_column_set_alignment
import gtk3.gtk_tree_view_column_set_clickable
import gtk3.gtk_tree_view_column_set_expand
import gtk3.gtk_tree_view_column_set_fixed_width
import gtk3.gtk_tree_view_column_set_max_width
import gtk3.gtk_tree_view_column_set_min_width
import gtk3.gtk_tree_view_column_set_reorderable
import gtk3.gtk_tree_view_column_set_resizable
import gtk3.gtk_tree_view_column_set_sort_column_id
import gtk3.gtk_tree_view_column_set_sort_indicator
import gtk3.gtk_tree_view_column_set_spacing
import gtk3.gtk_tree_view_column_set_title
import gtk3.gtk_tree_view_column_set_visible
import gtk3.gtk_tree_view_column_set_widget
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias TreeViewColumn = CPointer<GtkTreeViewColumn>

public val TreeViewColumn.asObject: Object
  get() = reinterpret()

public val TreeViewColumn.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun TreeViewColumn.addAttribute(
  cellRenderer: CellRenderer,
  attribute: String?,
  column: Int
): Unit {
  gtk_tree_view_column_add_attribute(this, cellRenderer.reinterpret(), attribute, column)
}

public fun TreeViewColumn.cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this).toBoolean

public fun TreeViewColumn.cellSetCellData(
  treeModel: TreeModel,
  iter: TreeIter,
  isExpander: Boolean,
  isExpanded: Boolean
): Unit {
  gtk_tree_view_column_cell_set_cell_data(this, treeModel.reinterpret(), iter.reinterpret(),
      isExpander.toInt, isExpanded.toInt)
}

public fun TreeViewColumn.clear(): Unit {
  gtk_tree_view_column_clear(this)
}

public fun TreeViewColumn.clearAttributes(cellRenderer: CellRenderer): Unit {
  gtk_tree_view_column_clear_attributes(this, cellRenderer.reinterpret())
}

public fun TreeViewColumn.clicked(): Unit {
  gtk_tree_view_column_clicked(this)
}

public fun TreeViewColumn.focusCell(cell: CellRenderer): Unit {
  gtk_tree_view_column_focus_cell(this, cell.reinterpret())
}

public fun TreeViewColumn.getAlignment(): Float = gtk_tree_view_column_get_alignment(this)

public fun TreeViewColumn.getButton(): Widget? =
    gtk_tree_view_column_get_button(this)?.reinterpret()

public fun TreeViewColumn.getClickable(): Boolean =
    gtk_tree_view_column_get_clickable(this).toBoolean

public fun TreeViewColumn.getExpand(): Boolean = gtk_tree_view_column_get_expand(this).toBoolean

public fun TreeViewColumn.getFixedWidth(): Int = gtk_tree_view_column_get_fixed_width(this)

public fun TreeViewColumn.getMaxWidth(): Int = gtk_tree_view_column_get_max_width(this)

public fun TreeViewColumn.getMinWidth(): Int = gtk_tree_view_column_get_min_width(this)

public fun TreeViewColumn.getReorderable(): Boolean =
    gtk_tree_view_column_get_reorderable(this).toBoolean

public fun TreeViewColumn.getResizable(): Boolean =
    gtk_tree_view_column_get_resizable(this).toBoolean

public fun TreeViewColumn.getSortColumnId(): Int = gtk_tree_view_column_get_sort_column_id(this)

public fun TreeViewColumn.getSortIndicator(): Boolean =
    gtk_tree_view_column_get_sort_indicator(this).toBoolean

public fun TreeViewColumn.getSpacing(): Int = gtk_tree_view_column_get_spacing(this)

public fun TreeViewColumn.getTitle(): String = gtk_tree_view_column_get_title(this).toKString

public fun TreeViewColumn.getTreeView(): Widget? =
    gtk_tree_view_column_get_tree_view(this)?.reinterpret()

public fun TreeViewColumn.getVisible(): Boolean = gtk_tree_view_column_get_visible(this).toBoolean

public fun TreeViewColumn.getWidget(): Widget? =
    gtk_tree_view_column_get_widget(this)?.reinterpret()

public fun TreeViewColumn.getWidth(): Int = gtk_tree_view_column_get_width(this)

public fun TreeViewColumn.getXOffset(): Int = gtk_tree_view_column_get_x_offset(this)

public fun TreeViewColumn.packEnd(cell: CellRenderer, expand: Boolean): Unit {
  gtk_tree_view_column_pack_end(this, cell.reinterpret(), expand.toInt)
}

public fun TreeViewColumn.packStart(cell: CellRenderer, expand: Boolean): Unit {
  gtk_tree_view_column_pack_start(this, cell.reinterpret(), expand.toInt)
}

public fun TreeViewColumn.queueResize(): Unit {
  gtk_tree_view_column_queue_resize(this)
}

public fun TreeViewColumn.setAlignment(xalign: Float): Unit {
  gtk_tree_view_column_set_alignment(this, xalign)
}

public fun TreeViewColumn.setClickable(clickable: Boolean): Unit {
  gtk_tree_view_column_set_clickable(this, clickable.toInt)
}

public fun TreeViewColumn.setExpand(expand: Boolean): Unit {
  gtk_tree_view_column_set_expand(this, expand.toInt)
}

public fun TreeViewColumn.setFixedWidth(fixedWidth: Int): Unit {
  gtk_tree_view_column_set_fixed_width(this, fixedWidth)
}

public fun TreeViewColumn.setMaxWidth(maxWidth: Int): Unit {
  gtk_tree_view_column_set_max_width(this, maxWidth)
}

public fun TreeViewColumn.setMinWidth(minWidth: Int): Unit {
  gtk_tree_view_column_set_min_width(this, minWidth)
}

public fun TreeViewColumn.setReorderable(reorderable: Boolean): Unit {
  gtk_tree_view_column_set_reorderable(this, reorderable.toInt)
}

public fun TreeViewColumn.setResizable(resizable: Boolean): Unit {
  gtk_tree_view_column_set_resizable(this, resizable.toInt)
}

public fun TreeViewColumn.setSortColumnId(sortColumnId: Int): Unit {
  gtk_tree_view_column_set_sort_column_id(this, sortColumnId)
}

public fun TreeViewColumn.setSortIndicator(setting: Boolean): Unit {
  gtk_tree_view_column_set_sort_indicator(this, setting.toInt)
}

public fun TreeViewColumn.setSpacing(spacing: Int): Unit {
  gtk_tree_view_column_set_spacing(this, spacing)
}

public fun TreeViewColumn.setTitle(title: String?): Unit {
  gtk_tree_view_column_set_title(this, title)
}

public fun TreeViewColumn.setVisible(visible: Boolean): Unit {
  gtk_tree_view_column_set_visible(this, visible.toInt)
}

public fun TreeViewColumn.setWidget(widget: Widget): Unit {
  gtk_tree_view_column_set_widget(this, widget.reinterpret())
}
