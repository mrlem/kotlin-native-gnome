@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioMenuItemAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RadioMenuItemAccessible = CPointer<GtkRadioMenuItemAccessible>

public val RadioMenuItemAccessible.asObject: Object
  get() = reinterpret()

public val RadioMenuItemAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val RadioMenuItemAccessible.asAccessible: Accessible
  get() = reinterpret()

public val RadioMenuItemAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val RadioMenuItemAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val RadioMenuItemAccessible.asMenuItemAccessible: MenuItemAccessible
  get() = reinterpret()

public val RadioMenuItemAccessible.asCheckMenuItemAccessible: CheckMenuItemAccessible
  get() = reinterpret()

public val RadioMenuItemAccessible.parent: CheckMenuItemAccessible
  get() = pointed.parent.ptr
