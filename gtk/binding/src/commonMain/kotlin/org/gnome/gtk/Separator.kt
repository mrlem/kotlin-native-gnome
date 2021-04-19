package org.gnome.gtk

import gtk3.GtkSeparator
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Separator = CPointer<GtkSeparator>

public val Separator.asObject: Object
  get() = reinterpret()

public val Separator.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Separator.asWidget: Widget
  get() = reinterpret()
