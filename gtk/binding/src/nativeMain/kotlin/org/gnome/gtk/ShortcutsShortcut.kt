@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkShortcutsShortcut
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ShortcutsShortcut = CPointer<GtkShortcutsShortcut>

public val ShortcutsShortcut.asObject: Object
  get() = reinterpret()

public val ShortcutsShortcut.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsShortcut.asWidget: Widget
  get() = reinterpret()

public val ShortcutsShortcut.asContainer: Container
  get() = reinterpret()

public val ShortcutsShortcut.asBox: Box
  get() = reinterpret()
