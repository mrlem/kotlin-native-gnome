package org.gnome.gtk

import gtk3.GtkApplicationWindow
import gtk3.gtk_application_window_get_help_overlay
import gtk3.gtk_application_window_get_id
import gtk3.gtk_application_window_get_show_menubar
import gtk3.gtk_application_window_set_help_overlay
import gtk3.gtk_application_window_set_show_menubar
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public fun ApplicationWindow.getHelpOverlay(): ShortcutsWindow? =
    gtk_application_window_get_help_overlay(this)?.reinterpret()

public fun ApplicationWindow.getId(): UInt = gtk_application_window_get_id(this)

public fun ApplicationWindow.getShowMenubar(): Boolean =
    gtk_application_window_get_show_menubar(this).toBoolean

public fun ApplicationWindow.setHelpOverlay(helpOverlay: ShortcutsWindow): Unit {
  gtk_application_window_set_help_overlay(this, helpOverlay.reinterpret())
}

public fun ApplicationWindow.setShowMenubar(showMenubar: Boolean): Unit {
  gtk_application_window_set_show_menubar(this, showMenubar.toInt)
}
