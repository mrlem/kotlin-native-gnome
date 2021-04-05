// TODO - implement:
//   get_custom_title
//   get_decoration_layout
//   get_has_subtitle
//   get_show_close_button
//   get_subtitle
//   get_title
//   pack_end
//   pack_start
//   set_custom_title
//   set_decoration_layout
//   set_has_subtitle
//   set_show_close_button
//   set_subtitle
//   set_title
package org.gnome.gtk

import gtk3.GtkHeaderBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias HeaderBar = CPointer<GtkHeaderBar>

public val HeaderBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val HeaderBar.asWidget: Widget
  get() = reinterpret()

public val HeaderBar.asContainer: Container
  get() = reinterpret()
