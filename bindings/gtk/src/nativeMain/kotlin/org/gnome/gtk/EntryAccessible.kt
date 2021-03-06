@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEntryAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val EntryAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
