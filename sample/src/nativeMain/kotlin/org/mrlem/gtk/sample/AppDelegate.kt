package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gtk.*

class AppDelegate(private val ui: SampleUI) {

    init {
        initEvents()
        ui.mainWindow.asWidget.showAll()
    }

    private fun initEvents() = with(ui) {
        // setup about dialog
        aboutButton.onClicked {
            aboutDialog.asDialog.run()
            aboutDialog.asWidget.hide()
        }

        // setup conversion
        euroAmountEntry.onActivate { showConverted() }
        convertButton.onClicked { showConverted() }
    }

    private fun showConverted() = with(ui) {
        dollarAmountLabel.text = convert(euroAmountEntry.text?.toFloatOrNull())
    }

    private fun convert(euros: Float?) = euros
        ?.let { Converter.eurosToDollars(euros) }
        ?.let { "$ $it" }
        ?: "-"

}
