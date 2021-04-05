// TODO - implement:
//   add_custom
//   add_mime_type
//   add_pattern
//   add_pixbuf_formats
//   filter
//   get_name
//   get_needed
//   set_name
//   to_gvariant
package org.gnome.gtk

import gtk3.GtkFileFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
