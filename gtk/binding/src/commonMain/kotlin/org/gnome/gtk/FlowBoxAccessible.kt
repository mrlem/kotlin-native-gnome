@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkFlowBoxAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FlowBoxAccessible = CPointer<GtkFlowBoxAccessible>

public val FlowBoxAccessible.asObject: Object
  get() = reinterpret()

public val FlowBoxAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val FlowBoxAccessible.asAccessible: Accessible
  get() = reinterpret()

public val FlowBoxAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val FlowBoxAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
