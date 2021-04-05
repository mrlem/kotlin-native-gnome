package org.gnome.gtk

import gtk3.GtkGestureSwipe
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias GestureSwipe = CPointer<GtkGestureSwipe>

public val GestureSwipe.asObject: Object
  get() = reinterpret()

public val GestureSwipe.asEventController: EventController
  get() = reinterpret()

public val GestureSwipe.asGesture: Gesture
  get() = reinterpret()

public val GestureSwipe.asGestureSingle: GestureSingle
  get() = reinterpret()
