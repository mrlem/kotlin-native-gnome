@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCheckMenuItemAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias CheckMenuItemAccessible = CPointer<GtkCheckMenuItemAccessible>

public val CheckMenuItemAccessible.asObject: Object
  get() = reinterpret()

public val CheckMenuItemAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val CheckMenuItemAccessible.asAccessible: Accessible
  get() = reinterpret()

public val CheckMenuItemAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val CheckMenuItemAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val CheckMenuItemAccessible.asMenuItemAccessible: MenuItemAccessible
  get() = reinterpret()

public val CheckMenuItemAccessible.parent: MenuItemAccessible
  get() = pointed.parent.ptr
