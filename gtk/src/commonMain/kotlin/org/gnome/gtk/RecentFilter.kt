// TODO - implement:
//   add_age
//   add_application
//   add_custom
//   add_group
//   add_mime_type
//   add_pattern
//   add_pixbuf_formats
//   filter
//   get_name
//   get_needed
//   set_name
package org.gnome.gtk

import gtk3.GtkRecentFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RecentFilter = CPointer<GtkRecentFilter>

public val RecentFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
