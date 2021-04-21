@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEventControllerScroll
import gtk3.gtk_event_controller_scroll_get_flags
import gtk3.gtk_event_controller_scroll_set_flags
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect

public typealias EventControllerScroll = CPointer<GtkEventControllerScroll>

public val EventControllerScroll.asObject: Object
  get() = reinterpret()

public val EventControllerScroll.asEventController: EventController
  get() = reinterpret()

public var EventControllerScroll.flags: EventControllerScrollFlags
  get() = gtk_event_controller_scroll_get_flags(this)
  set(`value`) {
    gtk_event_controller_scroll_set_flags(this, value)
  }

public fun EventControllerScroll.onDecelerate(callback: (EventControllerScroll) -> Unit):
    EventControllerScroll {
  // TODO - handle callback data

  asObject.connect("decelerate") { callback(this) }
  return this
}

public fun EventControllerScroll.onScroll(callback: (EventControllerScroll) -> Unit):
    EventControllerScroll {
  // TODO - handle callback data

  asObject.connect("scroll") { callback(this) }
  return this
}

public fun EventControllerScroll.onScrollBegin(callback: (EventControllerScroll) -> Unit):
    EventControllerScroll {
  // TODO - handle callback data

  asObject.connect("scroll-begin") { callback(this) }
  return this
}

public fun EventControllerScroll.onScrollEnd(callback: (EventControllerScroll) -> Unit):
    EventControllerScroll {
  // TODO - handle callback data

  asObject.connect("scroll-end") { callback(this) }
  return this
}
