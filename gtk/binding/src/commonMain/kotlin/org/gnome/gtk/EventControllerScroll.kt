package org.gnome.gtk

import gtk3.GtkEventControllerScroll
import gtk3.gtk_event_controller_scroll_get_flags
import gtk3.gtk_event_controller_scroll_set_flags
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EventControllerScroll = CPointer<GtkEventControllerScroll>

public val EventControllerScroll.asObject: Object
  get() = reinterpret()

public val EventControllerScroll.asEventController: EventController
  get() = reinterpret()

public fun EventControllerScroll.getFlags(): EventControllerScrollFlags =
    gtk_event_controller_scroll_get_flags(this)

public fun EventControllerScroll.setFlags(flags: EventControllerScrollFlags): Unit {
  gtk_event_controller_scroll_set_flags(this, flags)
}
