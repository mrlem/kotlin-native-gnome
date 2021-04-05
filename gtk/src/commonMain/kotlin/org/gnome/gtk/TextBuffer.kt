package org.gnome.gtk

import gtk3.GtkTextBuffer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextBuffer = CPointer<GtkTextBuffer>

public val TextBuffer.asObject: Object
  get() = reinterpret()
