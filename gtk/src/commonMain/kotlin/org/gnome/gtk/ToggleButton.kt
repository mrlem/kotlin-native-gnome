package org.gnome.gtk

import gtk3.GtkToggleButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ToggleButton = CPointer<GtkToggleButton>

public val ToggleButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToggleButton.asWidget: Widget
  get() = reinterpret()

public val ToggleButton.asContainer: Container
  get() = reinterpret()

public val ToggleButton.asBin: Bin
  get() = reinterpret()

public val ToggleButton.asButton: Button
  get() = reinterpret()
