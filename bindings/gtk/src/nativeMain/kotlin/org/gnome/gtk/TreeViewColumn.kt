// TODO - constructor: new_with_attributes
// TODO - method: cell_get_position (param type)
// TODO - method: cell_get_size (param type)
// TODO - method: set_attributes (param type)
// TODO - method: set_cell_data_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeViewColumn
import interop.gtk_tree_view_column_add_attribute
import interop.gtk_tree_view_column_cell_is_visible
import interop.gtk_tree_view_column_cell_set_cell_data
import interop.gtk_tree_view_column_clear
import interop.gtk_tree_view_column_clear_attributes
import interop.gtk_tree_view_column_clicked
import interop.gtk_tree_view_column_focus_cell
import interop.gtk_tree_view_column_get_alignment
import interop.gtk_tree_view_column_get_button
import interop.gtk_tree_view_column_get_clickable
import interop.gtk_tree_view_column_get_expand
import interop.gtk_tree_view_column_get_fixed_width
import interop.gtk_tree_view_column_get_max_width
import interop.gtk_tree_view_column_get_min_width
import interop.gtk_tree_view_column_get_reorderable
import interop.gtk_tree_view_column_get_resizable
import interop.gtk_tree_view_column_get_sizing
import interop.gtk_tree_view_column_get_sort_column_id
import interop.gtk_tree_view_column_get_sort_indicator
import interop.gtk_tree_view_column_get_sort_order
import interop.gtk_tree_view_column_get_spacing
import interop.gtk_tree_view_column_get_title
import interop.gtk_tree_view_column_get_tree_view
import interop.gtk_tree_view_column_get_visible
import interop.gtk_tree_view_column_get_widget
import interop.gtk_tree_view_column_get_width
import interop.gtk_tree_view_column_get_x_offset
import interop.gtk_tree_view_column_new
import interop.gtk_tree_view_column_new_with_area
import interop.gtk_tree_view_column_pack_end
import interop.gtk_tree_view_column_pack_start
import interop.gtk_tree_view_column_queue_resize
import interop.gtk_tree_view_column_set_alignment
import interop.gtk_tree_view_column_set_clickable
import interop.gtk_tree_view_column_set_expand
import interop.gtk_tree_view_column_set_fixed_width
import interop.gtk_tree_view_column_set_max_width
import interop.gtk_tree_view_column_set_min_width
import interop.gtk_tree_view_column_set_reorderable
import interop.gtk_tree_view_column_set_resizable
import interop.gtk_tree_view_column_set_sizing
import interop.gtk_tree_view_column_set_sort_column_id
import interop.gtk_tree_view_column_set_sort_indicator
import interop.gtk_tree_view_column_set_sort_order
import interop.gtk_tree_view_column_set_spacing
import interop.gtk_tree_view_column_set_title
import interop.gtk_tree_view_column_set_visible
import interop.gtk_tree_view_column_set_widget
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

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

public val TreeViewColumn.parentInstance: InitiallyUnowned
  get() = pointed.parent_instance.ptr

public var TreeViewColumn.alignment: Float
  get() = gtk_tree_view_column_get_alignment(this)
  set(`value`) {
    gtk_tree_view_column_set_alignment(this@alignment, `value`)
  }

public val TreeViewColumn.button: Widget?
  get() = gtk_tree_view_column_get_button(this)?.reinterpret()

public var TreeViewColumn.clickable: Boolean
  get() = gtk_tree_view_column_get_clickable(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_clickable(this@clickable, `value`.toInt())
  }

public var TreeViewColumn.expand: Boolean
  get() = gtk_tree_view_column_get_expand(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_expand(this@expand, `value`.toInt())
  }

public var TreeViewColumn.fixedWidth: Int
  get() = gtk_tree_view_column_get_fixed_width(this)
  set(`value`) {
    gtk_tree_view_column_set_fixed_width(this@fixedWidth, `value`)
  }

public var TreeViewColumn.maxWidth: Int
  get() = gtk_tree_view_column_get_max_width(this)
  set(`value`) {
    gtk_tree_view_column_set_max_width(this@maxWidth, `value`)
  }

public var TreeViewColumn.minWidth: Int
  get() = gtk_tree_view_column_get_min_width(this)
  set(`value`) {
    gtk_tree_view_column_set_min_width(this@minWidth, `value`)
  }

public var TreeViewColumn.reorderable: Boolean
  get() = gtk_tree_view_column_get_reorderable(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_reorderable(this@reorderable, `value`.toInt())
  }

public var TreeViewColumn.resizable: Boolean
  get() = gtk_tree_view_column_get_resizable(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_resizable(this@resizable, `value`.toInt())
  }

public var TreeViewColumn.sizing: TreeViewColumnSizing
  get() = gtk_tree_view_column_get_sizing(this)
  set(`value`) {
    gtk_tree_view_column_set_sizing(this@sizing, `value`)
  }

public var TreeViewColumn.sortColumnId: Int
  get() = gtk_tree_view_column_get_sort_column_id(this)
  set(`value`) {
    gtk_tree_view_column_set_sort_column_id(this@sortColumnId, `value`)
  }

public var TreeViewColumn.sortIndicator: Boolean
  get() = gtk_tree_view_column_get_sort_indicator(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_sort_indicator(this@sortIndicator, `value`.toInt())
  }

public var TreeViewColumn.sortOrder: SortType
  get() = gtk_tree_view_column_get_sort_order(this)
  set(`value`) {
    gtk_tree_view_column_set_sort_order(this@sortOrder, `value`)
  }

public var TreeViewColumn.spacing: Int
  get() = gtk_tree_view_column_get_spacing(this)
  set(`value`) {
    gtk_tree_view_column_set_spacing(this@spacing, `value`)
  }

public var TreeViewColumn.title: String?
  get() = gtk_tree_view_column_get_title(this).toKString()
  set(`value`) {
    gtk_tree_view_column_set_title(this@title, `value`)
  }

public val TreeViewColumn.treeView: Widget?
  get() = gtk_tree_view_column_get_tree_view(this)?.reinterpret()

public var TreeViewColumn.visible: Boolean
  get() = gtk_tree_view_column_get_visible(this).toBoolean()
  set(`value`) {
    gtk_tree_view_column_set_visible(this@visible, `value`.toInt())
  }

public var TreeViewColumn.widget: Widget?
  get() = gtk_tree_view_column_get_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tree_view_column_set_widget(this@widget, `value`)
  }

public val TreeViewColumn.width: Int
  get() = gtk_tree_view_column_get_width(this)

public val TreeViewColumn.xOffset: Int
  get() = gtk_tree_view_column_get_x_offset(this)

public fun TreeViewColumn.addAttribute(
  cellRenderer: CellRenderer?,
  attribute: String?,
  column: Int
): Unit {
  gtk_tree_view_column_add_attribute(this@addAttribute, cellRenderer?.reinterpret(), attribute,
      column)
}

public fun TreeViewColumn.cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this@cellIsVisible).toBoolean()

public fun TreeViewColumn.cellSetCellData(
  treeModel: TreeModel?,
  iter: TreeIter?,
  isExpander: Boolean,
  isExpanded: Boolean
): Unit {
  gtk_tree_view_column_cell_set_cell_data(this@cellSetCellData, treeModel?.reinterpret(),
      iter?.reinterpret(), isExpander.toInt(), isExpanded.toInt())
}

public fun TreeViewColumn.clear(): Unit {
  gtk_tree_view_column_clear(this@clear)
}

public fun TreeViewColumn.clearAttributes(cellRenderer: CellRenderer?): Unit {
  gtk_tree_view_column_clear_attributes(this@clearAttributes, cellRenderer?.reinterpret())
}

public fun TreeViewColumn.clicked(): Unit {
  gtk_tree_view_column_clicked(this@clicked)
}

public fun TreeViewColumn.focusCell(cell: CellRenderer?): Unit {
  gtk_tree_view_column_focus_cell(this@focusCell, cell?.reinterpret())
}

public fun TreeViewColumn.packEnd(cell: CellRenderer?, expand: Boolean): Unit {
  gtk_tree_view_column_pack_end(this@packEnd, cell?.reinterpret(), expand.toInt())
}

public fun TreeViewColumn.packStart(cell: CellRenderer?, expand: Boolean): Unit {
  gtk_tree_view_column_pack_start(this@packStart, cell?.reinterpret(), expand.toInt())
}

public fun TreeViewColumn.queueResize(): Unit {
  gtk_tree_view_column_queue_resize(this@queueResize)
}

public fun TreeViewColumn.onClicked(callback: (TreeViewColumn) -> Unit): TreeViewColumn {
  // TODO - handle callback data

  asObject.connect("clicked") { callback(this) }
  return this
}
