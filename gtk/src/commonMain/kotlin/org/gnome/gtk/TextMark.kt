package org.gnome.gtk

import gtk3.GtkTextMark
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextMark = CPointer<GtkTextMark>

public val TextMark.asObject: Object
  get() = reinterpret()
