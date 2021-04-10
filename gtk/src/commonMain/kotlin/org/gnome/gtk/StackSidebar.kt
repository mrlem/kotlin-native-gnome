// TODO - implement:
//   set_stack
package org.gnome.gtk

import gtk3.GtkStackSidebar
import gtk3.gtk_stack_sidebar_get_stack
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias StackSidebar = CPointer<GtkStackSidebar>

public val StackSidebar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val StackSidebar.asWidget: Widget
  get() = reinterpret()

public val StackSidebar.asContainer: Container
  get() = reinterpret()

public val StackSidebar.asBin: Bin
  get() = reinterpret()

public fun StackSidebar.getStack(): Unit {
  gtk_stack_sidebar_get_stack(this)
}
