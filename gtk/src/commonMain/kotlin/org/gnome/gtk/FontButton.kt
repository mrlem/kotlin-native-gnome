package org.gnome.gtk

import gtk3.GtkFontButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FontButton = CPointer<GtkFontButton>

public val FontButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontButton.asWidget: Widget
  get() = reinterpret()

public val FontButton.asContainer: Container
  get() = reinterpret()

public val FontButton.asBin: Bin
  get() = reinterpret()

public val FontButton.asButton: Button
  get() = reinterpret()
