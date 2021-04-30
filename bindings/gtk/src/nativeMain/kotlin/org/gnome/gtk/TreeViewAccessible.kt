@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTreeViewAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TreeViewAccessible = CPointer<GtkTreeViewAccessible>

public val TreeViewAccessible.asObject: Object
  get() = reinterpret()

public val TreeViewAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val TreeViewAccessible.asAccessible: Accessible
  get() = reinterpret()

public val TreeViewAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val TreeViewAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val TreeViewAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
