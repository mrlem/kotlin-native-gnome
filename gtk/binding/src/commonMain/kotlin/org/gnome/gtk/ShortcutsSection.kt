package org.gnome.gtk

import gtk3.GtkShortcutsSection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ShortcutsSection = CPointer<GtkShortcutsSection>

public val ShortcutsSection.asObject: Object
  get() = reinterpret()

public val ShortcutsSection.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsSection.asWidget: Widget
  get() = reinterpret()

public val ShortcutsSection.asContainer: Container
  get() = reinterpret()

public val ShortcutsSection.asBox: Box
  get() = reinterpret()
