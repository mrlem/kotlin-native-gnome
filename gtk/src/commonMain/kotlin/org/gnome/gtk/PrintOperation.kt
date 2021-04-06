// TODO - implement:
//   cancel
//   draw_page_finish
//   get_default_page_setup
//   get_error
//   get_print_settings
//   get_status
//   is_finished
//   run
//   set_default_page_setup
//   set_defer_drawing
//   set_export_filename
//   set_print_settings
//   set_unit
//   set_allow_async
//   set_current_page
//   set_custom_tab_label
//   set_job_name
//   set_n_pages
//   set_show_progress
//   set_track_print_status
//   set_use_full_page
package org.gnome.gtk

import gtk3.GtkPrintOperation
import gtk3.gtk_print_operation_get_embed_page_setup
import gtk3.gtk_print_operation_get_has_selection
import gtk3.gtk_print_operation_get_n_pages_to_print
import gtk3.gtk_print_operation_get_status_string
import gtk3.gtk_print_operation_get_support_selection
import gtk3.gtk_print_operation_set_embed_page_setup
import gtk3.gtk_print_operation_set_has_selection
import gtk3.gtk_print_operation_set_support_selection
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias PrintOperation = CPointer<GtkPrintOperation>

public val PrintOperation.asObject: Object
  get() = reinterpret()

public var PrintOperation.embedPageSetup: Boolean
  get() = gtk_print_operation_get_embed_page_setup(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_embed_page_setup(this, value.toInt)
  }

public var PrintOperation.hasSelection: Boolean
  get() = gtk_print_operation_get_has_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_has_selection(this, value.toInt)
  }

public var PrintOperation.supportSelection: Boolean
  get() = gtk_print_operation_get_support_selection(this).toBoolean
  set(`value`) {
    gtk_print_operation_set_support_selection(this, value.toInt)
  }

public val PrintOperation.nPagesToPrint: Int
  get() = gtk_print_operation_get_n_pages_to_print(this)

public val PrintOperation.statusString: String?
  get() = gtk_print_operation_get_status_string(this).toKString
