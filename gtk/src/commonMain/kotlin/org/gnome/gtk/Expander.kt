package org.gnome.gtk

import gtk3.GtkExpander
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Expander = CPointer<GtkExpander>

public val Expander.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Expander.asWidget: Widget
  get() = reinterpret()

public val Expander.asContainer: Container
  get() = reinterpret()

public val Expander.asBin: Bin
  get() = reinterpret()
