// TODO - implement:
//   add_custom
//   add_mime_type
//   add_pattern
//   filter
package org.gnome.gtk

import gtk3.GtkFileFilter
import gtk3.gtk_file_filter_add_pixbuf_formats
import gtk3.gtk_file_filter_get_name
import gtk3.gtk_file_filter_get_needed
import gtk3.gtk_file_filter_set_name
import gtk3.gtk_file_filter_to_gvariant
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asObject: Object
  get() = reinterpret()

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun FileFilter.addPixbufFormats(): Unit {
  gtk_file_filter_add_pixbuf_formats(this)
}

public fun FileFilter.getNeeded(): Unit {
  gtk_file_filter_get_needed(this)
}

public fun FileFilter.toGvariant(): Unit {
  gtk_file_filter_to_gvariant(this)
}

public var FileFilter.name: String?
  get() = gtk_file_filter_get_name(this).toKString
  set(`value`) {
    gtk_file_filter_set_name(this, value)
  }
