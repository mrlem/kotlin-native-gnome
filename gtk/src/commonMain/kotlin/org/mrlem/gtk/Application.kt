package org.mrlem.gtk

import gtk3.*
import kotlinx.cinterop.*
import org.mrlem.glib.toKList

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias Application = CPointer<GtkApplication>

///////////////////////////////////////////////////////////////////////////
// Conversion
///////////////////////////////////////////////////////////////////////////

val Application.asObject
    get() = reinterpret<GObject>()

///////////////////////////////////////////////////////////////////////////
// Public API
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
// Event handlers
///////////////////////////////////////////////////////////////////////////

fun Application.onActivate(onActivate: (Application) -> Unit): Application {
    asObject.connect("activate") { onActivate(this) }
    return this
}
