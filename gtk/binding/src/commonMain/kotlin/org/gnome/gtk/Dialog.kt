// TODO - implement:
//   add_action_widget
//   add_button
//   add_buttons
//   get_response_for_widget
//   get_widget_for_response
//   response
//   set_alternative_button_order
//   set_alternative_button_order_from_array
//   set_response_sensitive
//   set_default_response
package org.gnome.gtk

import gtk3.GtkDialog
import gtk3.gtk_dialog_get_content_area
import gtk3.gtk_dialog_get_header_bar
import gtk3.gtk_dialog_run
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Dialog = CPointer<GtkDialog>

public val Dialog.asObject: Object
  get() = reinterpret()

public val Dialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Dialog.asWidget: Widget
  get() = reinterpret()

public val Dialog.asContainer: Container
  get() = reinterpret()

public val Dialog.asBin: Bin
  get() = reinterpret()

public val Dialog.asWindow: Window
  get() = reinterpret()

public fun Dialog.getContentArea(): Unit {
  gtk_dialog_get_content_area(this)
}

public fun Dialog.getHeaderBar(): Unit {
  gtk_dialog_get_header_bar(this)
}

public fun Dialog.run(): Int = gtk_dialog_run(this)
