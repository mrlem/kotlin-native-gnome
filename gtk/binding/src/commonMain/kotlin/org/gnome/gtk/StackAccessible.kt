package org.gnome.gtk

import gtk3.GtkStackAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias StackAccessible = CPointer<GtkStackAccessible>

public val StackAccessible.asObject: Object
  get() = reinterpret()

public val StackAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val StackAccessible.asAccessible: Accessible
  get() = reinterpret()

public val StackAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val StackAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
