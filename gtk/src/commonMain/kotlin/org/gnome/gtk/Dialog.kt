// TODO - implement:
//   add_action_widget
//   add_button
//   add_buttons
//   get_action_area
//   get_content_area
//   get_header_bar
//   get_response_for_widget
//   get_widget_for_response
//   response
//   run
//   set_alternative_button_order
//   set_alternative_button_order_from_array
//   set_response_sensitive
//   set_default_response
package org.gnome.gtk

import gtk3.GtkDialog
import gtk3.gtk_dialog_run
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Dialog = CPointer<GtkDialog>

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

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

fun Dialog.run() = gtk_dialog_run(this)
