package org.gnome.gtk

import gtk3.GtkGestureSingle
import gtk3.gtk_gesture_single_get_button
import gtk3.gtk_gesture_single_get_current_button
import gtk3.gtk_gesture_single_get_current_sequence
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
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias GestureSingle = CPointer<GtkGestureSingle>

public val GestureSingle.asObject: Object
  get() = reinterpret()

public val GestureSingle.asEventController: EventController
  get() = reinterpret()

public val GestureSingle.asGesture: Gesture
  get() = reinterpret()

public fun GestureSingle.getCurrentSequence(): Unit {
  gtk_gesture_single_get_current_sequence(this)
}

public var GestureSingle.button: UInt
  get() = gtk_gesture_single_get_button(this)
  set(`value`) {
    gtk_gesture_single_set_button(this, value)
  }

public var GestureSingle.exclusive: Boolean
  get() = gtk_gesture_single_get_exclusive(this).toBoolean
  set(`value`) {
    gtk_gesture_single_set_exclusive(this, value.toInt)
  }

public var GestureSingle.touchOnly: Boolean
  get() = gtk_gesture_single_get_touch_only(this).toBoolean
  set(`value`) {
    gtk_gesture_single_set_touch_only(this, value.toInt)
  }

public val GestureSingle.currentButton: UInt
  get() = gtk_gesture_single_get_current_button(this)
