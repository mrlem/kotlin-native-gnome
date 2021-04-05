package org.gnome.gtk

import gtk3.GtkFrame
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Frame = CPointer<GtkFrame>

public val Frame.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Frame.asWidget: Widget
  get() = reinterpret()

public val Frame.asContainer: Container
  get() = reinterpret()

public val Frame.asBin: Bin
  get() = reinterpret()
