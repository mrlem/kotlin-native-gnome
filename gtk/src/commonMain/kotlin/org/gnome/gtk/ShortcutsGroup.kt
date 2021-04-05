package org.gnome.gtk

import gtk3.GtkShortcutsGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ShortcutsGroup = CPointer<GtkShortcutsGroup>

public val ShortcutsGroup.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsGroup.asWidget: Widget
  get() = reinterpret()

public val ShortcutsGroup.asContainer: Container
  get() = reinterpret()

public val ShortcutsGroup.asBox: Box
  get() = reinterpret()
