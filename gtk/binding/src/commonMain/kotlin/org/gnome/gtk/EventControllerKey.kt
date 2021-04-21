// TODO - signal: focus-in
// TODO - signal: focus-out
// TODO - signal: im-update
// TODO - signal: key-pressed
// TODO - signal: key-released
// TODO - signal: modifiers
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEventControllerKey
import gtk3.gtk_event_controller_key_forward
import gtk3.gtk_event_controller_key_get_group
import gtk3.gtk_event_controller_key_get_im_context
import gtk3.gtk_event_controller_key_set_im_context
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias EventControllerKey = CPointer<GtkEventControllerKey>

public val EventControllerKey.asObject: Object
  get() = reinterpret()

public val EventControllerKey.asEventController: EventController
  get() = reinterpret()

public val EventControllerKey.group: UInt
  get() = gtk_event_controller_key_get_group(this)

public var EventControllerKey.imContext: IMContext?
  get() = gtk_event_controller_key_get_im_context(this)?.reinterpret()
  set(`value`) {
    gtk_event_controller_key_set_im_context(this, value)
  }

public fun EventControllerKey.forward(widget: Widget?): Boolean =
    gtk_event_controller_key_forward(this, widget?.reinterpret()).toBoolean
