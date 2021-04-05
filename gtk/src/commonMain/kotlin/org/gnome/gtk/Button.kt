// TODO - implement:
//   clicked
//   enter
//   get_alignment
//   get_always_show_image
//   get_event_window
//   get_focus_on_click
//   get_image
//   get_image_position
//   get_label
//   get_relief
//   get_use_stock
//   get_use_underline
//   leave
//   pressed
//   released
//   set_alignment
//   set_always_show_image
//   set_focus_on_click
//   set_image
//   set_image_position
//   set_label
//   set_relief
//   set_use_stock
//   set_use_underline
package org.gnome.gtk

import gtk3.GtkButton
import gtk3.gtk_button_new_with_label
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect

public typealias Button = CPointer<GtkButton>

public val Button.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Button.asWidget: Widget
  get() = reinterpret()

public val Button.asContainer: Container
  get() = reinterpret()

public val Button.asBin: Bin
  get() = reinterpret()

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
