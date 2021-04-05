package org.gnome.gtk

import gtk3.GtkLabel
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Label = CPointer<GtkLabel>

public val Label.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Label.asWidget: Widget
  get() = reinterpret()

public val Label.asMisc: Misc
  get() = reinterpret()
