// TODO - method: get_actions (return type)
// TODO - method: get_dest_window (return type)
// TODO - method: get_device (return type)
// TODO - method: get_drag_window (return type)
// TODO - method: get_protocol (return type)
// TODO - method: get_selected_action (return type)
// TODO - method: get_source_window (return type)
// TODO - method: get_suggested_action (return type)
// TODO - method: list_targets (return type)
// TODO - method: manage_dnd (param type)
// TODO - method: set_device (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDragContext
import interop.gdk_drag_context_set_hotspot
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DragContext = CPointer<GdkDragContext>

public val DragContext.asObject: Object
  get() = reinterpret()

public fun DragContext.setHotspot(hotX: Int, hotY: Int): Unit {
  gdk_drag_context_set_hotspot(this@setHotspot, hotX, hotY)
}

public fun DragContext.onActionChanged(callback: (DragContext) -> Unit): DragContext {
  // TODO - handle callback data

  asObject.connect("action-changed") { callback(this) }
  return this
}

public fun DragContext.onCancel(callback: (DragContext) -> Unit): DragContext {
  // TODO - handle callback data

  asObject.connect("cancel") { callback(this) }
  return this
}

public fun DragContext.onDndFinished(callback: (DragContext) -> Unit): DragContext {
  // TODO - handle callback data

  asObject.connect("dnd-finished") { callback(this) }
  return this
}

public fun DragContext.onDropPerformed(callback: (DragContext) -> Unit): DragContext {
  // TODO - handle callback data

  asObject.connect("drop-performed") { callback(this) }
  return this
}
