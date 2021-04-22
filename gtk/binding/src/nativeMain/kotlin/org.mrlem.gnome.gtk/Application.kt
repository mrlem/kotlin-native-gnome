@file:Suppress("unused")

package org.mrlem.gnome.gtk

import interop.*
import kotlinx.cinterop.*
import kotlin.String
import kotlin.Unit
import org.gnome.gtk.Application
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.Window
import org.gnome.toKList

// TODO - investigate why this is not generated
fun ApplicationFactory.new(id: String): Application = gtk_application_new(id, G_APPLICATION_FLAGS_NONE)!!

fun ApplicationFactory.new(id: String, args: Array<String>, init: Application.() -> Unit) =
  ApplicationFactory.new(id)
    .initAndRun(args, init)

fun Application.initAndRun(args: Array<String>, init: Application.() -> Unit) = run {
  init()
  memScoped {
    g_application_run(this@run.reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
  }
  g_object_unref(this)
}

// TODO - investigate why this is not generated
fun Application.newWindow() = gtk_application_window_new(this)!!.reinterpret<GtkWindow>()

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()
