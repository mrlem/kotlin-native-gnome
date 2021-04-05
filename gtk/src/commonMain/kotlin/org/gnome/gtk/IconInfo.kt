// TODO - implement:
//   copy
//   free
//   get_attach_points
//   get_base_scale
//   get_base_size
//   get_builtin_pixbuf
//   get_display_name
//   get_embedded_rect
//   get_filename
//   is_symbolic
//   load_icon
//   load_icon_async
//   load_icon_finish
//   load_surface
//   load_symbolic
//   load_symbolic_async
//   load_symbolic_finish
//   load_symbolic_for_context
//   load_symbolic_for_context_async
//   load_symbolic_for_context_finish
//   load_symbolic_for_style
//   set_raw_coordinates
package org.gnome.gtk

import gtk3.GtkIconInfo
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IconInfo = CPointer<GtkIconInfo>

public val IconInfo.asObject: Object
  get() = reinterpret()
