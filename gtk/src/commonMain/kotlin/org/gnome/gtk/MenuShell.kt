// TODO - implement:
//   activate_item
//   append
//   bind_model
//   cancel
//   deactivate
//   deselect
//   get_parent_shell
//   get_selected_item
//   insert
//   prepend
//   select_first
//   select_item
package org.gnome.gtk

import gtk3.GtkMenuShell
import gtk3.gtk_menu_shell_get_take_focus
import gtk3.gtk_menu_shell_set_take_focus
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias MenuShell = CPointer<GtkMenuShell>

public val MenuShell.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuShell.asWidget: Widget
  get() = reinterpret()

public val MenuShell.asContainer: Container
  get() = reinterpret()

public var MenuShell.takeFocus: Boolean
  get() = gtk_menu_shell_get_take_focus(this).toBoolean
  set(`value`) {
    gtk_menu_shell_set_take_focus(this, value.toInt)
  }
