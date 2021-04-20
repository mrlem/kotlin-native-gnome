// TODO - bind_model
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkMenuShell
import gtk3.gtk_menu_shell_activate_item
import gtk3.gtk_menu_shell_append
import gtk3.gtk_menu_shell_cancel
import gtk3.gtk_menu_shell_deactivate
import gtk3.gtk_menu_shell_deselect
import gtk3.gtk_menu_shell_get_parent_shell
import gtk3.gtk_menu_shell_get_selected_item
import gtk3.gtk_menu_shell_get_take_focus
import gtk3.gtk_menu_shell_insert
import gtk3.gtk_menu_shell_prepend
import gtk3.gtk_menu_shell_select_first
import gtk3.gtk_menu_shell_select_item
import gtk3.gtk_menu_shell_set_take_focus
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias MenuShell = CPointer<GtkMenuShell>

public val MenuShell.asObject: Object
  get() = reinterpret()

public val MenuShell.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuShell.asWidget: Widget
  get() = reinterpret()

public val MenuShell.asContainer: Container
  get() = reinterpret()

public val MenuShell.parentShell: Widget?
  get() = gtk_menu_shell_get_parent_shell(this)?.reinterpret()

public val MenuShell.selectedItem: Widget?
  get() = gtk_menu_shell_get_selected_item(this)?.reinterpret()

public var MenuShell.takeFocus: Boolean
  get() = gtk_menu_shell_get_take_focus(this).toBoolean
  set(`value`) {
    gtk_menu_shell_set_take_focus(this, value.toInt)
  }

public fun MenuShell.activateItem(menuItem: Widget?, forceDeactivate: Boolean): Unit {
  gtk_menu_shell_activate_item(this, menuItem?.reinterpret(), forceDeactivate.toInt)
}

public fun MenuShell.append(child: MenuItem?): Unit {
  gtk_menu_shell_append(this, child?.reinterpret())
}

public fun MenuShell.cancel(): Unit {
  gtk_menu_shell_cancel(this)
}

public fun MenuShell.deactivate(): Unit {
  gtk_menu_shell_deactivate(this)
}

public fun MenuShell.deselect(): Unit {
  gtk_menu_shell_deselect(this)
}

public fun MenuShell.insert(child: Widget?, position: Int): Unit {
  gtk_menu_shell_insert(this, child?.reinterpret(), position)
}

public fun MenuShell.prepend(child: Widget?): Unit {
  gtk_menu_shell_prepend(this, child?.reinterpret())
}

public fun MenuShell.selectFirst(searchSensitive: Boolean): Unit {
  gtk_menu_shell_select_first(this, searchSensitive.toInt)
}

public fun MenuShell.selectItem(menuItem: Widget?): Unit {
  gtk_menu_shell_select_item(this, menuItem?.reinterpret())
}
