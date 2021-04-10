// TODO - implement:
//   handle_event
//   set_propagation_phase
package org.gnome.gtk

import gtk3.GtkEventController
import gtk3.gtk_event_controller_get_propagation_phase
import gtk3.gtk_event_controller_get_widget
import gtk3.gtk_event_controller_reset
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EventController = CPointer<GtkEventController>

public val EventController.asObject: Object
  get() = reinterpret()

public fun EventController.getPropagationPhase(): Unit {
  gtk_event_controller_get_propagation_phase(this)
}

public fun EventController.getWidget(): Unit {
  gtk_event_controller_get_widget(this)
}

public fun EventController.reset(): Unit {
  gtk_event_controller_reset(this)
}
