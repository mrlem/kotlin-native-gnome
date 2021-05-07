// TODO - constructor: new_with_buttons
// TODO - method: add_buttons (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkInfoBar
import interop.gtk_info_bar_add_action_widget
import interop.gtk_info_bar_add_button
import interop.gtk_info_bar_get_action_area
import interop.gtk_info_bar_get_content_area
import interop.gtk_info_bar_get_message_type
import interop.gtk_info_bar_get_revealed
import interop.gtk_info_bar_get_show_close_button
import interop.gtk_info_bar_new
import interop.gtk_info_bar_response
import interop.gtk_info_bar_set_default_response
import interop.gtk_info_bar_set_message_type
import interop.gtk_info_bar_set_response_sensitive
import interop.gtk_info_bar_set_revealed
import interop.gtk_info_bar_set_show_close_button
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias InfoBar = CPointer<GtkInfoBar>

public val InfoBar.asObject: Object
  get() = reinterpret()

public val InfoBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val InfoBar.asWidget: Widget
  get() = reinterpret()

public val InfoBar.asContainer: Container
  get() = reinterpret()

public val InfoBar.asBox: Box
  get() = reinterpret()

public object InfoBarFactory {
  public fun new(): InfoBar = gtk_info_bar_new()!!.reinterpret()
}

public val InfoBar.parent: Box
  get() = pointed.parent.ptr

public val InfoBar.actionArea: Box?
  get() = gtk_info_bar_get_action_area(this)?.reinterpret()

public val InfoBar.contentArea: Box?
  get() = gtk_info_bar_get_content_area(this)?.reinterpret()

public var InfoBar.messageType: MessageType
  get() = gtk_info_bar_get_message_type(this)
  set(`value`) {
    gtk_info_bar_set_message_type(this@messageType, `value`)
  }

public var InfoBar.revealed: Boolean
  get() = gtk_info_bar_get_revealed(this).toBoolean()
  set(`value`) {
    gtk_info_bar_set_revealed(this@revealed, `value`.toInt())
  }

public var InfoBar.showCloseButton: Boolean
  get() = gtk_info_bar_get_show_close_button(this).toBoolean()
  set(`value`) {
    gtk_info_bar_set_show_close_button(this@showCloseButton, `value`.toInt())
  }

public fun InfoBar.addActionWidget(child: Widget?, responseId: Int): Unit {
  gtk_info_bar_add_action_widget(this@addActionWidget, child?.reinterpret(), responseId)
}

public fun InfoBar.addButton(buttonText: String?, responseId: Int): Button? =
    gtk_info_bar_add_button(this@addButton, buttonText, responseId)?.reinterpret()

public fun InfoBar.response(responseId: Int): Unit {
  gtk_info_bar_response(this@response, responseId)
}

public fun InfoBar.setDefaultResponse(responseId: Int): Unit {
  gtk_info_bar_set_default_response(this@setDefaultResponse, responseId)
}

public fun InfoBar.setResponseSensitive(responseId: Int, setting: Boolean): Unit {
  gtk_info_bar_set_response_sensitive(this@setResponseSensitive, responseId, setting.toInt())
}

public fun InfoBar.onClose(callback: (InfoBar) -> Unit): InfoBar {
  // TODO - handle callback data

  asObject.connect("close") { callback(this) }
  return this
}

public fun InfoBar.onResponse(callback: (InfoBar) -> Unit): InfoBar {
  // TODO - handle callback data

  asObject.connect("response") { callback(this) }
  return this
}
