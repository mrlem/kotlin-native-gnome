package org.gnome.gtk

import gtk3.GtkPageSetup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()
