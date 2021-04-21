// TODO - method: get_bounding_box
// TODO - method: get_bounding_box_center
// TODO - method: get_device
// TODO - method: get_group
// TODO - method: get_last_event
// TODO - method: get_last_updated_sequence
// TODO - method: get_point
// TODO - method: get_sequence_state
// TODO - method: get_sequences
// TODO - method: get_window
// TODO - method: handles_sequence
// TODO - method: set_sequence_state
// TODO - method: set_window
// TODO - signal: begin
// TODO - signal: cancel
// TODO - signal: end
// TODO - signal: sequence-state-changed
// TODO - signal: update
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGesture
import gtk3.gtk_gesture_group
import gtk3.gtk_gesture_is_active
import gtk3.gtk_gesture_is_grouped_with
import gtk3.gtk_gesture_is_recognized
import gtk3.gtk_gesture_set_state
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

public fun Gesture.group(gesture: Gesture?): Unit {
  gtk_gesture_group(this, gesture?.reinterpret())
}

public fun Gesture.isActive(): Boolean = gtk_gesture_is_active(this).toBoolean

public fun Gesture.isGroupedWith(other: Gesture?): Boolean = gtk_gesture_is_grouped_with(this,
    other?.reinterpret()).toBoolean

public fun Gesture.isRecognized(): Boolean = gtk_gesture_is_recognized(this).toBoolean

public fun Gesture.setState(state: EventSequenceState): Boolean = gtk_gesture_set_state(this,
    state).toBoolean

public fun Gesture.ungroup(): Unit {
  gtk_gesture_ungroup(this)
}
