package org.gnome.gtk

import gtk3.GtkWidgetAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias WidgetAccessible = CPointer<GtkWidgetAccessible>

public val WidgetAccessible.asObject: Object
  get() = reinterpret()

public val WidgetAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val WidgetAccessible.asAccessible: Accessible
  get() = reinterpret()
