@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkGestureZoom
import gtk3.gtk_gesture_zoom_get_scale_delta
import gtk3.gtk_gesture_zoom_new
import kotlin.Double
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias GestureZoom = CPointer<GtkGestureZoom>

public val GestureZoom.asObject: Object
  get() = reinterpret()

public val GestureZoom.asEventController: EventController
  get() = reinterpret()

public val GestureZoom.asGesture: Gesture
  get() = reinterpret()

public object GestureZoomFactory {
  public fun new(widget: Widget?): GestureZoom =
      gtk_gesture_zoom_new(widget?.reinterpret())!!.reinterpret()
}

public val GestureZoom.scaleDelta: Double
  get() = gtk_gesture_zoom_get_scale_delta(this)

public fun GestureZoom.onScaleChanged(callback: (GestureZoom) -> Unit): GestureZoom {
  // TODO - handle callback data

  asObject.connect("scale-changed") { callback(this) }
  return this
}
