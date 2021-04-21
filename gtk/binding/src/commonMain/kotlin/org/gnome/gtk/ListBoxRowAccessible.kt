@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkListBoxRowAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ListBoxRowAccessible = CPointer<GtkListBoxRowAccessible>

public val ListBoxRowAccessible.asObject: Object
  get() = reinterpret()

public val ListBoxRowAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ListBoxRowAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ListBoxRowAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ListBoxRowAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
