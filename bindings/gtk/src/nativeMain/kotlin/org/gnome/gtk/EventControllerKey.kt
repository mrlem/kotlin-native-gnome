@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEventControllerKey
import interop.gtk_event_controller_key_forward
import interop.gtk_event_controller_key_get_group
import interop.gtk_event_controller_key_get_im_context
import interop.gtk_event_controller_key_new
import interop.gtk_event_controller_key_set_im_context
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias EventControllerKey = CPointer<GtkEventControllerKey>

public val EventControllerKey.asObject: Object
  get() = reinterpret()

public val EventControllerKey.asEventController: EventController
  get() = reinterpret()

public object EventControllerKeyFactory {
  public fun new(widget: Widget?): EventControllerKey =
      gtk_event_controller_key_new(widget?.reinterpret())!!.reinterpret()
}

public val EventControllerKey.group: UInt
  get() = gtk_event_controller_key_get_group(this)

public var EventControllerKey.imContext: IMContext?
  get() = gtk_event_controller_key_get_im_context(this)?.reinterpret()
  set(`value`) {
    gtk_event_controller_key_set_im_context(this, `value`)
  }

public fun EventControllerKey.forward(widget: Widget?): Boolean =
    gtk_event_controller_key_forward(this, widget?.reinterpret()).toBoolean()

public fun EventControllerKey.onFocusIn(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("focus-in") { callback(this) }
  return this
}

public fun EventControllerKey.onFocusOut(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("focus-out") { callback(this) }
  return this
}

public fun EventControllerKey.onImUpdate(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("im-update") { callback(this) }
  return this
}

public fun EventControllerKey.onKeyPressed(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("key-pressed") { callback(this) }
  return this
}

public fun EventControllerKey.onKeyReleased(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("key-released") { callback(this) }
  return this
}

public fun EventControllerKey.onModifiers(callback: (EventControllerKey) -> Unit):
    EventControllerKey {
  // TODO - handle callback data

  asObject.connect("modifiers") { callback(this) }
  return this
}
