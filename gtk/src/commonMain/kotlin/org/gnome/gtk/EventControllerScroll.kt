package org.gnome.gtk

import gtk3.GtkEventControllerScroll
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EventControllerScroll = CPointer<GtkEventControllerScroll>

public val EventControllerScroll.asObject: Object
  get() = reinterpret()

public val EventControllerScroll.asEventController: EventController
  get() = reinterpret()
