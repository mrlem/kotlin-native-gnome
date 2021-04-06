// TODO - implement:
//   add_action_widget
//   append_page
//   commit
//   get_nth_page
//   get_page_complete
//   get_page_has_padding
//   get_page_header_image
//   get_page_side_image
//   get_page_title
//   get_page_type
//   insert_page
//   next_page
//   prepend_page
//   previous_page
//   remove_action_widget
//   remove_page
//   set_forward_page_func
//   set_page_complete
//   set_page_has_padding
//   set_page_header_image
//   set_page_side_image
//   set_page_title
//   set_page_type
//   update_buttons_state
package org.gnome.gtk

import gtk3.GtkAssistant
import gtk3.gtk_assistant_get_current_page
import gtk3.gtk_assistant_get_n_pages
import gtk3.gtk_assistant_set_current_page
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Assistant = CPointer<GtkAssistant>

public val Assistant.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Assistant.asWidget: Widget
  get() = reinterpret()

public val Assistant.asContainer: Container
  get() = reinterpret()

public val Assistant.asBin: Bin
  get() = reinterpret()

public val Assistant.asWindow: Window
  get() = reinterpret()

public var Assistant.currentPage: Int
  get() = gtk_assistant_get_current_page(this)
  set(`value`) {
    gtk_assistant_set_current_page(this, value)
  }

public val Assistant.nPages: Int
  get() = gtk_assistant_get_n_pages(this)
