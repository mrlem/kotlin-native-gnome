package org.gnome.gtk

import gtk3.GtkGestureSingle
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias GestureSingle = CPointer<GtkGestureSingle>

public val GestureSingle.asObject: Object
  get() = reinterpret()

public val GestureSingle.asEventController: EventController
  get() = reinterpret()

public val GestureSingle.asGesture: Gesture
  get() = reinterpret()
