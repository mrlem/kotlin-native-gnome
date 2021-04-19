// TODO - add_custom
//
package org.gnome.gtk

import gtk3.GtkRecentFilter
import gtk3.gtk_recent_filter_add_age
import gtk3.gtk_recent_filter_add_application
import gtk3.gtk_recent_filter_add_group
import gtk3.gtk_recent_filter_add_mime_type
import gtk3.gtk_recent_filter_add_pattern
import gtk3.gtk_recent_filter_add_pixbuf_formats
import gtk3.gtk_recent_filter_filter
import gtk3.gtk_recent_filter_get_name
import gtk3.gtk_recent_filter_get_needed
import gtk3.gtk_recent_filter_set_name
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias RecentFilter = CPointer<GtkRecentFilter>

public val RecentFilter.asObject: Object
  get() = reinterpret()

public val RecentFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public var RecentFilter.name: String
  get() = gtk_recent_filter_get_name(this).toKString
  set(`value`) {
    gtk_recent_filter_set_name(this, value)
  }

public val RecentFilter.needed: RecentFilterFlags
  get() = gtk_recent_filter_get_needed(this)

public fun RecentFilter.addAge(days: Int): Unit {
  gtk_recent_filter_add_age(this, days)
}

public fun RecentFilter.addApplication(application: String?): Unit {
  gtk_recent_filter_add_application(this, application)
}

public fun RecentFilter.addGroup(group: String?): Unit {
  gtk_recent_filter_add_group(this, group)
}

public fun RecentFilter.addMimeType(mimeType: String?): Unit {
  gtk_recent_filter_add_mime_type(this, mimeType)
}

public fun RecentFilter.addPattern(pattern: String?): Unit {
  gtk_recent_filter_add_pattern(this, pattern)
}

public fun RecentFilter.addPixbufFormats(): Unit {
  gtk_recent_filter_add_pixbuf_formats(this)
}

public fun RecentFilter.filter(filterInfo: RecentFilterInfo): Boolean =
    gtk_recent_filter_filter(this, filterInfo.reinterpret()).toBoolean
