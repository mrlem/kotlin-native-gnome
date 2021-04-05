// TODO - implement:
//   add_offset_value
//   get_inverted
//   get_max_value
//   get_min_value
//   get_mode
//   get_offset_value
//   get_value
//   remove_offset_value
//   set_inverted
//   set_max_value
//   set_min_value
//   set_mode
//   set_value
package org.gnome.gtk

import gtk3.GtkLevelBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias LevelBar = CPointer<GtkLevelBar>

public val LevelBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LevelBar.asWidget: Widget
  get() = reinterpret()
