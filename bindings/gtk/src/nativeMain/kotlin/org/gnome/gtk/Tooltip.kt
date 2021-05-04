// TODO - method: set_icon
// TODO - method: set_icon_from_stock
// TODO - method: set_tip_area
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTooltip
import interop.gtk_tooltip_set_custom
import interop.gtk_tooltip_set_icon_from_gicon
import interop.gtk_tooltip_set_icon_from_icon_name
import interop.gtk_tooltip_set_markup
import interop.gtk_tooltip_set_text
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Icon
import org.gnome.gobject.Object

public typealias Tooltip = CPointer<GtkTooltip>

public val Tooltip.asObject: Object
  get() = reinterpret()

public fun Tooltip.setCustom(customWidget: Widget?): Unit {
  gtk_tooltip_set_custom(this@setCustom, customWidget?.reinterpret())
}

public fun Tooltip.setIconFromGicon(gicon: Icon?, size: IconSize): Unit {
  gtk_tooltip_set_icon_from_gicon(this@setIconFromGicon, gicon?.reinterpret(), size)
}

public fun Tooltip.setIconFromIconName(iconName: String?, size: IconSize): Unit {
  gtk_tooltip_set_icon_from_icon_name(this@setIconFromIconName, iconName, size)
}

public fun Tooltip.setMarkup(markup: String?): Unit {
  gtk_tooltip_set_markup(this@setMarkup, markup)
}

public fun Tooltip.setText(text: String?): Unit {
  gtk_tooltip_set_text(this@setText, text)
}
