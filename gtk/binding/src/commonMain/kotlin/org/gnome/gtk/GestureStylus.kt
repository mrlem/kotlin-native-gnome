// TODO - implement:
//   get_axes
//   get_axis
package org.gnome.gtk

import gtk3.GtkGestureStylus
import gtk3.gtk_gesture_stylus_get_device_tool
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias GestureStylus = CPointer<GtkGestureStylus>

public val GestureStylus.asObject: Object
  get() = reinterpret()

public val GestureStylus.asEventController: EventController
  get() = reinterpret()

public val GestureStylus.asGesture: Gesture
  get() = reinterpret()

public val GestureStylus.asGestureSingle: GestureSingle
  get() = reinterpret()

public fun GestureStylus.getDeviceTool(): Unit {
  gtk_gesture_stylus_get_device_tool(this)
}