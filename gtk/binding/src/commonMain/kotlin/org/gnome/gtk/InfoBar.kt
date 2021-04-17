// TODO - implement:
//   add_action_widget
//   add_button
//   add_buttons
//   response
//   set_message_type
//   set_response_sensitive
//   set_default_response
package org.gnome.gtk

import gtk3.GtkInfoBar
import gtk3.gtk_info_bar_get_action_area
import gtk3.gtk_info_bar_get_content_area
import gtk3.gtk_info_bar_get_message_type
import gtk3.gtk_info_bar_get_revealed
import gtk3.gtk_info_bar_get_show_close_button
import gtk3.gtk_info_bar_set_revealed
import gtk3.gtk_info_bar_set_show_close_button
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

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

public fun InfoBar.getActionArea(): Unit {
  gtk_info_bar_get_action_area(this)
}

public fun InfoBar.getContentArea(): Unit {
  gtk_info_bar_get_content_area(this)
}

public fun InfoBar.getMessageType(): Unit {
  gtk_info_bar_get_message_type(this)
}

public var InfoBar.revealed: Boolean
  get() = gtk_info_bar_get_revealed(this).toBoolean
  set(`value`) {
    gtk_info_bar_set_revealed(this, value.toInt)
  }

public var InfoBar.showCloseButton: Boolean
  get() = gtk_info_bar_get_show_close_button(this).toBoolean
  set(`value`) {
    gtk_info_bar_set_show_close_button(this, value.toInt)
  }
