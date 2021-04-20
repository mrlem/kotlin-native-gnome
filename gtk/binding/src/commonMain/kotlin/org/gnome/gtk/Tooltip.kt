// TODO - set_icon
// TODO - set_icon_from_gicon
// TODO - set_icon_from_icon_name
// TODO - set_icon_from_stock
// TODO - set_tip_area
//
package org.gnome.gtk

import gtk3.GtkTooltip
import gtk3.gtk_tooltip_set_custom
import gtk3.gtk_tooltip_set_markup
import gtk3.gtk_tooltip_set_text
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Tooltip = CPointer<GtkTooltip>

public val Tooltip.asObject: Object
  get() = reinterpret()

public fun Tooltip.setCustom(customWidget: Widget): Unit {
  gtk_tooltip_set_custom(this, customWidget.reinterpret())
}

public fun Tooltip.setMarkup(markup: String?): Unit {
  gtk_tooltip_set_markup(this, markup)
}

public fun Tooltip.setText(text: String?): Unit {
  gtk_tooltip_set_text(this, text)
}
