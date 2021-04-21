@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkCheckMenuItemAccessible
import kotlinx.cinterop.CPointer
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
