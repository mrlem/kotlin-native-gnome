@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkShortcutsSection
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect

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

public fun ShortcutsSection.onChangeCurrentPage(callback: (ShortcutsSection) -> Unit):
    ShortcutsSection {
  // TODO - handle callback data

  asObject.connect("change-current-page") { callback(this) }
  return this
}
