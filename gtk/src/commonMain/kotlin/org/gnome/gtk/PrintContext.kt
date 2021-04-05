// TODO - implement:
//   create_pango_context
//   create_pango_layout
//   get_cairo_context
//   get_dpi_x
//   get_dpi_y
//   get_hard_margins
//   get_height
//   get_page_setup
//   get_pango_fontmap
//   get_width
//   set_cairo_context
package org.gnome.gtk

import gtk3.GtkPrintContext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PrintContext = CPointer<GtkPrintContext>

public val PrintContext.asObject: Object
  get() = reinterpret()
