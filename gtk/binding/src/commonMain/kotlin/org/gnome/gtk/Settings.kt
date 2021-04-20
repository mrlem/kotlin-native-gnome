// TODO - set_double_property
// TODO - set_long_property
// TODO - set_property_value
// TODO - set_string_property
//
package org.gnome.gtk

import gtk3.GtkSettings
import gtk3.gtk_settings_reset_property
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Settings = CPointer<GtkSettings>

public val Settings.asObject: Object
  get() = reinterpret()

public fun Settings.resetProperty(name: String?): Unit {
  gtk_settings_reset_property(this, name)
}
