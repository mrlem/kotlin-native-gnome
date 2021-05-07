@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GList
import interop.GdkDragContext
import interop.gdk_drag_context_get_actions
import interop.gdk_drag_context_get_dest_window
import interop.gdk_drag_context_get_device
import interop.gdk_drag_context_get_drag_window
import interop.gdk_drag_context_get_protocol
import interop.gdk_drag_context_get_selected_action
import interop.gdk_drag_context_get_source_window
import interop.gdk_drag_context_get_suggested_action
import interop.gdk_drag_context_list_targets
import interop.gdk_drag_context_manage_dnd
import interop.gdk_drag_context_set_device
import interop.gdk_drag_context_set_hotspot
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toKList

public typealias DragContext = CPointer<GdkDragContext>

public val DragContext.asObject: Object
  get() = reinterpret()

public val DragContext.actions: DragAction
  get() = gdk_drag_context_get_actions(this)

public val DragContext.destWindow: Window?
  get() = gdk_drag_context_get_dest_window(this)?.reinterpret()

public var DragContext.device: Device?
  get() = gdk_drag_context_get_device(this)?.reinterpret()
  set(`value`) {
    gdk_drag_context_set_device(this@device, `value`)
  }

public val DragContext.dragWindow: Window?
  get() = gdk_drag_context_get_drag_window(this)?.reinterpret()

public val DragContext.protocol: DragProtocol
  get() = gdk_drag_context_get_protocol(this)

public val DragContext.selectedAction: DragAction
  get() = gdk_drag_context_get_selected_action(this)

public val DragContext.sourceWindow: Window?
  get() = gdk_drag_context_get_source_window(this)?.reinterpret()

public val DragContext.suggestedAction: DragAction
  get() = gdk_drag_context_get_suggested_action(this)

public fun DragContext.listTargets(): List<Atom>? =
    gdk_drag_context_list_targets(this@listTargets)?.reinterpret<GList>()?.toKList()

public fun DragContext.manageDnd(ipcWindow: Window?, actions: DragAction): Boolean =
    gdk_drag_context_manage_dnd(this@manageDnd, ipcWindow?.reinterpret(), actions).toBoolean()

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
