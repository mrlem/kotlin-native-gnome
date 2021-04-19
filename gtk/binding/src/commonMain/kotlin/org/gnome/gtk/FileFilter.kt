// TODO - add_custom
// TODO - to_gvariant
//
package org.gnome.gtk

import gtk3.GtkFileFilter
import gtk3.gtk_file_filter_add_mime_type
import gtk3.gtk_file_filter_add_pattern
import gtk3.gtk_file_filter_add_pixbuf_formats
import gtk3.gtk_file_filter_filter
import gtk3.gtk_file_filter_get_name
import gtk3.gtk_file_filter_get_needed
import gtk3.gtk_file_filter_set_name
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asObject: Object
  get() = reinterpret()

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun FileFilter.addMimeType(mimeType: String?): Unit {
  gtk_file_filter_add_mime_type(this, mimeType)
}

public fun FileFilter.addPattern(pattern: String?): Unit {
  gtk_file_filter_add_pattern(this, pattern)
}

public fun FileFilter.addPixbufFormats(): Unit {
  gtk_file_filter_add_pixbuf_formats(this)
}

public fun FileFilter.filter(filterInfo: FileFilterInfo): Boolean = gtk_file_filter_filter(this,
    filterInfo.reinterpret()).toBoolean

public fun FileFilter.getName(): String = gtk_file_filter_get_name(this).toKString

public fun FileFilter.getNeeded(): FileFilterFlags = gtk_file_filter_get_needed(this)

public fun FileFilter.setName(name: String?): Unit {
  gtk_file_filter_set_name(this, name)
}
