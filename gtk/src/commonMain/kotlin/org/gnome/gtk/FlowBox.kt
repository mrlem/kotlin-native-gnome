// TODO - implement:
//   bind_model
//   get_child_at_index
//   get_child_at_pos
//   get_selected_children
//   get_selection_mode
//   insert
//   invalidate_filter
//   invalidate_sort
//   select_all
//   select_child
//   selected_foreach
//   set_filter_func
//   set_hadjustment
//   set_selection_mode
//   set_sort_func
//   set_vadjustment
//   unselect_all
//   unselect_child
package org.gnome.gtk

import gtk3.GtkFlowBox
import gtk3.gtk_flow_box_get_activate_on_single_click
import gtk3.gtk_flow_box_get_column_spacing
import gtk3.gtk_flow_box_get_homogeneous
import gtk3.gtk_flow_box_get_max_children_per_line
import gtk3.gtk_flow_box_get_min_children_per_line
import gtk3.gtk_flow_box_get_row_spacing
import gtk3.gtk_flow_box_set_activate_on_single_click
import gtk3.gtk_flow_box_set_column_spacing
import gtk3.gtk_flow_box_set_homogeneous
import gtk3.gtk_flow_box_set_max_children_per_line
import gtk3.gtk_flow_box_set_min_children_per_line
import gtk3.gtk_flow_box_set_row_spacing
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias FlowBox = CPointer<GtkFlowBox>

public val FlowBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FlowBox.asWidget: Widget
  get() = reinterpret()

public val FlowBox.asContainer: Container
  get() = reinterpret()

public var FlowBox.activateOnSingleClick: Boolean
  get() = gtk_flow_box_get_activate_on_single_click(this).toBoolean
  set(`value`) {
    gtk_flow_box_set_activate_on_single_click(this, value.toInt)
  }

public var FlowBox.columnSpacing: UInt
  get() = gtk_flow_box_get_column_spacing(this)
  set(`value`) {
    gtk_flow_box_set_column_spacing(this, value)
  }

public var FlowBox.homogeneous: Boolean
  get() = gtk_flow_box_get_homogeneous(this).toBoolean
  set(`value`) {
    gtk_flow_box_set_homogeneous(this, value.toInt)
  }

public var FlowBox.maxChildrenPerLine: UInt
  get() = gtk_flow_box_get_max_children_per_line(this)
  set(`value`) {
    gtk_flow_box_set_max_children_per_line(this, value)
  }

public var FlowBox.minChildrenPerLine: UInt
  get() = gtk_flow_box_get_min_children_per_line(this)
  set(`value`) {
    gtk_flow_box_set_min_children_per_line(this, value)
  }

public var FlowBox.rowSpacing: UInt
  get() = gtk_flow_box_get_row_spacing(this)
  set(`value`) {
    gtk_flow_box_set_row_spacing(this, value)
  }
