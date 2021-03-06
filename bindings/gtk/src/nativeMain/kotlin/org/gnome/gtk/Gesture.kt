// TODO - method: get_bounding_box (param type)
// TODO - method: get_bounding_box_center (param type)
// TODO - method: get_point (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkGesture
import interop.gtk_gesture_get_device
import interop.gtk_gesture_get_group
import interop.gtk_gesture_get_last_event
import interop.gtk_gesture_get_last_updated_sequence
import interop.gtk_gesture_get_sequence_state
import interop.gtk_gesture_get_sequences
import interop.gtk_gesture_get_window
import interop.gtk_gesture_group
import interop.gtk_gesture_handles_sequence
import interop.gtk_gesture_is_active
import interop.gtk_gesture_is_grouped_with
import interop.gtk_gesture_is_recognized
import interop.gtk_gesture_set_sequence_state
import interop.gtk_gesture_set_state
import interop.gtk_gesture_set_window
import interop.gtk_gesture_ungroup
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Device
import org.gnome.gdk.Event
import org.gnome.gdk.EventSequence
import org.gnome.gdk.Window
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toKList

public typealias Gesture = CPointer<GtkGesture>

public val Gesture.asObject: Object
  get() = reinterpret()

public val Gesture.asEventController: EventController
  get() = reinterpret()

public val Gesture.device: Device?
  get() = gtk_gesture_get_device(this)?.reinterpret()

public val Gesture.group: List<Gesture>?
  get() = gtk_gesture_get_group(this)?.reinterpret<GList>()?.toKList()

public val Gesture.lastUpdatedSequence: EventSequence?
  get() = gtk_gesture_get_last_updated_sequence(this)?.reinterpret()

public val Gesture.sequences: List<EventSequence>?
  get() = gtk_gesture_get_sequences(this)?.reinterpret<GList>()?.toKList()

public var Gesture.window: Window?
  get() = gtk_gesture_get_window(this)?.reinterpret()
  set(`value`) {
    gtk_gesture_set_window(this@window, `value`)
  }

public fun Gesture.getLastEvent(sequence: EventSequence?): Event? =
    gtk_gesture_get_last_event(this@getLastEvent, sequence?.reinterpret())?.reinterpret()

public fun Gesture.getSequenceState(sequence: EventSequence?): EventSequenceState =
    gtk_gesture_get_sequence_state(this@getSequenceState, sequence?.reinterpret())

public fun Gesture.group(gesture: Gesture?): Unit {
  gtk_gesture_group(this@group, gesture?.reinterpret())
}

public fun Gesture.handlesSequence(sequence: EventSequence?): Boolean =
    gtk_gesture_handles_sequence(this@handlesSequence, sequence?.reinterpret()).toBoolean()

public fun Gesture.isActive(): Boolean = gtk_gesture_is_active(this@isActive).toBoolean()

public fun Gesture.isGroupedWith(other: Gesture?): Boolean =
    gtk_gesture_is_grouped_with(this@isGroupedWith, other?.reinterpret()).toBoolean()

public fun Gesture.isRecognized(): Boolean =
    gtk_gesture_is_recognized(this@isRecognized).toBoolean()

public fun Gesture.setSequenceState(sequence: EventSequence?, state: EventSequenceState): Boolean =
    gtk_gesture_set_sequence_state(this@setSequenceState, sequence?.reinterpret(),
    state).toBoolean()

public fun Gesture.setState(state: EventSequenceState): Boolean =
    gtk_gesture_set_state(this@setState, state).toBoolean()

public fun Gesture.ungroup(): Unit {
  gtk_gesture_ungroup(this@ungroup)
}

public fun Gesture.onBegin(callback: (Gesture) -> Unit): Gesture {
  // TODO - handle callback data

  asObject.connect("begin") { callback(this) }
  return this
}

public fun Gesture.onCancel(callback: (Gesture) -> Unit): Gesture {
  // TODO - handle callback data

  asObject.connect("cancel") { callback(this) }
  return this
}

public fun Gesture.onEnd(callback: (Gesture) -> Unit): Gesture {
  // TODO - handle callback data

  asObject.connect("end") { callback(this) }
  return this
}

public fun Gesture.onSequenceStateChanged(callback: (Gesture) -> Unit): Gesture {
  // TODO - handle callback data

  asObject.connect("sequence-state-changed") { callback(this) }
  return this
}

public fun Gesture.onUpdate(callback: (Gesture) -> Unit): Gesture {
  // TODO - handle callback data

  asObject.connect("update") { callback(this) }
  return this
}
