package org.gnome.gtk

import gtk3.GtkRecentManager
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()
