package org.gnome.gtk

import gtk3.GtkCheckButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CheckButton = CPointer<GtkCheckButton>

public val CheckButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CheckButton.asWidget: Widget
  get() = reinterpret()

public val CheckButton.asContainer: Container
  get() = reinterpret()

public val CheckButton.asBin: Bin
  get() = reinterpret()

public val CheckButton.asButton: Button
  get() = reinterpret()

public val CheckButton.asToggleButton: ToggleButton
  get() = reinterpret()