// TODO - create_pango_context
// TODO - create_pango_layout
// TODO - get_cairo_context
// TODO - get_hard_margins
// TODO - get_pango_fontmap
// TODO - set_cairo_context
//
package org.gnome.gtk

import gtk3.GtkPrintContext
import gtk3.gtk_print_context_get_dpi_x
import gtk3.gtk_print_context_get_dpi_y
import gtk3.gtk_print_context_get_height
import gtk3.gtk_print_context_get_page_setup
import gtk3.gtk_print_context_get_width
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PrintContext = CPointer<GtkPrintContext>

public val PrintContext.asObject: Object
  get() = reinterpret()

public fun PrintContext.getDpiX(): Double = gtk_print_context_get_dpi_x(this)

public fun PrintContext.getDpiY(): Double = gtk_print_context_get_dpi_y(this)

public fun PrintContext.getHeight(): Double = gtk_print_context_get_height(this)

public fun PrintContext.getPageSetup(): PageSetup? =
    gtk_print_context_get_page_setup(this)?.reinterpret()

public fun PrintContext.getWidth(): Double = gtk_print_context_get_width(this)
