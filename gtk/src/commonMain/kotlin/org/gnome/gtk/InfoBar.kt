// TODO - implement:
//   add_action_widget
//   add_button
//   add_buttons
//   get_action_area
//   get_content_area
//   get_message_type
//   get_revealed
//   get_show_close_button
//   response
//   set_default_response
//   set_message_type
//   set_response_sensitive
//   set_revealed
//   set_show_close_button
package org.gnome.gtk

import gtk3.GtkInfoBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias InfoBar = CPointer<GtkInfoBar>

public val InfoBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val InfoBar.asWidget: Widget
  get() = reinterpret()

public val InfoBar.asContainer: Container
  get() = reinterpret()

public val InfoBar.asBox: Box
  get() = reinterpret()
