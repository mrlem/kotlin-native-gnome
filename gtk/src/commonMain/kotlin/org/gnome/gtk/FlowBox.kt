// TODO - implement:
//   bind_model
//   get_activate_on_single_click
//   get_child_at_index
//   get_child_at_pos
//   get_column_spacing
//   get_homogeneous
//   get_max_children_per_line
//   get_min_children_per_line
//   get_row_spacing
//   get_selected_children
//   get_selection_mode
//   insert
//   invalidate_filter
//   invalidate_sort
//   select_all
//   select_child
//   selected_foreach
//   set_activate_on_single_click
//   set_column_spacing
//   set_filter_func
//   set_hadjustment
//   set_homogeneous
//   set_max_children_per_line
//   set_min_children_per_line
//   set_row_spacing
//   set_selection_mode
//   set_sort_func
//   set_vadjustment
//   unselect_all
//   unselect_child
package org.gnome.gtk

import gtk3.GtkFlowBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FlowBox = CPointer<GtkFlowBox>

public val FlowBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FlowBox.asWidget: Widget
  get() = reinterpret()

public val FlowBox.asContainer: Container
  get() = reinterpret()
