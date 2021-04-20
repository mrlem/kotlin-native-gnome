package org.gnome.gtk

import gtk3.GtkPopoverAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PopoverAccessible = CPointer<GtkPopoverAccessible>

public val PopoverAccessible.asObject: Object
  get() = reinterpret()

public val PopoverAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val PopoverAccessible.asAccessible: Accessible
  get() = reinterpret()

public val PopoverAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val PopoverAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
