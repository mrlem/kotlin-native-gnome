// TODO - implement:
//   delete_surrounding
//   filter_keypress
//   focus_in
//   focus_out
//   get_preedit_string
//   get_surrounding
//   reset
//   set_client_window
//   set_cursor_location
//   set_surrounding
//   set_use_preedit
package org.gnome.gtk

import gtk3.GtkIMContext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IMContext = CPointer<GtkIMContext>

public val IMContext.asObject: Object
  get() = reinterpret()
