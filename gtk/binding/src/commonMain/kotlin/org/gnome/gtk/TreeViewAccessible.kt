package org.gnome.gtk

import gtk3.GtkTreeViewAccessible
import kotlinx.cinterop.CPointer
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
