package org.gnome.gtk

import gtk3.GtkTextTagTable
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextTagTable = CPointer<GtkTextTagTable>

public val TextTagTable.asObject: Object
  get() = reinterpret()
