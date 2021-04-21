// TODO - method: bind_model
// TODO - method: get_selected_children
// TODO - method: selected_foreach
// TODO - method: set_filter_func
// TODO - method: set_sort_func
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

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
import gtk3.gtk_flow_box_get_selection_mode
import gtk3.gtk_flow_box_insert
import gtk3.gtk_flow_box_invalidate_filter
import gtk3.gtk_flow_box_invalidate_sort
import gtk3.gtk_flow_box_new
import gtk3.gtk_flow_box_select_all
import gtk3.gtk_flow_box_select_child
import gtk3.gtk_flow_box_set_activate_on_single_click
import gtk3.gtk_flow_box_set_column_spacing
import gtk3.gtk_flow_box_set_hadjustment
import gtk3.gtk_flow_box_set_homogeneous
import gtk3.gtk_flow_box_set_max_children_per_line
import gtk3.gtk_flow_box_set_min_children_per_line
import gtk3.gtk_flow_box_set_row_spacing
import gtk3.gtk_flow_box_set_selection_mode
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
import org.gnome.gobject.connect
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

public object FlowBoxFactory {
  public fun new(): FlowBox = gtk_flow_box_new()!!.reinterpret()
}

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

public var FlowBox.selectionMode: SelectionMode
  get() = gtk_flow_box_get_selection_mode(this)
  set(`value`) {
    gtk_flow_box_set_selection_mode(this, value)
  }

public fun FlowBox.getChildAtIndex(idx: Int): FlowBoxChild? = gtk_flow_box_get_child_at_index(this,
    idx)?.reinterpret()

public fun FlowBox.getChildAtPos(x: Int, y: Int): FlowBoxChild? =
    gtk_flow_box_get_child_at_pos(this, x, y)?.reinterpret()

public fun FlowBox.insert(widget: Widget?, position: Int): Unit {
  gtk_flow_box_insert(this, widget?.reinterpret(), position)
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

public fun FlowBox.selectChild(child: FlowBoxChild?): Unit {
  gtk_flow_box_select_child(this, child?.reinterpret())
}

public fun FlowBox.setHadjustment(adjustment: Adjustment?): Unit {
  gtk_flow_box_set_hadjustment(this, adjustment?.reinterpret())
}

public fun FlowBox.setVadjustment(adjustment: Adjustment?): Unit {
  gtk_flow_box_set_vadjustment(this, adjustment?.reinterpret())
}

public fun FlowBox.unselectAll(): Unit {
  gtk_flow_box_unselect_all(this)
}

public fun FlowBox.unselectChild(child: FlowBoxChild?): Unit {
  gtk_flow_box_unselect_child(this, child?.reinterpret())
}

public fun FlowBox.onActivateCursorChild(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("activate-cursor-child") { callback(this) }
  return this
}

public fun FlowBox.onChildActivated(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("child-activated") { callback(this) }
  return this
}

public fun FlowBox.onMoveCursor(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun FlowBox.onSelectAll(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("select-all") { callback(this) }
  return this
}

public fun FlowBox.onSelectedChildrenChanged(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("selected-children-changed") { callback(this) }
  return this
}

public fun FlowBox.onToggleCursorChild(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("toggle-cursor-child") { callback(this) }
  return this
}

public fun FlowBox.onUnselectAll(callback: (FlowBox) -> Unit): FlowBox {
  // TODO - handle callback data

  asObject.connect("unselect-all") { callback(this) }
  return this
}
