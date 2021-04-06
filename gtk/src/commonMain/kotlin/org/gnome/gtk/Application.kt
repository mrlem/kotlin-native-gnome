// TODO - implement:
//   add_accelerator
//   add_window
//   get_accels_for_action
//   get_actions_for_accel
//   get_active_window
//   get_app_menu
//   get_menu_by_id
//   get_menubar
//   get_window_by_id
//   get_windows
//   inhibit
//   is_inhibited
//   list_action_descriptions
//   prefers_app_menu
//   remove_accelerator
//   remove_window
//   set_accels_for_action
//   set_app_menu
//   set_menubar
//   uninhibit
package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.*
import org.gnome.glib.gio.asObject
import org.gnome.glib.gobject.connect
import org.gnome.glib.toKList

public typealias Application = CPointer<GtkApplication>

public val Application.asApplication: org.gnome.glib.gio.Application
  get() = reinterpret()

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

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun Application.onActivate(onActivate: (Application) -> Unit): Application {
  asApplication.asObject.connect("activate") { onActivate(this) }
  return this
}
