@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEventControllerMotion
import interop.gtk_event_controller_motion_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias EventControllerMotion = CPointer<GtkEventControllerMotion>

public val EventControllerMotion.asObject: Object
  get() = reinterpret()

public val EventControllerMotion.asEventController: EventController
  get() = reinterpret()

public object EventControllerMotionFactory {
  public fun new(widget: Widget?): EventControllerMotion =
      gtk_event_controller_motion_new(widget?.reinterpret())!!.reinterpret()
}

public fun EventControllerMotion.onEnter(callback: (EventControllerMotion) -> Unit):
    EventControllerMotion {
  // TODO - handle callback data

  asObject.connect("enter") { callback(this) }
  return this
}

public fun EventControllerMotion.onLeave(callback: (EventControllerMotion) -> Unit):
    EventControllerMotion {
  // TODO - handle callback data

  asObject.connect("leave") { callback(this) }
  return this
}

public fun EventControllerMotion.onMotion(callback: (EventControllerMotion) -> Unit):
    EventControllerMotion {
  // TODO - handle callback data

  asObject.connect("motion") { callback(this) }
  return this
}
