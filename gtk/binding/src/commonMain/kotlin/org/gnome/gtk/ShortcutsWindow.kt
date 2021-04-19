package org.gnome.gtk

import gtk3.GtkShortcutsWindow
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ShortcutsWindow = CPointer<GtkShortcutsWindow>

public val ShortcutsWindow.asObject: Object
  get() = reinterpret()

public val ShortcutsWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsWindow.asWidget: Widget
  get() = reinterpret()

public val ShortcutsWindow.asContainer: Container
  get() = reinterpret()

public val ShortcutsWindow.asBin: Bin
  get() = reinterpret()

public val ShortcutsWindow.asWindow: Window
  get() = reinterpret()
