// TODO - method: create_pango_context (return type)
// TODO - method: create_pango_layout (return type)
// TODO - method: get_cairo_context (return type)
// TODO - method: get_hard_margins (param type)
// TODO - method: get_pango_fontmap (return type)
// TODO - method: set_cairo_context (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPrintContext
import interop.gtk_print_context_get_dpi_x
import interop.gtk_print_context_get_dpi_y
import interop.gtk_print_context_get_height
import interop.gtk_print_context_get_page_setup
import interop.gtk_print_context_get_width
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
