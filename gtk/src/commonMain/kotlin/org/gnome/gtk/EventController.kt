// TODO - implement:
//   get_propagation_phase
//   get_widget
//   handle_event
//   reset
//   set_propagation_phase
package org.gnome.gtk

import gtk3.GtkEventController
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EventController = CPointer<GtkEventController>

public val EventController.asObject: Object
  get() = reinterpret()
