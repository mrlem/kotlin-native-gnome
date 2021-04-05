package org.gnome.gtk

import gtk3.GtkTextChildAnchor
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextChildAnchor = CPointer<GtkTextChildAnchor>

public val TextChildAnchor.asObject: Object
  get() = reinterpret()
