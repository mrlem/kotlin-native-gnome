@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGesturePan
import interop.gtk_gesture_pan_get_orientation
import interop.gtk_gesture_pan_new
import interop.gtk_gesture_pan_set_orientation
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

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

public object GesturePanFactory {
  public fun new(widget: Widget?, orientation: Orientation): GesturePan =
      gtk_gesture_pan_new(widget?.reinterpret(), orientation)!!.reinterpret()
}

public var GesturePan.orientation: Orientation
  get() = gtk_gesture_pan_get_orientation(this)
  set(`value`) {
    gtk_gesture_pan_set_orientation(this, value)
  }

public fun GesturePan.onPan(callback: (GesturePan) -> Unit): GesturePan {
  // TODO - handle callback data

  asObject.connect("pan") { callback(this) }
  return this
}
