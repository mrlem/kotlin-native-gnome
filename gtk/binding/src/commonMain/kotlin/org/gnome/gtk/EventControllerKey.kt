package org.gnome.gtk

import gtk3.GtkEventControllerKey
import gtk3.gtk_event_controller_key_forward
import gtk3.gtk_event_controller_key_get_group
import gtk3.gtk_event_controller_key_get_im_context
import gtk3.gtk_event_controller_key_set_im_context
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias EventControllerKey = CPointer<GtkEventControllerKey>

public val EventControllerKey.asObject: Object
  get() = reinterpret()

public val EventControllerKey.asEventController: EventController
  get() = reinterpret()

public fun EventControllerKey.forward(widget: Widget): Boolean =
    gtk_event_controller_key_forward(this, widget.reinterpret()).toBoolean

public fun EventControllerKey.getGroup(): UInt = gtk_event_controller_key_get_group(this)

public fun EventControllerKey.getImContext(): IMContext? =
    gtk_event_controller_key_get_im_context(this)?.reinterpret()

public fun EventControllerKey.setImContext(imContext: IMContext): Unit {
  gtk_event_controller_key_set_im_context(this, imContext.reinterpret())
}
