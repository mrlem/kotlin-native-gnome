package org.mrlem.gtk.sample

import binding.SampleUI
import org.mrlem.gtk.*
import platform.posix.exit

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main(args: Array<String>) {
    Application("org.mrlem.sample", args) {
        onActivate {
            SampleUI()
                .also { AppDelegate(it) }
                .also { addWindow(it.window) }
        }
    }

    exit(0)
}
