// TODO - method: add_custom (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRecentFilter
import interop.gtk_recent_filter_add_age
import interop.gtk_recent_filter_add_application
import interop.gtk_recent_filter_add_group
import interop.gtk_recent_filter_add_mime_type
import interop.gtk_recent_filter_add_pattern
import interop.gtk_recent_filter_add_pixbuf_formats
import interop.gtk_recent_filter_filter
import interop.gtk_recent_filter_get_name
import interop.gtk_recent_filter_get_needed
import interop.gtk_recent_filter_new
import interop.gtk_recent_filter_set_name
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toKString

public typealias RecentFilter = CPointer<GtkRecentFilter>

public val RecentFilter.asObject: Object
  get() = reinterpret()

public val RecentFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public object RecentFilterFactory {
  public fun new(): RecentFilter = gtk_recent_filter_new()!!.reinterpret()
}

public var RecentFilter.name: String?
  get() = gtk_recent_filter_get_name(this).toKString()
  set(`value`) {
    gtk_recent_filter_set_name(this@name, `value`)
  }

public val RecentFilter.needed: RecentFilterFlags
  get() = gtk_recent_filter_get_needed(this)

public fun RecentFilter.addAge(days: Int): Unit {
  gtk_recent_filter_add_age(this@addAge, days)
}

public fun RecentFilter.addApplication(application: String?): Unit {
  gtk_recent_filter_add_application(this@addApplication, application)
}

public fun RecentFilter.addGroup(group: String?): Unit {
  gtk_recent_filter_add_group(this@addGroup, group)
}

public fun RecentFilter.addMimeType(mimeType: String?): Unit {
  gtk_recent_filter_add_mime_type(this@addMimeType, mimeType)
}

public fun RecentFilter.addPattern(pattern: String?): Unit {
  gtk_recent_filter_add_pattern(this@addPattern, pattern)
}

public fun RecentFilter.addPixbufFormats(): Unit {
  gtk_recent_filter_add_pixbuf_formats(this@addPixbufFormats)
}

public fun RecentFilter.filter(filterInfo: RecentFilterInfo?): Boolean =
    gtk_recent_filter_filter(this@filter, filterInfo?.reinterpret()).toBoolean()
