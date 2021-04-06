// TODO - implement:
//   add_offset_value
//   get_mode
//   get_offset_value
//   remove_offset_value
//   set_mode
package org.gnome.gtk

import gtk3.GtkLevelBar
import gtk3.gtk_level_bar_get_inverted
import gtk3.gtk_level_bar_get_max_value
import gtk3.gtk_level_bar_get_min_value
import gtk3.gtk_level_bar_get_value
import gtk3.gtk_level_bar_set_inverted
import gtk3.gtk_level_bar_set_max_value
import gtk3.gtk_level_bar_set_min_value
import gtk3.gtk_level_bar_set_value
import kotlin.Boolean
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias LevelBar = CPointer<GtkLevelBar>

public val LevelBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LevelBar.asWidget: Widget
  get() = reinterpret()

public var LevelBar.inverted: Boolean
  get() = gtk_level_bar_get_inverted(this).toBoolean
  set(`value`) {
    gtk_level_bar_set_inverted(this, value.toInt)
  }

public var LevelBar.maxValue: Double
  get() = gtk_level_bar_get_max_value(this)
  set(`value`) {
    gtk_level_bar_set_max_value(this, value)
  }

public var LevelBar.minValue: Double
  get() = gtk_level_bar_get_min_value(this)
  set(`value`) {
    gtk_level_bar_set_min_value(this, value)
  }

public var LevelBar.`value`: Double
  get() = gtk_level_bar_get_value(this)
  set(`value`) {
    gtk_level_bar_set_value(this, value)
  }
