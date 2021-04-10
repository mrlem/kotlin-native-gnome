// TODO - implement:
//   get_hard_margins
//   set_cairo_context
package org.gnome.gtk

import gtk3.GtkPrintContext
import gtk3.gtk_print_context_create_pango_context
import gtk3.gtk_print_context_create_pango_layout
import gtk3.gtk_print_context_get_cairo_context
import gtk3.gtk_print_context_get_dpi_x
import gtk3.gtk_print_context_get_dpi_y
import gtk3.gtk_print_context_get_height
import gtk3.gtk_print_context_get_page_setup
import gtk3.gtk_print_context_get_pango_fontmap
import gtk3.gtk_print_context_get_width
import kotlin.Double
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PrintContext = CPointer<GtkPrintContext>

public val PrintContext.asObject: Object
  get() = reinterpret()

public fun PrintContext.createPangoContext(): Unit {
  gtk_print_context_create_pango_context(this)
}

public fun PrintContext.createPangoLayout(): Unit {
  gtk_print_context_create_pango_layout(this)
}

public fun PrintContext.getCairoContext(): Unit {
  gtk_print_context_get_cairo_context(this)
}

public fun PrintContext.getPageSetup(): Unit {
  gtk_print_context_get_page_setup(this)
}

public fun PrintContext.getPangoFontmap(): Unit {
  gtk_print_context_get_pango_fontmap(this)
}

public val PrintContext.dpiX: Double
  get() = gtk_print_context_get_dpi_x(this)

public val PrintContext.dpiY: Double
  get() = gtk_print_context_get_dpi_y(this)

public val PrintContext.height: Double
  get() = gtk_print_context_get_height(this)

public val PrintContext.width: Double
  get() = gtk_print_context_get_width(this)
