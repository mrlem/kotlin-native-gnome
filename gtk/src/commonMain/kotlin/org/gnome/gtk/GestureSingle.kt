// TODO - implement:
//   get_button
//   get_current_button
//   get_current_sequence
//   get_exclusive
//   get_touch_only
//   set_button
//   set_exclusive
//   set_touch_only
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
