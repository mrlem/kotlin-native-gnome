@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGestureSingle
import interop.gtk_gesture_single_get_button
import interop.gtk_gesture_single_get_current_button
import interop.gtk_gesture_single_get_current_sequence
import interop.gtk_gesture_single_get_exclusive
import interop.gtk_gesture_single_get_touch_only
import interop.gtk_gesture_single_set_button
import interop.gtk_gesture_single_set_exclusive
import interop.gtk_gesture_single_set_touch_only
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.EventSequence
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias GestureSingle = CPointer<GtkGestureSingle>

public val GestureSingle.asObject: Object
  get() = reinterpret()

public val GestureSingle.asEventController: EventController
  get() = reinterpret()

public val GestureSingle.asGesture: Gesture
  get() = reinterpret()

public var GestureSingle.button: UInt
  get() = gtk_gesture_single_get_button(this)
  set(`value`) {
    gtk_gesture_single_set_button(this@button, `value`)
  }

public val GestureSingle.currentButton: UInt
  get() = gtk_gesture_single_get_current_button(this)

public val GestureSingle.currentSequence: EventSequence?
  get() = gtk_gesture_single_get_current_sequence(this)?.reinterpret()

public var GestureSingle.exclusive: Boolean
  get() = gtk_gesture_single_get_exclusive(this).toBoolean()
  set(`value`) {
    gtk_gesture_single_set_exclusive(this@exclusive, `value`.toInt())
  }

public var GestureSingle.touchOnly: Boolean
  get() = gtk_gesture_single_get_touch_only(this).toBoolean()
  set(`value`) {
    gtk_gesture_single_set_touch_only(this@touchOnly, `value`.toInt())
  }
