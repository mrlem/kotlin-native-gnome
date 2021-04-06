// TODO - implement:
//   create_pango_context
//   create_pango_layout
//   get_cairo_context
//   get_hard_margins
//   get_page_setup
//   get_pango_fontmap
//   set_cairo_context
package org.gnome.gtk

import gtk3.GtkPrintContext
import gtk3.gtk_print_context_get_dpi_x
import gtk3.gtk_print_context_get_dpi_y
import gtk3.gtk_print_context_get_height
import gtk3.gtk_print_context_get_width
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PrintContext = CPointer<GtkPrintContext>

public val PrintContext.asObject: Object
  get() = reinterpret()

public val PrintContext.dpiX: Double
  get() = gtk_print_context_get_dpi_x(this)

public val PrintContext.dpiY: Double
  get() = gtk_print_context_get_dpi_y(this)

public val PrintContext.height: Double
  get() = gtk_print_context_get_height(this)

public val PrintContext.width: Double
  get() = gtk_print_context_get_width(this)
