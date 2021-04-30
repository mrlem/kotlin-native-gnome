@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLevelBarAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias LevelBarAccessible = CPointer<GtkLevelBarAccessible>

public val LevelBarAccessible.asObject: Object
  get() = reinterpret()

public val LevelBarAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val LevelBarAccessible.asAccessible: Accessible
  get() = reinterpret()

public val LevelBarAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val LevelBarAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
