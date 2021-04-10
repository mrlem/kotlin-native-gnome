// TODO - implement:
//   add_age
//   add_application
//   add_custom
//   add_group
//   add_mime_type
//   add_pattern
//   filter
package org.gnome.gtk

import gtk3.GtkRecentFilter
import gtk3.gtk_recent_filter_add_pixbuf_formats
import gtk3.gtk_recent_filter_get_name
import gtk3.gtk_recent_filter_get_needed
import gtk3.gtk_recent_filter_set_name
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toKString

public typealias RecentFilter = CPointer<GtkRecentFilter>

public val RecentFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun RecentFilter.addPixbufFormats(): Unit {
  gtk_recent_filter_add_pixbuf_formats(this)
}

public fun RecentFilter.getNeeded(): Unit {
  gtk_recent_filter_get_needed(this)
}

public var RecentFilter.name: String?
  get() = gtk_recent_filter_get_name(this).toKString
  set(`value`) {
    gtk_recent_filter_set_name(this, value)
  }
