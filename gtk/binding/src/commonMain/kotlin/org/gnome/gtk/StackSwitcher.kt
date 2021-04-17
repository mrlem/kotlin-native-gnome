// TODO - implement:
//   set_stack
package org.gnome.gtk

import gtk3.GtkStackSwitcher
import gtk3.gtk_stack_switcher_get_stack
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias StackSwitcher = CPointer<GtkStackSwitcher>

public val StackSwitcher.asObject: Object
  get() = reinterpret()

public val StackSwitcher.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val StackSwitcher.asWidget: Widget
  get() = reinterpret()

public val StackSwitcher.asContainer: Container
  get() = reinterpret()

public val StackSwitcher.asBox: Box
  get() = reinterpret()

public fun StackSwitcher.getStack(): Unit {
  gtk_stack_switcher_get_stack(this)
}
