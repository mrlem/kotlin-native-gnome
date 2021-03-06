@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkProgressBarAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ProgressBarAccessible = CPointer<GtkProgressBarAccessible>

public val ProgressBarAccessible.asObject: Object
  get() = reinterpret()

public val ProgressBarAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ProgressBarAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ProgressBarAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ProgressBarAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
