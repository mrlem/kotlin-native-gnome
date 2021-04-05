package org.gnome.gtk

import gtk3.GtkClipboard
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()
