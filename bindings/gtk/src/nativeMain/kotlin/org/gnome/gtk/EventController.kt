@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEventController
import interop.gtk_event_controller_get_propagation_phase
import interop.gtk_event_controller_get_widget
import interop.gtk_event_controller_handle_event
import interop.gtk_event_controller_reset
import interop.gtk_event_controller_set_propagation_phase
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean

public typealias EventController = CPointer<GtkEventController>

public val EventController.asObject: Object
  get() = reinterpret()

public var EventController.propagationPhase: PropagationPhase
  get() = gtk_event_controller_get_propagation_phase(this)
  set(`value`) {
    gtk_event_controller_set_propagation_phase(this@propagationPhase, `value`)
  }

public val EventController.widget: Widget?
  get() = gtk_event_controller_get_widget(this)?.reinterpret()

public fun EventController.handleEvent(event: Event?): Boolean =
    gtk_event_controller_handle_event(this@handleEvent, event?.reinterpret()).toBoolean()

public fun EventController.reset(): Unit {
  gtk_event_controller_reset(this@reset)
}
