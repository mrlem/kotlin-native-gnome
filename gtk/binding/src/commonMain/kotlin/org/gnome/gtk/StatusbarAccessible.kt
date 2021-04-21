@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkStatusbarAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias StatusbarAccessible = CPointer<GtkStatusbarAccessible>

public val StatusbarAccessible.asObject: Object
  get() = reinterpret()

public val StatusbarAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val StatusbarAccessible.asAccessible: Accessible
  get() = reinterpret()

public val StatusbarAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val StatusbarAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
