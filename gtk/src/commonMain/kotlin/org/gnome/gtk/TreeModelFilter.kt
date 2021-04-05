package org.gnome.gtk

import gtk3.GtkTreeModelFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelFilter = CPointer<GtkTreeModelFilter>

public val TreeModelFilter.asObject: Object
  get() = reinterpret()
