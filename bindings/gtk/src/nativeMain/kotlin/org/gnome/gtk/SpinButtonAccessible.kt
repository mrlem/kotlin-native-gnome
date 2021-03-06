@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSpinButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SpinButtonAccessible = CPointer<GtkSpinButtonAccessible>

public val SpinButtonAccessible.asObject: Object
  get() = reinterpret()

public val SpinButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val SpinButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val SpinButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val SpinButtonAccessible.asEntryAccessible: EntryAccessible
  get() = reinterpret()

public val SpinButtonAccessible.parent: EntryAccessible
  get() = pointed.parent.ptr
