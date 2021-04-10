// TODO - implement:
//   get_bounding_box
//   get_bounding_box_center
//   get_last_event
//   get_point
//   get_sequence_state
//   group
//   handles_sequence
//   is_grouped_with
//   set_sequence_state
//   set_state
//   set_window
package org.gnome.gtk

import gtk3.GtkGesture
import gtk3.gtk_gesture_get_device
import gtk3.gtk_gesture_get_group
import gtk3.gtk_gesture_get_last_updated_sequence
import gtk3.gtk_gesture_get_sequences
import gtk3.gtk_gesture_get_window
import gtk3.gtk_gesture_is_active
import gtk3.gtk_gesture_is_recognized
import gtk3.gtk_gesture_ungroup
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean

public typealias Gesture = CPointer<GtkGesture>

public val Gesture.asObject: Object
  get() = reinterpret()

public val Gesture.asEventController: EventController
  get() = reinterpret()

public fun Gesture.getDevice(): Unit {
  gtk_gesture_get_device(this)
}

public fun Gesture.getGroup(): Unit {
  gtk_gesture_get_group(this)
}

public fun Gesture.getLastUpdatedSequence(): Unit {
  gtk_gesture_get_last_updated_sequence(this)
}

public fun Gesture.getSequences(): Unit {
  gtk_gesture_get_sequences(this)
}

public fun Gesture.getWindow(): Unit {
  gtk_gesture_get_window(this)
}

public fun Gesture.isActive(): Boolean = gtk_gesture_is_active(this).toBoolean

public fun Gesture.isRecognized(): Boolean = gtk_gesture_is_recognized(this).toBoolean

public fun Gesture.ungroup(): Unit {
  gtk_gesture_ungroup(this)
}
