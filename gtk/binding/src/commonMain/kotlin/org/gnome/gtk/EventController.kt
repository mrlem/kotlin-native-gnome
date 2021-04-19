// TODO - get_propagation_phase
// TODO - handle_event
// TODO - set_propagation_phase
//
package org.gnome.gtk

import gtk3.GtkEventController
import gtk3.gtk_event_controller_get_widget
import gtk3.gtk_event_controller_reset
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EventController = CPointer<GtkEventController>

public val EventController.asObject: Object
  get() = reinterpret()

public fun EventController.getWidget(): Widget? =
    gtk_event_controller_get_widget(this)?.reinterpret()

public fun EventController.reset(): Unit {
  gtk_event_controller_reset(this)
}
