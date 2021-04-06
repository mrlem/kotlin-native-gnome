// TODO - implement:
//   clicked
//   enter
//   get_alignment
//   get_event_window
//   get_image
//   get_image_position
//   get_relief
//   leave
//   pressed
//   released
//   set_alignment
//   set_image
//   set_image_position
//   set_relief
package org.gnome.gtk

import gtk3.*
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Button = CPointer<GtkButton>

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

public var Button.focusOnClick: Boolean
  get() = gtk_button_get_focus_on_click(this).toBoolean
  set(`value`) {
    gtk_button_set_focus_on_click(this, value.toInt)
  }

public var Button.label: String?
  get() = gtk_button_get_label(this).toKString
  set(`value`) {
    gtk_button_set_label(this, value)
  }

public var Button.useStock: Boolean
  get() = gtk_button_get_use_stock(this).toBoolean
  set(`value`) {
    gtk_button_set_use_stock(this, value.toInt)
  }

public var Button.useUnderline: Boolean
  get() = gtk_button_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_button_set_use_underline(this, value.toInt)
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
  asInitiallyUnowned.asObject.connect("clicked") { onClick(this) }
  return this
}
