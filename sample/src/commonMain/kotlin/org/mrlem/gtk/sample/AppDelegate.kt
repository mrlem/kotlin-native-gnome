package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gobject.onActivate
import org.gnome.gtk.*
import kotlin.math.roundToInt

class AppDelegate(private val ui: SampleUI) {

    init {
        with(ui) {
            // setup about dialog
            aboutButton.onClicked {
                aboutDialog.asDialog.run()
                aboutDialog.asWidget.hide()
            }

            // setup conversion
            euroAmountEntry.asObject.onActivate { showConverted() }
            convertButton.onClicked { showConverted() }

            // show UI
            mainWindow.asWidget.showAll()
        }
    }

    private fun showConverted() = with(ui) {
        dollarAmountLabel.text = convert(euroAmountEntry.text.toFloatOrNull())
    }

    private fun convert(euros: Float?) = euros
        ?.let { (euros * 1.19f * 100).roundToInt() / 100f }
        ?.let { "$ $it" }
        ?: "-"

}
