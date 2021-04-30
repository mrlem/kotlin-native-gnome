@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkStackSwitcher
import interop.gtk_stack_switcher_get_stack
import interop.gtk_stack_switcher_new
import interop.gtk_stack_switcher_set_stack
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val StackSwitcher.widget: Box
  get() = pointed.widget.ptr

public var StackSwitcher.stack: Stack?
  get() = gtk_stack_switcher_get_stack(this)?.reinterpret()
  set(`value`) {
    gtk_stack_switcher_set_stack(this, value)
  }
