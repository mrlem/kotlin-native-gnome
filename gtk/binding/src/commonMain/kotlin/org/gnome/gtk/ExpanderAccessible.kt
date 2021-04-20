package org.gnome.gtk

import gtk3.GtkExpanderAccessible
import kotlinx.cinterop.CPointer
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
