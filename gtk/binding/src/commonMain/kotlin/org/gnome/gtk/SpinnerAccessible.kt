package org.gnome.gtk

import gtk3.GtkSpinnerAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SpinnerAccessible = CPointer<GtkSpinnerAccessible>

public val SpinnerAccessible.asObject: Object
  get() = reinterpret()

public val SpinnerAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val SpinnerAccessible.asAccessible: Accessible
  get() = reinterpret()

public val SpinnerAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()
