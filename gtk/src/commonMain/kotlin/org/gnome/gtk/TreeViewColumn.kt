// TODO - implement:
//   add_attribute
//   cell_get_position
//   cell_get_size
//   cell_set_cell_data
//   clear_attributes
//   focus_cell
//   pack_end
//   pack_start
//   set_attributes
//   set_cell_data_func
//   set_sizing
//   set_sort_order
//   set_widget
package org.gnome.gtk

import gtk3.GtkTreeViewColumn
import gtk3.gtk_tree_view_column_cell_is_visible
import gtk3.gtk_tree_view_column_clear
import gtk3.gtk_tree_view_column_clicked
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
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias TreeViewColumn = CPointer<GtkTreeViewColumn>

public val TreeViewColumn.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun TreeViewColumn.cellIsVisible(): Boolean =
    gtk_tree_view_column_cell_is_visible(this).toBoolean

public fun TreeViewColumn.clear(): Unit {
  gtk_tree_view_column_clear(this)
}

public fun TreeViewColumn.clicked(): Unit {
  gtk_tree_view_column_clicked(this)
}

public fun TreeViewColumn.getButton(): Unit {
  gtk_tree_view_column_get_button(this)
}

public fun TreeViewColumn.getSizing(): Unit {
  gtk_tree_view_column_get_sizing(this)
}

public fun TreeViewColumn.getSortOrder(): Unit {
  gtk_tree_view_column_get_sort_order(this)
}

public fun TreeViewColumn.getTreeView(): Unit {
  gtk_tree_view_column_get_tree_view(this)
}

public fun TreeViewColumn.getWidget(): Unit {
  gtk_tree_view_column_get_widget(this)
}

public fun TreeViewColumn.queueResize(): Unit {
  gtk_tree_view_column_queue_resize(this)
}

public var TreeViewColumn.alignment: Float
  get() = gtk_tree_view_column_get_alignment(this)
  set(`value`) {
    gtk_tree_view_column_set_alignment(this, value)
  }

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

public var TreeViewColumn.spacing: Int
  get() = gtk_tree_view_column_get_spacing(this)
  set(`value`) {
    gtk_tree_view_column_set_spacing(this, value)
  }

public var TreeViewColumn.title: String?
  get() = gtk_tree_view_column_get_title(this).toKString
  set(`value`) {
    gtk_tree_view_column_set_title(this, value)
  }

public var TreeViewColumn.visible: Boolean
  get() = gtk_tree_view_column_get_visible(this).toBoolean
  set(`value`) {
    gtk_tree_view_column_set_visible(this, value.toInt)
  }

public val TreeViewColumn.width: Int
  get() = gtk_tree_view_column_get_width(this)

public val TreeViewColumn.xOffset: Int
  get() = gtk_tree_view_column_get_x_offset(this)
