// TODO - implement:
//   add_action_widget
//   add_button
//   add_buttons
//   get_action_area
//   get_content_area
//   get_message_type
//   response
//   set_message_type
//   set_response_sensitive
//   set_default_response
package org.gnome.gtk

import gtk3.GtkInfoBar
import gtk3.gtk_info_bar_get_revealed
import gtk3.gtk_info_bar_get_show_close_button
import gtk3.gtk_info_bar_set_revealed
import gtk3.gtk_info_bar_set_show_close_button
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias InfoBar = CPointer<GtkInfoBar>

public val InfoBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val InfoBar.asWidget: Widget
  get() = reinterpret()

public val InfoBar.asContainer: Container
  get() = reinterpret()

public val InfoBar.asBox: Box
  get() = reinterpret()

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
