@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkGestureLongPress
import gtk3.gtk_gesture_long_press_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias GestureLongPress = CPointer<GtkGestureLongPress>

public val GestureLongPress.asObject: Object
  get() = reinterpret()

public val GestureLongPress.asEventController: EventController
  get() = reinterpret()

public val GestureLongPress.asGesture: Gesture
  get() = reinterpret()

public val GestureLongPress.asGestureSingle: GestureSingle
  get() = reinterpret()

public object GestureLongPressFactory {
  public fun new(widget: Widget?): GestureLongPress =
      gtk_gesture_long_press_new(widget?.reinterpret())!!.reinterpret()
}

public fun GestureLongPress.onCancelled(callback: (GestureLongPress) -> Unit): GestureLongPress {
  // TODO - handle callback data

  asObject.connect("cancelled") { callback(this) }
  return this
}

public fun GestureLongPress.onPressed(callback: (GestureLongPress) -> Unit): GestureLongPress {
  // TODO - handle callback data

  asObject.connect("pressed") { callback(this) }
  return this
}
