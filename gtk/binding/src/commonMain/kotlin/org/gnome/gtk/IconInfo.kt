// TODO - constructor: new_for_pixbuf
// TODO - method: copy
// TODO - method: free
// TODO - method: get_attach_points
// TODO - method: get_builtin_pixbuf
// TODO - method: get_display_name
// TODO - method: get_embedded_rect
// TODO - method: load_icon
// TODO - method: load_icon_async
// TODO - method: load_icon_finish
// TODO - method: load_surface
// TODO - method: load_symbolic
// TODO - method: load_symbolic_async
// TODO - method: load_symbolic_finish
// TODO - method: load_symbolic_for_context
// TODO - method: load_symbolic_for_context_async
// TODO - method: load_symbolic_for_context_finish
// TODO - method: load_symbolic_for_style
// TODO - method: set_raw_coordinates
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

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

public object IconInfoFactory

public val IconInfo.baseScale: Int
  get() = gtk_icon_info_get_base_scale(this)

public val IconInfo.baseSize: Int
  get() = gtk_icon_info_get_base_size(this)

public val IconInfo.filename: String
  get() = gtk_icon_info_get_filename(this).toKString

public fun IconInfo.isSymbolic(): Boolean = gtk_icon_info_is_symbolic(this).toBoolean
