package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gobject.onActivate
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.addWindow
import org.gnome.gtk.asObject
import org.mrlem.gnome.gtk.new
import platform.posix.exit

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main(args: Array<String>) {
    ApplicationFactory.new("org.mrlem.sample", args) {
        asObject.onActivate {
            SampleUI()
                .also { AppDelegate(it) }
                .also { addWindow(it.mainWindow) }
        }
    }

    exit(0)
}
