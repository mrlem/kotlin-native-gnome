@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkFlowBoxChildAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FlowBoxChildAccessible = CPointer<GtkFlowBoxChildAccessible>

public val FlowBoxChildAccessible.asObject: Object
  get() = reinterpret()

public val FlowBoxChildAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val FlowBoxChildAccessible.asAccessible: Accessible
  get() = reinterpret()

public val FlowBoxChildAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val FlowBoxChildAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
