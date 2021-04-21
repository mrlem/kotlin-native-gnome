@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkStackSidebar
import gtk3.gtk_stack_sidebar_get_stack
import gtk3.gtk_stack_sidebar_new
import gtk3.gtk_stack_sidebar_set_stack
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

public object StackSidebarFactory {
  public fun new(): StackSidebar = gtk_stack_sidebar_new()!!.reinterpret()
}

public var StackSidebar.stack: Stack?
  get() = gtk_stack_sidebar_get_stack(this)?.reinterpret()
  set(`value`) {
    gtk_stack_sidebar_set_stack(this, value)
  }
