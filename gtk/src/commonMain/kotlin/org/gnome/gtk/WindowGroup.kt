package org.gnome.gtk

import gtk3.GtkWindowGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias WindowGroup = CPointer<GtkWindowGroup>

public val WindowGroup.asObject: Object
  get() = reinterpret()
