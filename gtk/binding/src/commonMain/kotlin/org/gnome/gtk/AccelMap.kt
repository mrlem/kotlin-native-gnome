package org.gnome.gtk

import gtk3.GtkAccelMap
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias AccelMap = CPointer<GtkAccelMap>

public val AccelMap.asObject: Object
  get() = reinterpret()
