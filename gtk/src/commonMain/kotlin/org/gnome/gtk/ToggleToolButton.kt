// TODO - implement:
//   get_active
//   set_active
package org.gnome.gtk

import gtk3.GtkToggleToolButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ToggleToolButton = CPointer<GtkToggleToolButton>

public val ToggleToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToggleToolButton.asWidget: Widget
  get() = reinterpret()

public val ToggleToolButton.asContainer: Container
  get() = reinterpret()

public val ToggleToolButton.asBin: Bin
  get() = reinterpret()

public val ToggleToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val ToggleToolButton.asToolButton: ToolButton
  get() = reinterpret()
