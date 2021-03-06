@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkExpanderAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ExpanderAccessible = CPointer<GtkExpanderAccessible>

public val ExpanderAccessible.asObject: Object
  get() = reinterpret()

public val ExpanderAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ExpanderAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ExpanderAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ExpanderAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ExpanderAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
