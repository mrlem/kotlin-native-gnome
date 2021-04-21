@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkStackSwitcher
import gtk3.gtk_stack_switcher_get_stack
import gtk3.gtk_stack_switcher_new
import gtk3.gtk_stack_switcher_set_stack
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

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

public object StackSwitcherFactory {
  public fun new(): StackSwitcher = gtk_stack_switcher_new()!!.reinterpret()
}

public var StackSwitcher.stack: Stack?
  get() = gtk_stack_switcher_get_stack(this)?.reinterpret()
  set(`value`) {
    gtk_stack_switcher_set_stack(this, value)
  }
