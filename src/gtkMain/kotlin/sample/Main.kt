package sample

import platform.posix.exit
import sample.gtk.*

private const val GLADE_FILENAME = "/home/seb/Projects/kotlin-glade/src/gtkMain/resources/sample.glade"

/**
 * Run a sample app demonstrating how to load a glade UI file and access its widgets.
 */
fun main(args: Array<String>) {
    Application("org.mrlem.sample", args) {
        onActivate {
            val ui = UI(GLADE_FILENAME).apply {
                button.onClick { entry.print() }
                entry.onActivate { entry.print() }
                window.showAll()
            }

            addWindow(ui.window)
        }
    }

    exit(0)
}

private fun Entry.print() {
    println("plop: $text")
    setText("")
}