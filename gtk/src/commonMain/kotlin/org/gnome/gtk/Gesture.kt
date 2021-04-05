// TODO - implement:
//   get_bounding_box
//   get_bounding_box_center
//   get_device
//   get_group
//   get_last_event
//   get_last_updated_sequence
//   get_point
//   get_sequence_state
//   get_sequences
//   get_window
//   group
//   handles_sequence
//   is_active
//   is_grouped_with
//   is_recognized
//   set_sequence_state
//   set_state
//   set_window
//   ungroup
package org.gnome.gtk

import gtk3.GtkGesture
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Gesture = CPointer<GtkGesture>

public val Gesture.asObject: Object
  get() = reinterpret()

public val Gesture.asEventController: EventController
  get() = reinterpret()
