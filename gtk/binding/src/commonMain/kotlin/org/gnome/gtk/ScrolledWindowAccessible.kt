package org.gnome.gtk

import gtk3.GtkScrolledWindowAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ScrolledWindowAccessible = CPointer<GtkScrolledWindowAccessible>

public val ScrolledWindowAccessible.asObject: Object
  get() = reinterpret()

public val ScrolledWindowAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ScrolledWindowAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ScrolledWindowAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ScrolledWindowAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
