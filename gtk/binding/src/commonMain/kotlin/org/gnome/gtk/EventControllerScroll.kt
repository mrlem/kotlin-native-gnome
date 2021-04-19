package org.gnome.gtk

import gtk3.GtkEventControllerScroll
import gtk3.gtk_event_controller_scroll_get_flags
import gtk3.gtk_event_controller_scroll_set_flags
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

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
