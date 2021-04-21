// TODO - signal: scale-changed
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkGestureZoom
import gtk3.gtk_gesture_zoom_get_scale_delta
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias GestureZoom = CPointer<GtkGestureZoom>

public val GestureZoom.asObject: Object
  get() = reinterpret()

public val GestureZoom.asEventController: EventController
  get() = reinterpret()

public val GestureZoom.asGesture: Gesture
  get() = reinterpret()

public val GestureZoom.scaleDelta: Double
  get() = gtk_gesture_zoom_get_scale_delta(this)
