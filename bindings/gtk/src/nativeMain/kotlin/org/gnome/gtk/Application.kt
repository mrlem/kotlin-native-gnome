// TODO - method: add_accelerator
// TODO - method: get_accels_for_action
// TODO - method: get_actions_for_accel
// TODO - method: get_windows
// TODO - method: list_action_descriptions
// TODO - method: remove_accelerator
// TODO - method: set_accels_for_action
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkApplication
import interop.gtk_application_add_window
import interop.gtk_application_get_active_window
import interop.gtk_application_get_app_menu
import interop.gtk_application_get_menu_by_id
import interop.gtk_application_get_menubar
import interop.gtk_application_get_window_by_id
import interop.gtk_application_inhibit
import interop.gtk_application_is_inhibited
import interop.gtk_application_new
import interop.gtk_application_prefers_app_menu
import interop.gtk_application_remove_window
import interop.gtk_application_set_app_menu
import interop.gtk_application_set_menubar
import interop.gtk_application_uninhibit
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.ApplicationFlags
import org.gnome.gio.Menu
import org.gnome.gio.MenuModel
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Application = CPointer<GtkApplication>

public val Application.asObject: Object
  get() = reinterpret()

public val Application.asApplication: org.gnome.gio.Application
  get() = reinterpret()

public object ApplicationFactory {
  public fun new(applicationId: String, flags: ApplicationFlags): Application =
      gtk_application_new(applicationId, flags)!!.reinterpret()
}

public val Application.parent: org.gnome.gio.Application
  get() = pointed.parent.ptr

public val Application.activeWindow: Window?
  get() = gtk_application_get_active_window(this)?.reinterpret()

public var Application.appMenu: MenuModel?
  get() = gtk_application_get_app_menu(this)?.reinterpret()
  set(`value`) {
    gtk_application_set_app_menu(this, value)
  }

public var Application.menubar: MenuModel?
  get() = gtk_application_get_menubar(this)?.reinterpret()
  set(`value`) {
    gtk_application_set_menubar(this, value)
  }

public fun Application.addWindow(window: Window?): Unit {
  gtk_application_add_window(this, window?.reinterpret())
}

public fun Application.getMenuById(id: String): Menu? = gtk_application_get_menu_by_id(this,
    id)?.reinterpret()

public fun Application.getWindowById(id: UInt): Window? = gtk_application_get_window_by_id(this,
    id)?.reinterpret()

public fun Application.inhibit(
  window: Window?,
  flags: ApplicationInhibitFlags,
  reason: String
): UInt = gtk_application_inhibit(this, window?.reinterpret(), flags, reason)

public fun Application.isInhibited(flags: ApplicationInhibitFlags): Boolean =
    gtk_application_is_inhibited(this, flags).toBoolean

public fun Application.prefersAppMenu(): Boolean = gtk_application_prefers_app_menu(this).toBoolean

public fun Application.removeWindow(window: Window?): Unit {
  gtk_application_remove_window(this, window?.reinterpret())
}

public fun Application.uninhibit(cookie: UInt): Unit {
  gtk_application_uninhibit(this, cookie)
}

public fun Application.onQueryEnd(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("query-end") { callback(this) }
  return this
}

public fun Application.onWindowAdded(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("window-added") { callback(this) }
  return this
}

public fun Application.onWindowRemoved(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("window-removed") { callback(this) }
  return this
}
