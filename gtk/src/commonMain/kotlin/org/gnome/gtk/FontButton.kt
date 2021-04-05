// TODO - implement:
//   get_font_name
//   get_show_size
//   get_show_style
//   get_title
//   get_use_font
//   get_use_size
//   set_font_name
//   set_show_size
//   set_show_style
//   set_title
//   set_use_font
//   set_use_size
package org.gnome.gtk

import gtk3.GtkFontButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FontButton = CPointer<GtkFontButton>

public val FontButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontButton.asWidget: Widget
  get() = reinterpret()

public val FontButton.asContainer: Container
  get() = reinterpret()

public val FontButton.asBin: Bin
  get() = reinterpret()

public val FontButton.asButton: Button
  get() = reinterpret()
