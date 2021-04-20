package org.gnome.gtk

import gtk3.GtkMenuAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuAccessible = CPointer<GtkMenuAccessible>

public val MenuAccessible.asObject: Object
  get() = reinterpret()

public val MenuAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val MenuAccessible.asAccessible: Accessible
  get() = reinterpret()

public val MenuAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val MenuAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val MenuAccessible.asMenuShellAccessible: MenuShellAccessible
  get() = reinterpret()
