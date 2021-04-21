// TODO - constructor: new_with_attributes
// TODO - method: cell_get_position
// TODO - method: cell_get_size
// TODO - method: set_attributes
// TODO - method: set_cell_data_func
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

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
import gtk3.gtk_tree_view_column_get_sizing
import gtk3.gtk_tree_view_column_get_sort_column_id
import gtk3.gtk_tree_view_column_get_sort_indicator
import gtk3.gtk_tree_view_column_get_sort_order
import gtk3.gtk_tree_view_column_get_spacing
import gtk3.gtk_tree_view_column_get_title
import gtk3.gtk_tree_view_column_get_tree_view
import gtk3.gtk_tree_view_column_get_visible
import gtk3.gtk_tree_view_column_get_widget
import gtk3.gtk_tree_view_column_get_width
import gtk3.gtk_tree_view_column_get_x_offset
import gtk3.gtk_tree_view_column_new
import gtk3.gtk_tree_view_column_new_with_area
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
import gtk3.gtk_tree_view_column_set_sizing
import gtk3.gtk_tree_view_column_set_sort_column_id
import gtk3.gtk_tree_view_column_set_sort_indicator
import gtk3.gtk_tree_view_column_set_sort_order
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
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias TreeViewColumn = CPointer<GtkTreeViewColumn>

public val TreeViewColumn.asObject: Object
  get() = reinterpret()

public val TreeViewColumn.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public object TreeViewColumnFactory {
  public fun new(): TreeViewColumn = gtk_tree_view_column_new()!!.reinterpret()

  public fun newWithArea(area: CellArea?): TreeViewColumn =
      gtk_tree_view_column_new_with_area(area?.reinterpret())!!.reinterpret()
}

public var TreeViewColumn.alignment: Float
  get() = gtk_tree_view_column_get_alignment(this)
  set(`value`) {
    gtk_tree_view_column_set_alignment(this, value)
  }

public val TreeViewColumn.button: Widget?
  get() = gtk_tree_view_column_get_button(this)?.reinterpret()

public var TreeViewColumn.clickable: Boolean
  get() = gtk_tree_view_column_get_clickable(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_clickable(this, value.toInt)
  }

public var TreeViewColumn.expand: Boolean
  get() = gtk_tree_view_column_get_expand(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_expand(this, value.toInt)
  }

public var TreeViewColumn.fixedWidth: Int
  get() = gtk_tree_view_column_get_fixed_width(this)
  set(`value`) {
    gtk_tree_view_column_set_fixed_width(this, value)
  }

public var TreeViewColumn.maxWidth: Int
  get() = gtk_tree_view_column_get_max_width(this)
  set(`value`) {
    gtk_tree_view_column_set_max_width(this, value)
  }

public var TreeViewColumn.minWidth: Int
  get() = gtk_tree_view_column_get_min_width(this)
  set(`value`) {
    gtk_tree_view_column_set_min_width(this, value)
  }

public var TreeViewColumn.reorderable: Boolean
  get() = gtk_tree_view_column_get_reorderable(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_reorderable(this, value.toInt)
  }

public var TreeViewColumn.resizable: Boolean
  get() = gtk_tree_view_column_get_resizable(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_resizable(this, value.toInt)
  }

public var TreeViewColumn.sizing: TreeViewColumnSizing
  get() = gtk_tree_view_column_get_sizing(this)
  set(`value`) {
    gtk_tree_view_column_set_sizing(this, value)
  }

public var TreeViewColumn.sortColumnId: Int
  get() = gtk_tree_view_column_get_sort_column_id(this)
  set(`value`) {
    gtk_tree_view_column_set_sort_column_id(this, value)
  }

public var TreeViewColumn.sortIndicator: Boolean
  get() = gtk_tree_view_column_get_sort_indicator(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_sort_indicator(this, value.toInt)
  }

public var TreeViewColumn.sortOrder: SortType
  get() = gtk_tree_view_column_get_sort_order(this)
  set(`value`) {
    gtk_tree_view_column_set_sort_order(this, value)
  }

public var TreeViewColumn.spacing: Int
  get() = gtk_tree_view_column_get_spacing(this)
  set(`value`) {
    gtk_tree_view_column_set_spacing(this, value)
  }

public var TreeViewColumn.title: String
  get() = gtk_tree_view_column_get_title(this).toKString
  set(`value`) {
    gtk_tree_view_column_set_title(this, value)
  }

public val TreeViewColumn.treeView: Widget?
  get() = gtk_tree_view_column_get_tree_view(this)?.reinterpret()

public var TreeViewColumn.visible: Boolean
  get() = gtk_tree_view_column_get_visible(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_visible(this, value.toInt)
  }

public var TreeViewColumn.widget: Widget?
  get() = gtk_tree_view_column_get_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_column_set_widget(this, value)
  }

public val TreeViewColumn.width: Int
  get() = gtk_tree_view_column_get_width(this)

public val TreeViewColumn.xOffset: Int
  get() = gtk_tree_view_column_get_x_offset(this)

public fun TreeViewColumn.addAttribute(
  cellRenderer: CellRenderer?,
  attribute: String,
  column: Int
): Unit {
  gtk_tree_view_column_add_attribute(this, cellRenderer?.reinterpret(), attribute, column)
}

public fun TreeViewColumn.cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this).toBoolean

public fun TreeViewColumn.cellSetCellData(
  treeModel: TreeModel?,
  iter: TreeIter?,
  isExpander: Boolean,
  isExpanded: Boolean
): Unit {
  gtk_tree_view_column_cell_set_cell_data(this, treeModel?.reinterpret(), iter?.reinterpret(),
      isExpander.toInt, isExpanded.toInt)
}

public fun TreeViewColumn.clear(): Unit {
  gtk_tree_view_column_clear(this)
}

public fun TreeViewColumn.clearAttributes(cellRenderer: CellRenderer?): Unit {
  gtk_tree_view_column_clear_attributes(this, cellRenderer?.reinterpret())
}

public fun TreeViewColumn.clicked(): Unit {
  gtk_tree_view_column_clicked(this)
}

public fun TreeViewColumn.focusCell(cell: CellRenderer?): Unit {
  gtk_tree_view_column_focus_cell(this, cell?.reinterpret())
}

public fun TreeViewColumn.packEnd(cell: CellRenderer?, expand: Boolean): Unit {
  gtk_tree_view_column_pack_end(this, cell?.reinterpret(), expand.toInt)
}

public fun TreeViewColumn.packStart(cell: CellRenderer?, expand: Boolean): Unit {
  gtk_tree_view_column_pack_start(this, cell?.reinterpret(), expand.toInt)
}

public fun TreeViewColumn.queueResize(): Unit {
  gtk_tree_view_column_queue_resize(this)
}

public fun TreeViewColumn.onClicked(callback: (TreeViewColumn) -> Unit): TreeViewColumn {
  // TODO - handle callback data

  asObject.connect("clicked") { callback(this) }
  return this
}
