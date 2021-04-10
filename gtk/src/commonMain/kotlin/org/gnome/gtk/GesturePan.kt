// TODO - implement:
//   set_orientation
package org.gnome.gtk

import gtk3.GtkGesturePan
import gtk3.gtk_gesture_pan_get_orientation
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias GesturePan = CPointer<GtkGesturePan>

public val GesturePan.asObject: Object
  get() = reinterpret()

public val GesturePan.asEventController: EventController
  get() = reinterpret()

public val GesturePan.asGesture: Gesture
  get() = reinterpret()

public val GesturePan.asGestureSingle: GestureSingle
  get() = reinterpret()

public val GesturePan.asGestureDrag: GestureDrag
  get() = reinterpret()

public fun GesturePan.getOrientation(): Unit {
  gtk_gesture_pan_get_orientation(this)
}
