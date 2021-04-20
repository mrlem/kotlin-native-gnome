// TODO - handle_event
//
package org.gnome.gtk

import gtk3.GtkEventController
import gtk3.gtk_event_controller_get_propagation_phase
import gtk3.gtk_event_controller_get_widget
import gtk3.gtk_event_controller_reset
import gtk3.gtk_event_controller_set_propagation_phase
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EventController = CPointer<GtkEventController>

public val EventController.asObject: Object
  get() = reinterpret()

public var EventController.propagationPhase: PropagationPhase
  get() = gtk_event_controller_get_propagation_phase(this)
  set(`value`) {
    gtk_event_controller_set_propagation_phase(this, value)
  }

public val EventController.widget: Widget?
  get() = gtk_event_controller_get_widget(this)?.reinterpret()

public fun EventController.reset(): Unit {
  gtk_event_controller_reset(this)
}
