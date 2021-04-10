// TODO - implement:
//   forward
//   set_im_context
package org.gnome.gtk

import gtk3.GtkEventControllerKey
import gtk3.gtk_event_controller_key_get_group
import gtk3.gtk_event_controller_key_get_im_context
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EventControllerKey = CPointer<GtkEventControllerKey>

public val EventControllerKey.asObject: Object
  get() = reinterpret()

public val EventControllerKey.asEventController: EventController
  get() = reinterpret()

public fun EventControllerKey.getImContext(): Unit {
  gtk_event_controller_key_get_im_context(this)
}

public val EventControllerKey.group: UInt
  get() = gtk_event_controller_key_get_group(this)
