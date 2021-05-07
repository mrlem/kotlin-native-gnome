// TODO - method: bind_model (param type)
// TODO - method: selected_foreach (param type)
// TODO - method: set_filter_func (param type)
// TODO - method: set_sort_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkFlowBox
import interop.gtk_flow_box_get_activate_on_single_click
import interop.gtk_flow_box_get_child_at_index
import interop.gtk_flow_box_get_child_at_pos
import interop.gtk_flow_box_get_column_spacing
import interop.gtk_flow_box_get_homogeneous
import interop.gtk_flow_box_get_max_children_per_line
import interop.gtk_flow_box_get_min_children_per_line
import interop.gtk_flow_box_get_row_spacing
import interop.gtk_flow_box_get_selected_children
import interop.gtk_flow_box_get_selection_mode
import interop.gtk_flow_box_insert
import interop.gtk_flow_box_invalidate_filter
import interop.gtk_flow_box_invalidate_sort
import interop.gtk_flow_box_new
import interop.gtk_flow_box_select_all
import interop.gtk_flow_box_select_child
import interop.gtk_flow_box_set_activate_on_single_click
import interop.gtk_flow_box_set_column_spacing
import interop.gtk_flow_box_set_hadjustment
import interop.gtk_flow_box_set_homogeneous
import interop.gtk_flow_box_set_max_children_per_line
import interop.gtk_flow_box_set_min_children_per_line
import interop.gtk_flow_box_set_row_spacing
import interop.gtk_flow_box_set_selection_mode
import interop.gtk_flow_box_set_vadjustment
import interop.gtk_flow_box_unselect_all
import interop.gtk_flow_box_unselect_child
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKList

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

public val FlowBox.container: Container
  get() = pointed.container.ptr

public var FlowBox.activateOnSingleClick: Boolean
  get() = gtk_flow_box_get_activate_on_single_click(this).toBoolean()
  set(`value`) {
    gtk_flow_box_set_activate_on_single_click(this@activateOnSingleClick, `value`.toInt())
  }

public var FlowBox.columnSpacing: UInt
  get() = gtk_flow_box_get_column_spacing(this)
  set(`value`) {
    gtk_flow_box_set_column_spacing(this@columnSpacing, `value`)
  }

public var FlowBox.homogeneous: Boolean
  get() = gtk_flow_box_get_homogeneous(this).toBoolean()
  set(`value`) {
    gtk_flow_box_set_homogeneous(this@homogeneous, `value`.toInt())
  }

public var FlowBox.maxChildrenPerLine: UInt
  get() = gtk_flow_box_get_max_children_per_line(this)
  set(`value`) {
    gtk_flow_box_set_max_children_per_line(this@maxChildrenPerLine, `value`)
  }

public var FlowBox.minChildrenPerLine: UInt
  get() = gtk_flow_box_get_min_children_per_line(this)
  set(`value`) {
    gtk_flow_box_set_min_children_per_line(this@minChildrenPerLine, `value`)
  }

public var FlowBox.rowSpacing: UInt
  get() = gtk_flow_box_get_row_spacing(this)
  set(`value`) {
    gtk_flow_box_set_row_spacing(this@rowSpacing, `value`)
  }

public val FlowBox.selectedChildren: List<FlowBoxChild>?
  get() = gtk_flow_box_get_selected_children(this)?.reinterpret<GList>()?.toKList()

public var FlowBox.selectionMode: SelectionMode
  get() = gtk_flow_box_get_selection_mode(this)
  set(`value`) {
    gtk_flow_box_set_selection_mode(this@selectionMode, `value`)
  }

public fun FlowBox.getChildAtIndex(idx: Int): FlowBoxChild? =
    gtk_flow_box_get_child_at_index(this@getChildAtIndex, idx)?.reinterpret()

public fun FlowBox.getChildAtPos(x: Int, y: Int): FlowBoxChild? =
    gtk_flow_box_get_child_at_pos(this@getChildAtPos, x, y)?.reinterpret()

public fun FlowBox.insert(widget: Widget?, position: Int): Unit {
  gtk_flow_box_insert(this@insert, widget?.reinterpret(), position)
}

public fun FlowBox.invalidateFilter(): Unit {
  gtk_flow_box_invalidate_filter(this@invalidateFilter)
}

public fun FlowBox.invalidateSort(): Unit {
  gtk_flow_box_invalidate_sort(this@invalidateSort)
}

public fun FlowBox.selectAll(): Unit {
  gtk_flow_box_select_all(this@selectAll)
}

public fun FlowBox.selectChild(child: FlowBoxChild?): Unit {
  gtk_flow_box_select_child(this@selectChild, child?.reinterpret())
}

public fun FlowBox.setHadjustment(adjustment: Adjustment?): Unit {
  gtk_flow_box_set_hadjustment(this@setHadjustment, adjustment?.reinterpret())
}

public fun FlowBox.setVadjustment(adjustment: Adjustment?): Unit {
  gtk_flow_box_set_vadjustment(this@setVadjustment, adjustment?.reinterpret())
}

public fun FlowBox.unselectAll(): Unit {
  gtk_flow_box_unselect_all(this@unselectAll)
}

public fun FlowBox.unselectChild(child: FlowBoxChild?): Unit {
  gtk_flow_box_unselect_child(this@unselectChild, child?.reinterpret())
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
