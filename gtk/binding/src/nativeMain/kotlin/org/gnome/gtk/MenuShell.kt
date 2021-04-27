@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuShell
import interop.gtk_menu_shell_activate_item
import interop.gtk_menu_shell_append
import interop.gtk_menu_shell_bind_model
import interop.gtk_menu_shell_cancel
import interop.gtk_menu_shell_deactivate
import interop.gtk_menu_shell_deselect
import interop.gtk_menu_shell_get_parent_shell
import interop.gtk_menu_shell_get_selected_item
import interop.gtk_menu_shell_get_take_focus
import interop.gtk_menu_shell_insert
import interop.gtk_menu_shell_prepend
import interop.gtk_menu_shell_select_first
import interop.gtk_menu_shell_select_item
import interop.gtk_menu_shell_set_take_focus
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gio.MenuModel
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public fun MenuShell.bindModel(
  model: MenuModel?,
  actionNamespace: String,
  withSeparators: Boolean
): Unit {
  gtk_menu_shell_bind_model(this, model?.reinterpret(), actionNamespace, withSeparators.toInt)
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

public fun MenuShell.onActivateCurrent(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("activate-current") { callback(this) }
  return this
}

public fun MenuShell.onCancel(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("cancel") { callback(this) }
  return this
}

public fun MenuShell.onCycleFocus(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("cycle-focus") { callback(this) }
  return this
}

public fun MenuShell.onDeactivate(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("deactivate") { callback(this) }
  return this
}

public fun MenuShell.onInsert(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("insert") { callback(this) }
  return this
}

public fun MenuShell.onMoveCurrent(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("move-current") { callback(this) }
  return this
}

public fun MenuShell.onMoveSelected(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("move-selected") { callback(this) }
  return this
}

public fun MenuShell.onSelectionDone(callback: (MenuShell) -> Unit): MenuShell {
  // TODO - handle callback data

  asObject.connect("selection-done") { callback(this) }
  return this
}
