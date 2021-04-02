package sample

import org.mrlem.gtk.*

class AppDelegate(ui: AppUI) {
    init {
        ui.apply {
            button.onClick { entry.print() }
            entry.onActivate { entry.print() }
            window.showAll()
        }
    }

    private fun Entry.print() {
        println("plop: $text")
        setText("")
    }
}