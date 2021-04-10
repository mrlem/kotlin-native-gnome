// TODO - implement:
//   add_accelerator
//   add_window
//   get_accels_for_action
//   get_actions_for_accel
//   get_menu_by_id
//   get_window_by_id
//   inhibit
//   is_inhibited
//   remove_accelerator
//   remove_window
//   set_accels_for_action
//   set_app_menu
//   set_menubar
//   uninhibit
package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.*
import kotlin.Boolean
import kotlin.Unit
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toKList

public typealias Application = CPointer<GtkApplication>

public val Application.asObject: Object
  get() = reinterpret()

public val Application.asApplication: org.gnome.glib.gio.Application
  get() = reinterpret()

public fun Application.getActiveWindow(): Unit {
  gtk_application_get_active_window(this)
}

public fun Application.getAppMenu(): Unit {
  gtk_application_get_app_menu(this)
}

public fun Application.getMenubar(): Unit {
  gtk_application_get_menubar(this)
}

public fun Application.getWindows(): Unit {
  gtk_application_get_windows(this)
}

public fun Application.listActionDescriptions(): Unit {
  gtk_application_list_action_descriptions(this)
}

public fun Application.prefersAppMenu(): Boolean = gtk_application_prefers_app_menu(this).toBoolean

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

fun Application.addWindow(window: Window) = gtk_application_add_window(this, window)

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()
