// TODO - implement:
//   delete_surrounding
//   filter_keypress
//   get_preedit_string
//   get_surrounding
//   set_client_window
//   set_cursor_location
//   set_surrounding
//   set_use_preedit
package org.gnome.gtk

import gtk3.GtkIMContext
import gtk3.gtk_im_context_focus_in
import gtk3.gtk_im_context_focus_out
import gtk3.gtk_im_context_reset
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IMContext = CPointer<GtkIMContext>

public val IMContext.asObject: Object
  get() = reinterpret()

public fun IMContext.focusIn(): Unit {
  gtk_im_context_focus_in(this)
}

public fun IMContext.focusOut(): Unit {
  gtk_im_context_focus_out(this)
}

public fun IMContext.reset(): Unit {
  gtk_im_context_reset(this)
}
