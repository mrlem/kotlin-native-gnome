@file:Suppress("unused")

package org.mrlem.gnome.gtk

import interop.*
import kotlinx.cinterop.*
import org.gnome.gio.onActivate
import org.gnome.gobject.unref
import kotlin.String
import kotlin.Unit
import org.gnome.gio.run as runApp
import org.gnome.gtk.Application
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.asApplication
import org.gnome.gtk.asObject

/**
 * Create & run a GTK application.
 *
 * @param id application ID.
 * @param onActivate application initialization block.
 */
fun ApplicationFactory.newAndRun(id: String, onActivate: Application.() -> Unit) {
  new(id, G_APPLICATION_FLAGS_NONE).apply {
    asApplication.onActivate { onActivate() }
    memScoped {
      asApplication.runApp(0, emptyArray())
    }
    asObject.unref()
  }
}
