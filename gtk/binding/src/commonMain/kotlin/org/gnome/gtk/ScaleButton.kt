// TODO - constructor: new
// TODO - method: set_icons
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

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
import org.gnome.gobject.connect

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

public object ScaleButtonFactory

public var ScaleButton.adjustment: Adjustment?
  get() = gtk_scale_button_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scale_button_set_adjustment(this, value)
  }

public val ScaleButton.minusButton: Button?
  get() = gtk_scale_button_get_minus_button(this)?.reinterpret()

public val ScaleButton.plusButton: Button?
  get() = gtk_scale_button_get_plus_button(this)?.reinterpret()

public val ScaleButton.popup: Widget?
  get() = gtk_scale_button_get_popup(this)?.reinterpret()

public var ScaleButton.`value`: Double
  get() = gtk_scale_button_get_value(this)
  set(`value`) {
    gtk_scale_button_set_value(this, value)
  }

public fun ScaleButton.onPopdown(callback: (ScaleButton) -> Unit): ScaleButton {
  // TODO - handle callback data

  asObject.connect("popdown") { callback(this) }
  return this
}

public fun ScaleButton.onPopup(callback: (ScaleButton) -> Unit): ScaleButton {
  // TODO - handle callback data

  asObject.connect("popup") { callback(this) }
  return this
}

public fun ScaleButton.onValueChanged(callback: (ScaleButton) -> Unit): ScaleButton {
  // TODO - handle callback data

  asObject.connect("value-changed") { callback(this) }
  return this
}
