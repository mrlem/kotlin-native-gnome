// TODO - method: create_pango_context
// TODO - method: create_pango_layout
// TODO - method: get_cairo_context
// TODO - method: get_hard_margins
// TODO - method: get_pango_fontmap
// TODO - method: set_cairo_context
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

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

public val PrintContext.dpiX: Double
  get() = gtk_print_context_get_dpi_x(this)

public val PrintContext.dpiY: Double
  get() = gtk_print_context_get_dpi_y(this)

public val PrintContext.height: Double
  get() = gtk_print_context_get_height(this)

public val PrintContext.pageSetup: PageSetup?
  get() = gtk_print_context_get_page_setup(this)?.reinterpret()

public val PrintContext.width: Double
  get() = gtk_print_context_get_width(this)
