package org.gnome.gtk

import gtk3.GtkStackSidebar
import gtk3.gtk_stack_sidebar_get_stack
import gtk3.gtk_stack_sidebar_set_stack
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias StackSidebar = CPointer<GtkStackSidebar>

public val StackSidebar.asObject: Object
  get() = reinterpret()

public val StackSidebar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val StackSidebar.asWidget: Widget
  get() = reinterpret()

public val StackSidebar.asContainer: Container
  get() = reinterpret()

public val StackSidebar.asBin: Bin
  get() = reinterpret()

public fun StackSidebar.getStack(): Stack? = gtk_stack_sidebar_get_stack(this)?.reinterpret()

public fun StackSidebar.setStack(stack: Stack): Unit {
  gtk_stack_sidebar_set_stack(this, stack.reinterpret())
}
