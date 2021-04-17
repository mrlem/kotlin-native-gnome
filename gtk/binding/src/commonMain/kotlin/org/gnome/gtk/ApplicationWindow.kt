// TODO - implement:
//   set_help_overlay
package org.gnome.gtk

import gtk3.GtkApplicationWindow
import gtk3.gtk_application_window_get_help_overlay
import gtk3.gtk_application_window_get_id
import gtk3.gtk_application_window_get_show_menubar
import gtk3.gtk_application_window_set_show_menubar
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias ApplicationWindow = CPointer<GtkApplicationWindow>

public val ApplicationWindow.asObject: Object
  get() = reinterpret()

public val ApplicationWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ApplicationWindow.asWidget: Widget
  get() = reinterpret()

public val ApplicationWindow.asContainer: Container
  get() = reinterpret()

public val ApplicationWindow.asBin: Bin
  get() = reinterpret()

public val ApplicationWindow.asWindow: Window
  get() = reinterpret()

public fun ApplicationWindow.getHelpOverlay(): Unit {
  gtk_application_window_get_help_overlay(this)
}

public var ApplicationWindow.showMenubar: Boolean
  get() = gtk_application_window_get_show_menubar(this).toBoolean
  set(`value`) {
    gtk_application_window_set_show_menubar(this, value.toInt)
  }

public val ApplicationWindow.id: UInt
  get() = gtk_application_window_get_id(this)
