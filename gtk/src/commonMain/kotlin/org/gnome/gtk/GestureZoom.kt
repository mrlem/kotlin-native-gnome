// TODO - implement:
//   get_scale_delta
package org.gnome.gtk

import gtk3.GtkGestureZoom
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias GestureZoom = CPointer<GtkGestureZoom>

public val GestureZoom.asObject: Object
  get() = reinterpret()

public val GestureZoom.asEventController: EventController
  get() = reinterpret()

public val GestureZoom.asGesture: Gesture
  get() = reinterpret()
