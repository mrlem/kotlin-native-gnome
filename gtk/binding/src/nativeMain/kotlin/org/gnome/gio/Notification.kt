// TODO - constructor: new
// TODO - method: add_button
// TODO - method: add_button_with_target
// TODO - method: set_body
// TODO - method: set_default_action
// TODO - method: set_default_action_and_target
// TODO - method: set_icon
// TODO - method: set_priority
// TODO - method: set_title
// TODO - method: set_urgent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNotification
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Notification = CPointer<GNotification>

public val Notification.asObject: Object
  get() = reinterpret()

public object NotificationFactory
