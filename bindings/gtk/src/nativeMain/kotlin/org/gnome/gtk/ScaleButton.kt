@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScaleButton
import interop.gtk_scale_button_get_adjustment
import interop.gtk_scale_button_get_minus_button
import interop.gtk_scale_button_get_plus_button
import interop.gtk_scale_button_get_popup
import interop.gtk_scale_button_get_value
import interop.gtk_scale_button_new
import interop.gtk_scale_button_set_adjustment
import interop.gtk_scale_button_set_icons
import interop.gtk_scale_button_set_value
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toCArray
import org.mrlem.gnome.gobject.connect

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

public object ScaleButtonFactory {
  public fun new(
    size: IconSize,
    min: Double,
    max: Double,
    step: Double,
    icons: Array<String>?
  ): ScaleButton = memScoped { gtk_scale_button_new(size, min, max, step,
      icons?.toCArray(memScope))!!.reinterpret() }
}

public val ScaleButton.parent: Button
  get() = pointed.parent.ptr

public var ScaleButton.adjustment: Adjustment?
  get() = gtk_scale_button_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_scale_button_set_adjustment(this@adjustment, `value`)
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
    gtk_scale_button_set_value(this@`value`, `value`)
  }

public fun ScaleButton.setIcons(icons: Array<String>?): Unit {
  memScoped { gtk_scale_button_set_icons(this@setIcons, icons?.toCArray(memScope)) }
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
