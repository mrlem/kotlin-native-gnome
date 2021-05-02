@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkApplicationWindow
import interop.gtk_application_window_get_help_overlay
import interop.gtk_application_window_get_id
import interop.gtk_application_window_get_show_menubar
import interop.gtk_application_window_new
import interop.gtk_application_window_set_help_overlay
import interop.gtk_application_window_set_show_menubar
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public object ApplicationWindowFactory {
  public fun new(application: Application?): ApplicationWindow =
      gtk_application_window_new(application?.reinterpret())!!.reinterpret()
}

public val ApplicationWindow.parentInstance: Window
  get() = pointed.parent_instance.ptr

public var ApplicationWindow.helpOverlay: ShortcutsWindow?
  get() = gtk_application_window_get_help_overlay(this)?.reinterpret()
  set(`value`) {
    gtk_application_window_set_help_overlay(this, `value`)
  }

public val ApplicationWindow.id: UInt
  get() = gtk_application_window_get_id(this)

public var ApplicationWindow.showMenubar: Boolean
  get() = gtk_application_window_get_show_menubar(this).toBoolean
  set(`value`) {
    gtk_application_window_set_show_menubar(this, `value`.toInt)
  }
