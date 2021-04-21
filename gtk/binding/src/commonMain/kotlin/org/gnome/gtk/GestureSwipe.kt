// TODO - method: get_velocity
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureSwipe
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias GestureSwipe = CPointer<GtkGestureSwipe>

public val GestureSwipe.asObject: Object
  get() = reinterpret()

public val GestureSwipe.asEventController: EventController
  get() = reinterpret()

public val GestureSwipe.asGesture: Gesture
  get() = reinterpret()

public val GestureSwipe.asGestureSingle: GestureSingle
  get() = reinterpret()

public fun GestureSwipe.onSwipe(callback: (GestureSwipe) -> Unit): GestureSwipe {
  // TODO - handle callback data

  asObject.connect("swipe") { callback(this) }
  return this
}
