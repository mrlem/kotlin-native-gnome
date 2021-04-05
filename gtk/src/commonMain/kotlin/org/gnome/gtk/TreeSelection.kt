package org.gnome.gtk

import gtk3.GtkTreeSelection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeSelection = CPointer<GtkTreeSelection>

public val TreeSelection.asObject: Object
  get() = reinterpret()
