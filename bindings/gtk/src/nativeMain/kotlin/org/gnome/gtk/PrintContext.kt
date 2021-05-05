// TODO - method: get_cairo_context (return type)
// TODO - method: get_hard_margins (param type)
// TODO - method: set_cairo_context (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPrintContext
import interop.gtk_print_context_create_pango_context
import interop.gtk_print_context_create_pango_layout
import interop.gtk_print_context_get_dpi_x
import interop.gtk_print_context_get_dpi_y
import interop.gtk_print_context_get_height
import interop.gtk_print_context_get_page_setup
import interop.gtk_print_context_get_pango_fontmap
import interop.gtk_print_context_get_width
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.pango.Context
import org.gnome.pango.FontMap
import org.gnome.pango.Layout

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

public val PrintContext.pangoFontmap: FontMap?
  get() = gtk_print_context_get_pango_fontmap(this)?.reinterpret()

public val PrintContext.width: Double
  get() = gtk_print_context_get_width(this)

public fun PrintContext.createPangoContext(): Context? =
    gtk_print_context_create_pango_context(this@createPangoContext)?.reinterpret()

public fun PrintContext.createPangoLayout(): Layout? =
    gtk_print_context_create_pango_layout(this@createPangoLayout)?.reinterpret()
