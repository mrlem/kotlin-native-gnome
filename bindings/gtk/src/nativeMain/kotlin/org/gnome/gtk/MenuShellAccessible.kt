@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuShellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuShellAccessible = CPointer<GtkMenuShellAccessible>

public val MenuShellAccessible.asObject: Object
  get() = reinterpret()

public val MenuShellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val MenuShellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val MenuShellAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val MenuShellAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val MenuShellAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
