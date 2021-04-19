// TODO - set_icons
//
package org.gnome.gtk

import gtk3.GtkScaleButton
import gtk3.gtk_scale_button_get_adjustment
import gtk3.gtk_scale_button_get_minus_button
import gtk3.gtk_scale_button_get_plus_button
import gtk3.gtk_scale_button_get_popup
import gtk3.gtk_scale_button_get_value
import gtk3.gtk_scale_button_set_adjustment
import gtk3.gtk_scale_button_set_value
import kotlin.Double
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ScaleButton = CPointer<GtkScaleButton>

public val ScaleButton.asObject: Object
  get() = reinterpret()

public val ScaleButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ScaleButton.asWidget: Widget
  get() = reinterpret()

public val ScaleButton.asContainer: Container
  get() = reinterpret()

public val ScaleButton.asBin: Bin
  get() = reinterpret()

public val ScaleButton.asButton: Button
  get() = reinterpret()

public fun ScaleButton.getAdjustment(): Adjustment? =
    gtk_scale_button_get_adjustment(this)?.reinterpret()

public fun ScaleButton.getMinusButton(): Button? =
    gtk_scale_button_get_minus_button(this)?.reinterpret()

public fun ScaleButton.getPlusButton(): Button? =
    gtk_scale_button_get_plus_button(this)?.reinterpret()

public fun ScaleButton.getPopup(): Widget? = gtk_scale_button_get_popup(this)?.reinterpret()

public fun ScaleButton.getValue(): Double = gtk_scale_button_get_value(this)

public fun ScaleButton.setAdjustment(adjustment: Adjustment): Unit {
  gtk_scale_button_set_adjustment(this, adjustment.reinterpret())
}

public fun ScaleButton.setValue(`value`: Double): Unit {
  gtk_scale_button_set_value(this, value)
}
