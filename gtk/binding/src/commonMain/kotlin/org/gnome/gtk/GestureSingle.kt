// TODO - get_current_sequence
//
package org.gnome.gtk

import gtk3.GtkGestureSingle
import gtk3.gtk_gesture_single_get_button
import gtk3.gtk_gesture_single_get_current_button
import gtk3.gtk_gesture_single_get_exclusive
import gtk3.gtk_gesture_single_get_touch_only
import gtk3.gtk_gesture_single_set_button
import gtk3.gtk_gesture_single_set_exclusive
import gtk3.gtk_gesture_single_set_touch_only
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias GestureSingle = CPointer<GtkGestureSingle>

public val GestureSingle.asObject: Object
  get() = reinterpret()

public val GestureSingle.asEventController: EventController
  get() = reinterpret()

public val GestureSingle.asGesture: Gesture
  get() = reinterpret()

public fun GestureSingle.getButton(): UInt = gtk_gesture_single_get_button(this)

public fun GestureSingle.getCurrentButton(): UInt = gtk_gesture_single_get_current_button(this)

public fun GestureSingle.getExclusive(): Boolean = gtk_gesture_single_get_exclusive(this).toBoolean

public fun GestureSingle.getTouchOnly(): Boolean = gtk_gesture_single_get_touch_only(this).toBoolean

public fun GestureSingle.setButton(button: UInt): Unit {
  gtk_gesture_single_set_button(this, button)
}

public fun GestureSingle.setExclusive(exclusive: Boolean): Unit {
  gtk_gesture_single_set_exclusive(this, exclusive.toInt)
}

public fun GestureSingle.setTouchOnly(touchOnly: Boolean): Unit {
  gtk_gesture_single_set_touch_only(this, touchOnly.toInt)
}
