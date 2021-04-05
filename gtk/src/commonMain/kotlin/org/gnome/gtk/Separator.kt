package org.gnome.gtk

import gtk3.GtkSeparator
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Separator = CPointer<GtkSeparator>

public val Separator.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Separator.asWidget: Widget
  get() = reinterpret()
