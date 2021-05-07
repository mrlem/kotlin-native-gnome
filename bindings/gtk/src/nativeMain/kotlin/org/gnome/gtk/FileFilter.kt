// TODO - method: add_custom (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFileFilter
import interop.gtk_file_filter_add_mime_type
import interop.gtk_file_filter_add_pattern
import interop.gtk_file_filter_add_pixbuf_formats
import interop.gtk_file_filter_filter
import interop.gtk_file_filter_get_name
import interop.gtk_file_filter_get_needed
import interop.gtk_file_filter_new
import interop.gtk_file_filter_new_from_gvariant
import interop.gtk_file_filter_set_name
import interop.gtk_file_filter_to_gvariant
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asObject: Object
  get() = reinterpret()

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public object FileFilterFactory {
  public fun new(): FileFilter = gtk_file_filter_new()!!.reinterpret()

  public fun newFromGvariant(variant: Variant?): FileFilter =
      gtk_file_filter_new_from_gvariant(variant?.reinterpret())!!.reinterpret()
}

public var FileFilter.name: String?
  get() = gtk_file_filter_get_name(this).toKString()
  set(`value`) {
    gtk_file_filter_set_name(this@name, `value`)
  }

public val FileFilter.needed: FileFilterFlags
  get() = gtk_file_filter_get_needed(this)

public fun FileFilter.addMimeType(mimeType: String?): Unit {
  gtk_file_filter_add_mime_type(this@addMimeType, mimeType)
}

public fun FileFilter.addPattern(pattern: String?): Unit {
  gtk_file_filter_add_pattern(this@addPattern, pattern)
}

public fun FileFilter.addPixbufFormats(): Unit {
  gtk_file_filter_add_pixbuf_formats(this@addPixbufFormats)
}

public fun FileFilter.filter(filterInfo: FileFilterInfo?): Boolean =
    gtk_file_filter_filter(this@filter, filterInfo?.reinterpret()).toBoolean()

public fun FileFilter.toGvariant(): Variant? =
    gtk_file_filter_to_gvariant(this@toGvariant)?.reinterpret()
