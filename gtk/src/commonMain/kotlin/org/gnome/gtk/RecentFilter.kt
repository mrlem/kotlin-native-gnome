package org.gnome.gtk

import gtk3.GtkRecentFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RecentFilter = CPointer<GtkRecentFilter>

public val RecentFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
