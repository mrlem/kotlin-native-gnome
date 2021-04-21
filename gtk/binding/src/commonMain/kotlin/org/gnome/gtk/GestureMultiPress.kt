// TODO - method: get_area
// TODO - method: set_area
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkGestureMultiPress
import gtk3.gtk_gesture_multi_press_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias GestureMultiPress = CPointer<GtkGestureMultiPress>

public val GestureMultiPress.asObject: Object
  get() = reinterpret()

public val GestureMultiPress.asEventController: EventController
  get() = reinterpret()

public val GestureMultiPress.asGesture: Gesture
  get() = reinterpret()

public val GestureMultiPress.asGestureSingle: GestureSingle
  get() = reinterpret()

public object GestureMultiPressFactory {
  public fun new(widget: Widget?): GestureMultiPress =
      gtk_gesture_multi_press_new(widget?.reinterpret())!!.reinterpret()
}

public fun GestureMultiPress.onPressed(callback: (GestureMultiPress) -> Unit): GestureMultiPress {
  // TODO - handle callback data

  asObject.connect("pressed") { callback(this) }
  return this
}

public fun GestureMultiPress.onReleased(callback: (GestureMultiPress) -> Unit): GestureMultiPress {
  // TODO - handle callback data

  asObject.connect("released") { callback(this) }
  return this
}

public fun GestureMultiPress.onStopped(callback: (GestureMultiPress) -> Unit): GestureMultiPress {
  // TODO - handle callback data

  asObject.connect("stopped") { callback(this) }
  return this
}
