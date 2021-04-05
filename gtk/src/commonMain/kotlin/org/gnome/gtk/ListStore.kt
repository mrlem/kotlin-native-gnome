package org.gnome.gtk

import gtk3.GtkListStore
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias ListStore = CPointer<GtkListStore>

public val ListStore.asObject: Object
  get() = reinterpret()
