package org.gnome.gtk

import gtk3.GtkSettings
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Settings = CPointer<GtkSettings>

public val Settings.asObject: Object
  get() = reinterpret()
