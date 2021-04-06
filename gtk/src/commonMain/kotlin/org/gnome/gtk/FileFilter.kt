// TODO - implement:
//   add_custom
//   add_mime_type
//   add_pattern
//   add_pixbuf_formats
//   filter
//   get_needed
//   to_gvariant
package org.gnome.gtk

import gtk3.GtkFileFilter
import gtk3.gtk_file_filter_get_name
import gtk3.gtk_file_filter_set_name
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toKString

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public var FileFilter.name: String?
  get() = gtk_file_filter_get_name(this).toKString
  set(`value`) {
    gtk_file_filter_set_name(this, value)
  }
