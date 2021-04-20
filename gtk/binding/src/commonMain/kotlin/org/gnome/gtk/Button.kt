// TODO - enter
// TODO - get_alignment
// TODO - get_event_window
// TODO - get_focus_on_click
// TODO - get_use_stock
// TODO - leave
// TODO - pressed
// TODO - released
// TODO - set_alignment
// TODO - set_focus_on_click
// TODO - set_use_stock
//
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

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Button(label: String) = gtk_button_new_with_label(label)!!.reinterpret<GtkButton>()

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun Button.onClick(onClick: (Button) -> Unit): Button {
  asObject.connect("clicked") { onClick(this) }
  return this
}
