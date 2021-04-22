@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkListBoxAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ListBoxAccessible = CPointer<GtkListBoxAccessible>

public val ListBoxAccessible.asObject: Object
  get() = reinterpret()

public val ListBoxAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ListBoxAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ListBoxAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ListBoxAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
