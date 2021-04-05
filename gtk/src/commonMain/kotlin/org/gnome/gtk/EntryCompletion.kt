package org.gnome.gtk

import gtk3.GtkEntryCompletion
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EntryCompletion = CPointer<GtkEntryCompletion>

public val EntryCompletion.asObject: Object
  get() = reinterpret()
