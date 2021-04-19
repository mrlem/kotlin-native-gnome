// TODO - get_orientation
// TODO - set_orientation
//
package org.gnome.gtk

import gtk3.GtkGesturePan
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

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
