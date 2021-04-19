// TODO - get_device
// TODO - get_group
// TODO - get_last_updated_sequence
// TODO - get_sequences
// TODO - get_window
// TODO - get_bounding_box
// TODO - get_bounding_box_center
// TODO - get_device
// TODO - get_group
// TODO - get_last_event
// TODO - get_last_updated_sequence
// TODO - get_point
// TODO - get_sequence_state
// TODO - get_sequences
// TODO - get_window
// TODO - handles_sequence
// TODO - set_sequence_state
// TODO - set_state
// TODO - set_window
//
package org.gnome.gtk

import gtk3.GtkGesture
import gtk3.gtk_gesture_group
import gtk3.gtk_gesture_is_active
import gtk3.gtk_gesture_is_grouped_with
import gtk3.gtk_gesture_is_recognized
import gtk3.gtk_gesture_ungroup
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias Gesture = CPointer<GtkGesture>

public val Gesture.asObject: Object
  get() = reinterpret()

public val Gesture.asEventController: EventController
  get() = reinterpret()

public fun Gesture.group(gesture: Gesture): Unit {
  gtk_gesture_group(this, gesture.reinterpret())
}

public fun Gesture.isActive(): Boolean = gtk_gesture_is_active(this).toBoolean

public fun Gesture.isGroupedWith(other: Gesture): Boolean = gtk_gesture_is_grouped_with(this,
    other.reinterpret()).toBoolean

public fun Gesture.isRecognized(): Boolean = gtk_gesture_is_recognized(this).toBoolean

public fun Gesture.ungroup(): Unit {
  gtk_gesture_ungroup(this)
}
