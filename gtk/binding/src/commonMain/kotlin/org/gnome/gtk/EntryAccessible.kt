@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEntryAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EntryAccessible = CPointer<GtkEntryAccessible>

public val EntryAccessible.asObject: Object
  get() = reinterpret()

public val EntryAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val EntryAccessible.asAccessible: Accessible
  get() = reinterpret()

public val EntryAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()
