package org.gnome.gtk

import gtk3.GtkMenuButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MenuButton = CPointer<GtkMenuButton>

public val MenuButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuButton.asWidget: Widget
  get() = reinterpret()

public val MenuButton.asContainer: Container
  get() = reinterpret()

public val MenuButton.asBin: Bin
  get() = reinterpret()

public val MenuButton.asButton: Button
  get() = reinterpret()

public val MenuButton.asToggleButton: ToggleButton
  get() = reinterpret()
