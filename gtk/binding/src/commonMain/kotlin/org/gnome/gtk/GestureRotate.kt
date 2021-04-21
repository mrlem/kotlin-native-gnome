@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkGestureRotate
import gtk3.gtk_gesture_rotate_get_angle_delta
import gtk3.gtk_gesture_rotate_new
import kotlin.Double
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias GestureRotate = CPointer<GtkGestureRotate>

public val GestureRotate.asObject: Object
  get() = reinterpret()

public val GestureRotate.asEventController: EventController
  get() = reinterpret()

public val GestureRotate.asGesture: Gesture
  get() = reinterpret()

public object GestureRotateFactory {
  public fun new(widget: Widget?): GestureRotate =
      gtk_gesture_rotate_new(widget?.reinterpret())!!.reinterpret()
}

public val GestureRotate.angleDelta: Double
  get() = gtk_gesture_rotate_get_angle_delta(this)

public fun GestureRotate.onAngleChanged(callback: (GestureRotate) -> Unit): GestureRotate {
  // TODO - handle callback data

  asObject.connect("angle-changed") { callback(this) }
  return this
}
