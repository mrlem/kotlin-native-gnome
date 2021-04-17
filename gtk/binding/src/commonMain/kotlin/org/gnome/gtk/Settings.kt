// TODO - implement:
//   reset_property
//   set_double_property
//   set_long_property
//   set_property_value
//   set_string_property
package org.gnome.gtk

import gtk3.GtkSettings
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Settings = CPointer<GtkSettings>

public val Settings.asObject: Object
  get() = reinterpret()
