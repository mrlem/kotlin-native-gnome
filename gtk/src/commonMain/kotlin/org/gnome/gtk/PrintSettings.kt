// TODO - implement:
//   copy
//   foreach
//   get
//   get_bool
//   get_double
//   get_double_with_default
//   get_duplex
//   get_int
//   get_int_with_default
//   get_length
//   get_number_up_layout
//   get_orientation
//   get_page_ranges
//   get_page_set
//   get_paper_height
//   get_paper_size
//   get_paper_width
//   get_print_pages
//   get_quality
//   has_key
//   load_file
//   load_key_file
//   set
//   set_bool
//   set_double
//   set_duplex
//   set_int
//   set_length
//   set_number_up_layout
//   set_orientation
//   set_page_ranges
//   set_page_set
//   set_paper_height
//   set_paper_size
//   set_paper_width
//   set_print_pages
//   set_quality
//   set_resolution_xy
//   to_file
//   to_gvariant
//   to_key_file
//   unset
package org.gnome.gtk

import gtk3.GtkPrintSettings
import gtk3.gtk_print_settings_get_collate
import gtk3.gtk_print_settings_get_default_source
import gtk3.gtk_print_settings_get_dither
import gtk3.gtk_print_settings_get_finishings
import gtk3.gtk_print_settings_get_media_type
import gtk3.gtk_print_settings_get_n_copies
import gtk3.gtk_print_settings_get_number_up
import gtk3.gtk_print_settings_get_output_bin
import gtk3.gtk_print_settings_get_printer
import gtk3.gtk_print_settings_get_printer_lpi
import gtk3.gtk_print_settings_get_resolution
import gtk3.gtk_print_settings_get_resolution_x
import gtk3.gtk_print_settings_get_resolution_y
import gtk3.gtk_print_settings_get_reverse
import gtk3.gtk_print_settings_get_scale
import gtk3.gtk_print_settings_get_use_color
import gtk3.gtk_print_settings_set_collate
import gtk3.gtk_print_settings_set_default_source
import gtk3.gtk_print_settings_set_dither
import gtk3.gtk_print_settings_set_finishings
import gtk3.gtk_print_settings_set_media_type
import gtk3.gtk_print_settings_set_n_copies
import gtk3.gtk_print_settings_set_number_up
import gtk3.gtk_print_settings_set_output_bin
import gtk3.gtk_print_settings_set_printer
import gtk3.gtk_print_settings_set_printer_lpi
import gtk3.gtk_print_settings_set_resolution
import gtk3.gtk_print_settings_set_reverse
import gtk3.gtk_print_settings_set_scale
import gtk3.gtk_print_settings_set_use_color
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias PrintSettings = CPointer<GtkPrintSettings>

public val PrintSettings.asObject: Object
  get() = reinterpret()

public var PrintSettings.collate: Boolean
  get() = gtk_print_settings_get_collate(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_collate(this, value.toInt)
  }

public var PrintSettings.defaultSource: String?
  get() = gtk_print_settings_get_default_source(this).toKString
  set(`value`) {
    gtk_print_settings_set_default_source(this, value)
  }

public var PrintSettings.dither: String?
  get() = gtk_print_settings_get_dither(this).toKString
  set(`value`) {
    gtk_print_settings_set_dither(this, value)
  }

public var PrintSettings.finishings: String?
  get() = gtk_print_settings_get_finishings(this).toKString
  set(`value`) {
    gtk_print_settings_set_finishings(this, value)
  }

public var PrintSettings.mediaType: String?
  get() = gtk_print_settings_get_media_type(this).toKString
  set(`value`) {
    gtk_print_settings_set_media_type(this, value)
  }

public var PrintSettings.nCopies: Int
  get() = gtk_print_settings_get_n_copies(this)
  set(`value`) {
    gtk_print_settings_set_n_copies(this, value)
  }

public var PrintSettings.numberUp: Int
  get() = gtk_print_settings_get_number_up(this)
  set(`value`) {
    gtk_print_settings_set_number_up(this, value)
  }

public var PrintSettings.outputBin: String?
  get() = gtk_print_settings_get_output_bin(this).toKString
  set(`value`) {
    gtk_print_settings_set_output_bin(this, value)
  }

public var PrintSettings.printer: String?
  get() = gtk_print_settings_get_printer(this).toKString
  set(`value`) {
    gtk_print_settings_set_printer(this, value)
  }

public var PrintSettings.printerLpi: Double
  get() = gtk_print_settings_get_printer_lpi(this)
  set(`value`) {
    gtk_print_settings_set_printer_lpi(this, value)
  }

public var PrintSettings.resolution: Int
  get() = gtk_print_settings_get_resolution(this)
  set(`value`) {
    gtk_print_settings_set_resolution(this, value)
  }

public var PrintSettings.reverse: Boolean
  get() = gtk_print_settings_get_reverse(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_reverse(this, value.toInt)
  }

public var PrintSettings.scale: Double
  get() = gtk_print_settings_get_scale(this)
  set(`value`) {
    gtk_print_settings_set_scale(this, value)
  }

public var PrintSettings.useColor: Boolean
  get() = gtk_print_settings_get_use_color(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_use_color(this, value.toInt)
  }

public val PrintSettings.resolutionX: Int
  get() = gtk_print_settings_get_resolution_x(this)

public val PrintSettings.resolutionY: Int
  get() = gtk_print_settings_get_resolution_y(this)
