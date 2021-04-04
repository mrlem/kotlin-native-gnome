package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gtk.*

class AppDelegate(ui: SampleUI) {
    init {
        ui.apply {
            button.asButton.onClick { entry.print() }
            entry.onActivate { entry.print() }
            window.asWidget.showAll()
        }
    }

    private fun Entry.print() {
        println("plop: $text")
        setText("")
    }
}
