// TODO - method: get_offset_value
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLevelBar
import interop.gtk_level_bar_add_offset_value
import interop.gtk_level_bar_get_inverted
import interop.gtk_level_bar_get_max_value
import interop.gtk_level_bar_get_min_value
import interop.gtk_level_bar_get_mode
import interop.gtk_level_bar_get_value
import interop.gtk_level_bar_new
import interop.gtk_level_bar_new_for_interval
import interop.gtk_level_bar_remove_offset_value
import interop.gtk_level_bar_set_inverted
import interop.gtk_level_bar_set_max_value
import interop.gtk_level_bar_set_min_value
import interop.gtk_level_bar_set_mode
import interop.gtk_level_bar_set_value
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias LevelBar = CPointer<GtkLevelBar>

public val LevelBar.asObject: Object
  get() = reinterpret()

public val LevelBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LevelBar.asWidget: Widget
  get() = reinterpret()

public object LevelBarFactory {
  public fun new(): LevelBar = gtk_level_bar_new()!!.reinterpret()

  public fun newForInterval(minValue: Double, maxValue: Double): LevelBar =
      gtk_level_bar_new_for_interval(minValue, maxValue)!!.reinterpret()
}

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

public var LevelBar.mode: LevelBarMode
  get() = gtk_level_bar_get_mode(this)
  set(`value`) {
    gtk_level_bar_set_mode(this, value)
  }

public var LevelBar.`value`: Double
  get() = gtk_level_bar_get_value(this)
  set(`value`) {
    gtk_level_bar_set_value(this, value)
  }

public fun LevelBar.addOffsetValue(name: String, `value`: Double): Unit {
  gtk_level_bar_add_offset_value(this, name, value)
}

public fun LevelBar.removeOffsetValue(name: String): Unit {
  gtk_level_bar_remove_offset_value(this, name)
}

public fun LevelBar.onOffsetChanged(callback: (LevelBar) -> Unit): LevelBar {
  // TODO - handle callback data

  asObject.connect("offset-changed") { callback(this) }
  return this
}
