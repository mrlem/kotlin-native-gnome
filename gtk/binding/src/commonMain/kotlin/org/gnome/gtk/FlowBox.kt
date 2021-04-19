// TODO - bind_model
// TODO - get_selected_children
// TODO - get_selection_mode
// TODO - selected_foreach
// TODO - set_filter_func
// TODO - set_selection_mode
// TODO - set_sort_func
//
package org.gnome.gtk

import gtk3.GtkFlowBox
import gtk3.gtk_flow_box_get_activate_on_single_click
import gtk3.gtk_flow_box_get_child_at_index
import gtk3.gtk_flow_box_get_child_at_pos
import gtk3.gtk_flow_box_get_column_spacing
import gtk3.gtk_flow_box_get_homogeneous
import gtk3.gtk_flow_box_get_max_children_per_line
import gtk3.gtk_flow_box_get_min_children_per_line
import gtk3.gtk_flow_box_get_row_spacing
import gtk3.gtk_flow_box_insert
import gtk3.gtk_flow_box_invalidate_filter
import gtk3.gtk_flow_box_invalidate_sort
import gtk3.gtk_flow_box_select_all
import gtk3.gtk_flow_box_select_child
import gtk3.gtk_flow_box_set_activate_on_single_click
import gtk3.gtk_flow_box_set_column_spacing
import gtk3.gtk_flow_box_set_hadjustment
import gtk3.gtk_flow_box_set_homogeneous
import gtk3.gtk_flow_box_set_max_children_per_line
import gtk3.gtk_flow_box_set_min_children_per_line
import gtk3.gtk_flow_box_set_row_spacing
import gtk3.gtk_flow_box_set_vadjustment
import gtk3.gtk_flow_box_unselect_all
import gtk3.gtk_flow_box_unselect_child
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias FlowBox = CPointer<GtkFlowBox>

public val FlowBox.asObject: Object
  get() = reinterpret()

public val FlowBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FlowBox.asWidget: Widget
  get() = reinterpret()

public val FlowBox.asContainer: Container
  get() = reinterpret()

public fun FlowBox.getActivateOnSingleClick(): Boolean =
    gtk_flow_box_get_activate_on_single_click(this).toBoolean

public fun FlowBox.getChildAtIndex(idx: Int): FlowBoxChild? = gtk_flow_box_get_child_at_index(this,
    idx)?.reinterpret()

public fun FlowBox.getChildAtPos(x: Int, y: Int): FlowBoxChild? =
    gtk_flow_box_get_child_at_pos(this, x, y)?.reinterpret()

public fun FlowBox.getColumnSpacing(): UInt = gtk_flow_box_get_column_spacing(this)

public fun FlowBox.getHomogeneous(): Boolean = gtk_flow_box_get_homogeneous(this).toBoolean

public fun FlowBox.getMaxChildrenPerLine(): UInt = gtk_flow_box_get_max_children_per_line(this)

public fun FlowBox.getMinChildrenPerLine(): UInt = gtk_flow_box_get_min_children_per_line(this)

public fun FlowBox.getRowSpacing(): UInt = gtk_flow_box_get_row_spacing(this)

public fun FlowBox.insert(widget: Widget, position: Int): Unit {
  gtk_flow_box_insert(this, widget.reinterpret(), position)
}

public fun FlowBox.invalidateFilter(): Unit {
  gtk_flow_box_invalidate_filter(this)
}

public fun FlowBox.invalidateSort(): Unit {
  gtk_flow_box_invalidate_sort(this)
}

public fun FlowBox.selectAll(): Unit {
  gtk_flow_box_select_all(this)
}

public fun FlowBox.selectChild(child: FlowBoxChild): Unit {
  gtk_flow_box_select_child(this, child.reinterpret())
}

public fun FlowBox.setActivateOnSingleClick(single: Boolean): Unit {
  gtk_flow_box_set_activate_on_single_click(this, single.toInt)
}

public fun FlowBox.setColumnSpacing(spacing: UInt): Unit {
  gtk_flow_box_set_column_spacing(this, spacing)
}

public fun FlowBox.setHadjustment(adjustment: Adjustment): Unit {
  gtk_flow_box_set_hadjustment(this, adjustment.reinterpret())
}

public fun FlowBox.setHomogeneous(homogeneous: Boolean): Unit {
  gtk_flow_box_set_homogeneous(this, homogeneous.toInt)
}

public fun FlowBox.setMaxChildrenPerLine(nChildren: UInt): Unit {
  gtk_flow_box_set_max_children_per_line(this, nChildren)
}

public fun FlowBox.setMinChildrenPerLine(nChildren: UInt): Unit {
  gtk_flow_box_set_min_children_per_line(this, nChildren)
}

public fun FlowBox.setRowSpacing(spacing: UInt): Unit {
  gtk_flow_box_set_row_spacing(this, spacing)
}

public fun FlowBox.setVadjustment(adjustment: Adjustment): Unit {
  gtk_flow_box_set_vadjustment(this, adjustment.reinterpret())
}

public fun FlowBox.unselectAll(): Unit {
  gtk_flow_box_unselect_all(this)
}

public fun FlowBox.unselectChild(child: FlowBoxChild): Unit {
  gtk_flow_box_unselect_child(this, child.reinterpret())
}
