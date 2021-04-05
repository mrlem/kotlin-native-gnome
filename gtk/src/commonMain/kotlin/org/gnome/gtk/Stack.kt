package org.gnome.gtk

import gtk3.GtkStack
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Stack = CPointer<GtkStack>

public val Stack.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Stack.asWidget: Widget
  get() = reinterpret()

public val Stack.asContainer: Container
  get() = reinterpret()
