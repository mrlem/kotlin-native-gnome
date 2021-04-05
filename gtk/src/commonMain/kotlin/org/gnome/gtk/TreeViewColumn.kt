// TODO - implement:
//   add_attribute
//   cell_get_position
//   cell_get_size
//   cell_is_visible
//   cell_set_cell_data
//   clear
//   clear_attributes
//   clicked
//   focus_cell
//   get_alignment
//   get_button
//   get_clickable
//   get_expand
//   get_fixed_width
//   get_max_width
//   get_min_width
//   get_reorderable
//   get_resizable
//   get_sizing
//   get_sort_column_id
//   get_sort_indicator
//   get_sort_order
//   get_spacing
//   get_title
//   get_tree_view
//   get_visible
//   get_widget
//   get_width
//   get_x_offset
//   pack_end
//   pack_start
//   queue_resize
//   set_alignment
//   set_attributes
//   set_cell_data_func
//   set_clickable
//   set_expand
//   set_fixed_width
//   set_max_width
//   set_min_width
//   set_reorderable
//   set_resizable
//   set_sizing
//   set_sort_column_id
//   set_sort_indicator
//   set_sort_order
//   set_spacing
//   set_title
//   set_visible
//   set_widget
package org.gnome.gtk

import gtk3.GtkTreeViewColumn
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias TreeViewColumn = CPointer<GtkTreeViewColumn>

public val TreeViewColumn.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
