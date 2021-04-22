@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkLevelBarAccessible
import kotlinx.cinterop.CPointer
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
