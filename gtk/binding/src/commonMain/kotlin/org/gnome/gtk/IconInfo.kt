// TODO - copy
// TODO - free
// TODO - get_attach_points
// TODO - get_builtin_pixbuf
// TODO - get_display_name
// TODO - get_embedded_rect
// TODO - load_icon
// TODO - load_icon_async
// TODO - load_icon_finish
// TODO - load_surface
// TODO - load_symbolic
// TODO - load_symbolic_async
// TODO - load_symbolic_finish
// TODO - load_symbolic_for_context
// TODO - load_symbolic_for_context_async
// TODO - load_symbolic_for_context_finish
// TODO - load_symbolic_for_style
// TODO - set_raw_coordinates
//
package org.gnome.gtk

import gtk3.GtkIconInfo
import gtk3.gtk_icon_info_get_base_scale
import gtk3.gtk_icon_info_get_base_size
import gtk3.gtk_icon_info_get_filename
import gtk3.gtk_icon_info_is_symbolic
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias IconInfo = CPointer<GtkIconInfo>

public val IconInfo.asObject: Object
  get() = reinterpret()

public val IconInfo.baseScale: Int
  get() = gtk_icon_info_get_base_scale(this)

public val IconInfo.baseSize: Int
  get() = gtk_icon_info_get_base_size(this)

public val IconInfo.filename: String
  get() = gtk_icon_info_get_filename(this).toKString

public fun IconInfo.isSymbolic(): Boolean = gtk_icon_info_is_symbolic(this).toBoolean
