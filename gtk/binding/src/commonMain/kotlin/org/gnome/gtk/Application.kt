// TODO - constructor: new
// TODO - method: add_accelerator
// TODO - method: get_accels_for_action
// TODO - method: get_actions_for_accel
// TODO - method: get_app_menu
// TODO - method: get_menu_by_id
// TODO - method: get_menubar
// TODO - method: get_windows
// TODO - method: list_action_descriptions
// TODO - method: remove_accelerator
// TODO - method: set_accels_for_action
// TODO - method: set_app_menu
// TODO - method: set_menubar
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.*
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toKList

public typealias Application = CPointer<GtkApplication>

public val Application.asObject: Object
  get() = reinterpret()

public val Application.asApplication: org.gnome.gio.Application
  get() = reinterpret()

public object ApplicationFactory

public val Application.activeWindow: Window?
  get() = gtk_application_get_active_window(this)?.reinterpret()

public fun Application.addWindow(window: Window?): Unit {
  gtk_application_add_window(this, window?.reinterpret())
}

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

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

// TODO - investigate why this is not generated
@Suppress("FunctionName")
fun Application(id: String): Application = gtk_application_new(id, G_APPLICATION_FLAGS_NONE)!!

fun Application.initAndRun(args: Array<String>, init: Application.() -> Unit) = run {
  init()
  memScoped {
    g_application_run(this@run.reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
  }
  g_object_unref(this)
}

@Suppress("FunctionName")
fun Application(id: String, args: Array<String>, init: Application.() -> Unit) = Application(id).initAndRun(args, init)

// TODO - investigate why this is not generated
fun Application.newWindow() = gtk_application_window_new(this)!!.reinterpret<GtkWindow>()

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()
