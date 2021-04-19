// TODO - get_mode
// TODO - get_offset_value
// TODO - set_mode
//
package org.gnome.gtk

import gtk3.GtkLevelBar
import gtk3.gtk_level_bar_add_offset_value
import gtk3.gtk_level_bar_get_inverted
import gtk3.gtk_level_bar_get_max_value
import gtk3.gtk_level_bar_get_min_value
import gtk3.gtk_level_bar_get_value
import gtk3.gtk_level_bar_remove_offset_value
import gtk3.gtk_level_bar_set_inverted
import gtk3.gtk_level_bar_set_max_value
import gtk3.gtk_level_bar_set_min_value
import gtk3.gtk_level_bar_set_value
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

public typealias LevelBar = CPointer<GtkLevelBar>

public val LevelBar.asObject: Object
  get() = reinterpret()

public val LevelBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LevelBar.asWidget: Widget
  get() = reinterpret()

public fun LevelBar.addOffsetValue(name: String?, `value`: Double): Unit {
  gtk_level_bar_add_offset_value(this, name, value)
}

public fun LevelBar.getInverted(): Boolean = gtk_level_bar_get_inverted(this).toBoolean

public fun LevelBar.getMaxValue(): Double = gtk_level_bar_get_max_value(this)

public fun LevelBar.getMinValue(): Double = gtk_level_bar_get_min_value(this)

public fun LevelBar.getValue(): Double = gtk_level_bar_get_value(this)

public fun LevelBar.removeOffsetValue(name: String?): Unit {
  gtk_level_bar_remove_offset_value(this, name)
}

public fun LevelBar.setInverted(inverted: Boolean): Unit {
  gtk_level_bar_set_inverted(this, inverted.toInt)
}

public fun LevelBar.setMaxValue(`value`: Double): Unit {
  gtk_level_bar_set_max_value(this, value)
}

public fun LevelBar.setMinValue(`value`: Double): Unit {
  gtk_level_bar_set_min_value(this, value)
}

public fun LevelBar.setValue(`value`: Double): Unit {
  gtk_level_bar_set_value(this, value)
}
