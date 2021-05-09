package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.addWindow
import org.mrlem.gnome.gtk.newAndRun
import platform.posix.exit

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main() {
    ApplicationFactory.newAndRun("org.mrlem.sample") {
        val ui = SampleUI()
        AppDelegate(ui)
        addWindow(ui.mainWindow)
    }

    exit(0)
}
