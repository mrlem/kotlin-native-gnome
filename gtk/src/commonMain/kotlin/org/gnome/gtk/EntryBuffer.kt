package org.gnome.gtk

import gtk3.GtkEntryBuffer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EntryBuffer = CPointer<GtkEntryBuffer>

public val EntryBuffer.asObject: Object
  get() = reinterpret()
