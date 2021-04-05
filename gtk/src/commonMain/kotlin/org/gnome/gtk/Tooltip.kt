package org.gnome.gtk

import gtk3.GtkTooltip
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Tooltip = CPointer<GtkTooltip>

public val Tooltip.asObject: Object
  get() = reinterpret()
