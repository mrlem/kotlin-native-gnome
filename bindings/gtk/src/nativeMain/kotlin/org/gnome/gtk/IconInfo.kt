// TODO - constructor: new_for_pixbuf
// TODO - method: load_icon (return type)
// TODO - method: load_icon_async (param type)
// TODO - method: load_icon_finish (return type)
// TODO - method: load_surface (return type)
// TODO - method: load_symbolic (return type)
// TODO - method: load_symbolic_async (param type)
// TODO - method: load_symbolic_finish (return type)
// TODO - method: load_symbolic_for_context (return type)
// TODO - method: load_symbolic_for_context_async (param type)
// TODO - method: load_symbolic_for_context_finish (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIconInfo
import interop.gtk_icon_info_get_base_scale
import interop.gtk_icon_info_get_base_size
import interop.gtk_icon_info_get_filename
import interop.gtk_icon_info_is_symbolic
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

public val IconInfo.filename: String?
  get() = gtk_icon_info_get_filename(this).toKString()

public fun IconInfo.isSymbolic(): Boolean = gtk_icon_info_is_symbolic(this@isSymbolic).toBoolean()
