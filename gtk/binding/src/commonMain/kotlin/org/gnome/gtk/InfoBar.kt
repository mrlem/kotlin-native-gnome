// TODO - add_buttons
// TODO - get_message_type
// TODO - set_message_type
//
package org.gnome.gtk

import gtk3.GtkInfoBar
import gtk3.gtk_info_bar_add_action_widget
import gtk3.gtk_info_bar_add_button
import gtk3.gtk_info_bar_get_action_area
import gtk3.gtk_info_bar_get_content_area
import gtk3.gtk_info_bar_get_revealed
import gtk3.gtk_info_bar_get_show_close_button
import gtk3.gtk_info_bar_response
import gtk3.gtk_info_bar_set_default_response
import gtk3.gtk_info_bar_set_response_sensitive
import gtk3.gtk_info_bar_set_revealed
import gtk3.gtk_info_bar_set_show_close_button
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public fun InfoBar.addActionWidget(child: Widget, responseId: Int): Unit {
  gtk_info_bar_add_action_widget(this, child.reinterpret(), responseId)
}

public fun InfoBar.addButton(buttonText: String?, responseId: Int): Button? =
    gtk_info_bar_add_button(this, buttonText, responseId)?.reinterpret()

public fun InfoBar.getActionArea(): Box? = gtk_info_bar_get_action_area(this)?.reinterpret()

public fun InfoBar.getContentArea(): Box? = gtk_info_bar_get_content_area(this)?.reinterpret()

public fun InfoBar.getRevealed(): Boolean = gtk_info_bar_get_revealed(this).toBoolean

public fun InfoBar.getShowCloseButton(): Boolean =
    gtk_info_bar_get_show_close_button(this).toBoolean

public fun InfoBar.response(responseId: Int): Unit {
  gtk_info_bar_response(this, responseId)
}

public fun InfoBar.setDefaultResponse(responseId: Int): Unit {
  gtk_info_bar_set_default_response(this, responseId)
}

public fun InfoBar.setResponseSensitive(responseId: Int, setting: Boolean): Unit {
  gtk_info_bar_set_response_sensitive(this, responseId, setting.toInt)
}

public fun InfoBar.setRevealed(revealed: Boolean): Unit {
  gtk_info_bar_set_revealed(this, revealed.toInt)
}

public fun InfoBar.setShowCloseButton(setting: Boolean): Unit {
  gtk_info_bar_set_show_close_button(this, setting.toInt)
}
