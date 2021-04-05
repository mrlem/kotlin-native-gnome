package org.gnome.gtk

import gtk3.GtkShortcutsShortcut
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ShortcutsShortcut = CPointer<GtkShortcutsShortcut>

public val ShortcutsShortcut.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsShortcut.asWidget: Widget
  get() = reinterpret()

public val ShortcutsShortcut.asContainer: Container
  get() = reinterpret()

public val ShortcutsShortcut.asBox: Box
  get() = reinterpret()
