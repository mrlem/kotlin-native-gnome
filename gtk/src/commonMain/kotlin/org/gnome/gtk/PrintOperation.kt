package org.gnome.gtk

import gtk3.GtkPrintOperation
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PrintOperation = CPointer<GtkPrintOperation>

public val PrintOperation.asObject: Object
  get() = reinterpret()
