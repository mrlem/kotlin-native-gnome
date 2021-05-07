@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNotification
import interop.g_notification_add_button
import interop.g_notification_add_button_with_target_value
import interop.g_notification_new
import interop.g_notification_set_body
import interop.g_notification_set_default_action
import interop.g_notification_set_default_action_and_target_value
import interop.g_notification_set_icon
import interop.g_notification_set_priority
import interop.g_notification_set_title
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.gobject.Object

public typealias Notification = CPointer<GNotification>

public val Notification.asObject: Object
  get() = reinterpret()

public object NotificationFactory {
  public fun new(title: String?): Notification = g_notification_new(title)!!.reinterpret()
}

public fun Notification.addButton(label: String?, detailedAction: String?): Unit {
  g_notification_add_button(this@addButton, label, detailedAction)
}

public fun Notification.addButtonWithTarget(
  label: String?,
  action: String?,
  target: Variant?
): Unit {
  g_notification_add_button_with_target_value(this@addButtonWithTarget, label, action,
      target?.reinterpret())
}

public fun Notification.setBody(body: String?): Unit {
  g_notification_set_body(this@setBody, body)
}

public fun Notification.setDefaultAction(detailedAction: String?): Unit {
  g_notification_set_default_action(this@setDefaultAction, detailedAction)
}

public fun Notification.setDefaultActionAndTarget(action: String?, target: Variant?): Unit {
  g_notification_set_default_action_and_target_value(this@setDefaultActionAndTarget, action,
      target?.reinterpret())
}

public fun Notification.setIcon(icon: Icon?): Unit {
  g_notification_set_icon(this@setIcon, icon?.reinterpret())
}

public fun Notification.setPriority(priority: NotificationPriority): Unit {
  g_notification_set_priority(this@setPriority, priority)
}

public fun Notification.setTitle(title: String?): Unit {
  g_notification_set_title(this@setTitle, title)
}
