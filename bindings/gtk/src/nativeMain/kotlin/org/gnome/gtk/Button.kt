// TODO - constructor: new_from_stock
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkButton
import interop.gtk_button_clicked
import interop.gtk_button_get_always_show_image
import interop.gtk_button_get_event_window
import interop.gtk_button_get_image
import interop.gtk_button_get_image_position
import interop.gtk_button_get_label
import interop.gtk_button_get_relief
import interop.gtk_button_get_use_underline
import interop.gtk_button_new
import interop.gtk_button_new_from_icon_name
import interop.gtk_button_new_with_label
import interop.gtk_button_new_with_mnemonic
import interop.gtk_button_set_always_show_image
import interop.gtk_button_set_image
import interop.gtk_button_set_image_position
import interop.gtk_button_set_label
import interop.gtk_button_set_relief
import interop.gtk_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Window
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias Button = CPointer<GtkButton>

public val Button.asObject: Object
  get() = reinterpret()

public val Button.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Button.asWidget: Widget
  get() = reinterpret()

public val Button.asContainer: Container
  get() = reinterpret()

public val Button.asBin: Bin
  get() = reinterpret()

public object ButtonFactory {
  public fun new(): Button = gtk_button_new()!!.reinterpret()

  public fun newFromIconName(iconName: String?, size: IconSize): Button =
      gtk_button_new_from_icon_name(iconName, size)!!.reinterpret()

  public fun newWithLabel(label: String?): Button = gtk_button_new_with_label(label)!!.reinterpret()

  public fun newWithMnemonic(label: String?): Button =
      gtk_button_new_with_mnemonic(label)!!.reinterpret()
}

public var Button.alwaysShowImage: Boolean
  get() = gtk_button_get_always_show_image(this).toBoolean()
  set(`value`) {
    gtk_button_set_always_show_image(this@alwaysShowImage, `value`.toInt())
  }

public val Button.eventWindow: Window?
  get() = gtk_button_get_event_window(this)?.reinterpret()

public var Button.image: Widget?
  get() = gtk_button_get_image(this)?.reinterpret()
  set(`value`) {
    gtk_button_set_image(this@image, `value`)
  }

public var Button.imagePosition: PositionType
  get() = gtk_button_get_image_position(this)
  set(`value`) {
    gtk_button_set_image_position(this@imagePosition, `value`)
  }

public var Button.label: String?
  get() = gtk_button_get_label(this).toKString()
  set(`value`) {
    gtk_button_set_label(this@label, `value`)
  }

public var Button.relief: ReliefStyle
  get() = gtk_button_get_relief(this)
  set(`value`) {
    gtk_button_set_relief(this@relief, `value`)
  }

public var Button.useUnderline: Boolean
  get() = gtk_button_get_use_underline(this).toBoolean()
  set(`value`) {
    gtk_button_set_use_underline(this@useUnderline, `value`.toInt())
  }

public fun Button.clicked(): Unit {
  gtk_button_clicked(this@clicked)
}

public fun Button.onActivate(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun Button.onClicked(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("clicked") { callback(this) }
  return this
}

public fun Button.onEnter(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("enter") { callback(this) }
  return this
}

public fun Button.onLeave(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("leave") { callback(this) }
  return this
}

public fun Button.onPressed(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("pressed") { callback(this) }
  return this
}

public fun Button.onReleased(callback: (Button) -> Unit): Button {
  // TODO - handle callback data

  asObject.connect("released") { callback(this) }
  return this
}
