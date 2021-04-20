// TODO - add_accelerator
// TODO - get_accels_for_action
// TODO - get_actions_for_accel
// TODO - get_app_menu
// TODO - get_menu_by_id
// TODO - get_menubar
// TODO - get_windows
// TODO - list_action_descriptions
// TODO - remove_accelerator
// TODO - set_accels_for_action
// TODO - set_app_menu
// TODO - set_menubar
//
package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.*
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKList

public typealias Application = CPointer<GtkApplication>

public val Application.asObject: Object
  get() = reinterpret()

public val Application.asApplication: org.gnome.gio.Application
  get() = reinterpret()

public val Application.activeWindow: Window?
  get() = gtk_application_get_active_window(this)?.reinterpret()

public fun Application.addWindow(window: Window): Unit {
  gtk_application_add_window(this, window.reinterpret())
}

public fun Application.getWindowById(id: UInt): Window? = gtk_application_get_window_by_id(this,
    id)?.reinterpret()

public fun Application.inhibit(
  window: Window,
  flags: ApplicationInhibitFlags,
  reason: String?
): UInt = gtk_application_inhibit(this, window.reinterpret(), flags, reason)

public fun Application.isInhibited(flags: ApplicationInhibitFlags): Boolean =
    gtk_application_is_inhibited(this, flags).toBoolean

public fun Application.prefersAppMenu(): Boolean = gtk_application_prefers_app_menu(this).toBoolean

public fun Application.removeWindow(window: Window): Unit {
  gtk_application_remove_window(this, window.reinterpret())
}

public fun Application.uninhibit(cookie: UInt): Unit {
  gtk_application_uninhibit(this, cookie)
}

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

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

fun Application.newWindow() = gtk_application_window_new(this)!!.reinterpret<GtkWindow>()

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()
