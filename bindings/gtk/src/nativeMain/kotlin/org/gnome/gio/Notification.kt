// TODO - constructor: new
// TODO - method: add_button_with_target
// TODO - method: set_default_action_and_target
// TODO - method: set_urgent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNotification
import interop.g_notification_add_button
import interop.g_notification_set_body
import interop.g_notification_set_default_action
import interop.g_notification_set_icon
import interop.g_notification_set_priority
import interop.g_notification_set_title
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Notification = CPointer<GNotification>

public val Notification.asObject: Object
  get() = reinterpret()

public object NotificationFactory

public fun Notification.addButton(label: String, detailedAction: String): Unit {
  g_notification_add_button(this, label, detailedAction)
}

public fun Notification.setBody(body: String): Unit {
  g_notification_set_body(this, body)
}

public fun Notification.setDefaultAction(detailedAction: String): Unit {
  g_notification_set_default_action(this, detailedAction)
}

public fun Notification.setIcon(icon: Icon?): Unit {
  g_notification_set_icon(this, icon?.reinterpret())
}

public fun Notification.setPriority(priority: NotificationPriority): Unit {
  g_notification_set_priority(this, priority)
}

public fun Notification.setTitle(title: String): Unit {
  g_notification_set_title(this, title)
}
