// TODO - method: get_offset (param type)
// TODO - method: get_start_point (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGestureDrag
import interop.gtk_gesture_drag_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias GestureDrag = CPointer<GtkGestureDrag>

public val GestureDrag.asObject: Object
  get() = reinterpret()

public val GestureDrag.asEventController: EventController
  get() = reinterpret()

public val GestureDrag.asGesture: Gesture
  get() = reinterpret()

public val GestureDrag.asGestureSingle: GestureSingle
  get() = reinterpret()

public object GestureDragFactory {
  public fun new(widget: Widget?): GestureDrag =
      gtk_gesture_drag_new(widget?.reinterpret())!!.reinterpret()
}

public fun GestureDrag.onDragBegin(callback: (GestureDrag) -> Unit): GestureDrag {
  // TODO - handle callback data

  asObject.connect("drag-begin") { callback(this) }
  return this
}

public fun GestureDrag.onDragEnd(callback: (GestureDrag) -> Unit): GestureDrag {
  // TODO - handle callback data

  asObject.connect("drag-end") { callback(this) }
  return this
}

public fun GestureDrag.onDragUpdate(callback: (GestureDrag) -> Unit): GestureDrag {
  // TODO - handle callback data

  asObject.connect("drag-update") { callback(this) }
  return this
}
