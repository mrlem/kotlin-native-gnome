package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.glib.gobject.onActivate
import org.gnome.gtk.Application
import org.gnome.gtk.addWindow
import org.gnome.gtk.asObject
import platform.posix.exit

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main(args: Array<String>) {
    Application("org.mrlem.sample", args) {
        asObject.onActivate {
            SampleUI()
                .also { AppDelegate(it) }
                .also { addWindow(it.mainWindow) }
        }
    }

    exit(0)
}
