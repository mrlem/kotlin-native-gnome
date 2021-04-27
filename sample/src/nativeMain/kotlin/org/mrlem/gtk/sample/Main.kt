package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gio.onActivate
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.addWindow
import org.gnome.gtk.asApplication
import org.mrlem.gnome.gtk.new
import platform.posix.exit

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main(args: Array<String>) {
    ApplicationFactory.new("org.mrlem.sample", args) {
        asApplication.onActivate {
            SampleUI()
                .also { AppDelegate(it) }
                .also { addWindow(it.mainWindow) }
        }
    }

    exit(0)
}
