package org.gnome.gtk

import gtk3.GtkIMContext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IMContext = CPointer<GtkIMContext>

public val IMContext.asObject: Object
  get() = reinterpret()
