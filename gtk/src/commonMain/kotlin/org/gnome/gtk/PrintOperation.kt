// TODO - implement:
//   cancel
//   draw_page_finish
//   get_default_page_setup
//   get_embed_page_setup
//   get_error
//   get_has_selection
//   get_n_pages_to_print
//   get_print_settings
//   get_status
//   get_status_string
//   get_support_selection
//   is_finished
//   run
//   set_allow_async
//   set_current_page
//   set_custom_tab_label
//   set_default_page_setup
//   set_defer_drawing
//   set_embed_page_setup
//   set_export_filename
//   set_has_selection
//   set_job_name
//   set_n_pages
//   set_print_settings
//   set_show_progress
//   set_support_selection
//   set_track_print_status
//   set_unit
//   set_use_full_page
package org.gnome.gtk

import gtk3.GtkPrintOperation
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PrintOperation = CPointer<GtkPrintOperation>

public val PrintOperation.asObject: Object
  get() = reinterpret()
