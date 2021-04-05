package org.gnome.gtk

import gtk3.GtkRadioToolButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RadioToolButton = CPointer<GtkRadioToolButton>

public val RadioToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioToolButton.asWidget: Widget
  get() = reinterpret()

public val RadioToolButton.asContainer: Container
  get() = reinterpret()

public val RadioToolButton.asBin: Bin
  get() = reinterpret()

public val RadioToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val RadioToolButton.asToolButton: ToolButton
  get() = reinterpret()

public val RadioToolButton.asToggleToolButton: ToggleToolButton
  get() = reinterpret()
