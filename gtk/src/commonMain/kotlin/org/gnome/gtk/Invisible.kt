package org.gnome.gtk

import gtk3.GtkInvisible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Invisible = CPointer<GtkInvisible>

public val Invisible.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Invisible.asWidget: Widget
  get() = reinterpret()
