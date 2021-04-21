// TODO - method: enter
// TODO - method: get_alignment
// TODO - method: get_event_window
// TODO - method: get_focus_on_click
// TODO - method: get_use_stock
// TODO - method: leave
// TODO - method: pressed
// TODO - method: released
// TODO - method: set_alignment
// TODO - method: set_focus_on_click
// TODO - method: set_use_stock
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.*
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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

public var Button.alwaysShowImage: Boolean
  get() = gtk_button_get_always_show_image(this).toBoolean
  set(`value`) {
    gtk_button_set_always_show_image(this, value.toInt)
  }

public var Button.image: Widget?
  get() = gtk_button_get_image(this)?.reinterpret()
  set(`value`) {
    gtk_button_set_image(this, value)
  }

public var Button.imagePosition: PositionType
  get() = gtk_button_get_image_position(this)
  set(`value`) {
    gtk_button_set_image_position(this, value)
  }

public var Button.label: String
  get() = gtk_button_get_label(this).toKString
  set(`value`) {
    gtk_button_set_label(this, value)
  }

public var Button.relief: ReliefStyle
  get() = gtk_button_get_relief(this)
  set(`value`) {
    gtk_button_set_relief(this, value)
  }

public var Button.useUnderline: Boolean
  get() = gtk_button_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_button_set_use_underline(this, value.toInt)
  }

public fun Button.clicked(): Unit {
  gtk_button_clicked(this)
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

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Button(label: String) = gtk_button_new_with_label(label)!!.reinterpret<GtkButton>()
