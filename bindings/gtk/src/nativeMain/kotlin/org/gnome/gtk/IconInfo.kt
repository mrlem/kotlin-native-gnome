// TODO - method: load_icon_async (param type)
// TODO - method: load_surface (return type)
// TODO - method: load_symbolic (param type)
// TODO - method: load_symbolic_async (param type)
// TODO - method: load_symbolic_finish (param type)
// TODO - method: load_symbolic_for_context (param type)
// TODO - method: load_symbolic_for_context_async (param type)
// TODO - method: load_symbolic_for_context_finish (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkIconInfo
import interop.gtk_icon_info_get_base_scale
import interop.gtk_icon_info_get_base_size
import interop.gtk_icon_info_get_filename
import interop.gtk_icon_info_is_symbolic
import interop.gtk_icon_info_load_icon
import interop.gtk_icon_info_load_icon_finish
import interop.gtk_icon_info_new_for_pixbuf
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdkpixbuf.Pixbuf
import org.gnome.gio.AsyncResult
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.glib.Error

public typealias IconInfo = CPointer<GtkIconInfo>

public val IconInfo.asObject: Object
  get() = reinterpret()

public object IconInfoFactory {
  public fun newForPixbuf(iconTheme: IconTheme?, pixbuf: Pixbuf?): IconInfo =
      gtk_icon_info_new_for_pixbuf(iconTheme?.reinterpret(), pixbuf?.reinterpret())!!.reinterpret()
}

public val IconInfo.baseScale: Int
  get() = gtk_icon_info_get_base_scale(this)

public val IconInfo.baseSize: Int
  get() = gtk_icon_info_get_base_size(this)

public val IconInfo.filename: String?
  get() = gtk_icon_info_get_filename(this).toKString()

public fun IconInfo.isSymbolic(): Boolean = gtk_icon_info_is_symbolic(this@isSymbolic).toBoolean()

@Throws(Error::class)
public fun IconInfo.loadIcon(): Pixbuf? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Pixbuf? = gtk_icon_info_load_icon(this@loadIcon, errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun IconInfo.loadIconFinish(res: AsyncResult?): Pixbuf? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Pixbuf? = gtk_icon_info_load_icon_finish(this@loadIconFinish, res?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
