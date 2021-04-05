// TODO - implement:
//   set_custom
//   set_icon
//   set_icon_from_gicon
//   set_icon_from_icon_name
//   set_icon_from_stock
//   set_markup
//   set_text
//   set_tip_area
package org.gnome.gtk

import gtk3.GtkTooltip
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Tooltip = CPointer<GtkTooltip>

public val Tooltip.asObject: Object
  get() = reinterpret()
