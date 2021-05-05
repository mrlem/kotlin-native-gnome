// TODO - method: get_axes (param type)
// TODO - method: get_axis (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGestureStylus
import interop.gtk_gesture_stylus_get_device_tool
import interop.gtk_gesture_stylus_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.DeviceTool
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias GestureStylus = CPointer<GtkGestureStylus>

public val GestureStylus.asObject: Object
  get() = reinterpret()

public val GestureStylus.asEventController: EventController
  get() = reinterpret()

public val GestureStylus.asGesture: Gesture
  get() = reinterpret()

public val GestureStylus.asGestureSingle: GestureSingle
  get() = reinterpret()

public object GestureStylusFactory {
  public fun new(widget: Widget?): GestureStylus =
      gtk_gesture_stylus_new(widget?.reinterpret())!!.reinterpret()
}

public val GestureStylus.deviceTool: DeviceTool?
  get() = gtk_gesture_stylus_get_device_tool(this)?.reinterpret()

public fun GestureStylus.onDown(callback: (GestureStylus) -> Unit): GestureStylus {
  // TODO - handle callback data

  asObject.connect("down") { callback(this) }
  return this
}

public fun GestureStylus.onMotion(callback: (GestureStylus) -> Unit): GestureStylus {
  // TODO - handle callback data

  asObject.connect("motion") { callback(this) }
  return this
}

public fun GestureStylus.onProximity(callback: (GestureStylus) -> Unit): GestureStylus {
  // TODO - handle callback data

  asObject.connect("proximity") { callback(this) }
  return this
}

public fun GestureStylus.onUp(callback: (GestureStylus) -> Unit): GestureStylus {
  // TODO - handle callback data

  asObject.connect("up") { callback(this) }
  return this
}
