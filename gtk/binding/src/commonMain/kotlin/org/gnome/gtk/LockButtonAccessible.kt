@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkLockButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias LockButtonAccessible = CPointer<GtkLockButtonAccessible>

public val LockButtonAccessible.asObject: Object
  get() = reinterpret()

public val LockButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val LockButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val LockButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val LockButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val LockButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()
