package org.mrlem.gtk.sample

import binding.SampleUI
import org.gnome.gobject.onActivate
import org.gnome.gtk.*
import kotlin.math.roundToInt

class AppDelegate(private val ui: SampleUI) {
    init {
        ui.apply {
            // setup about dialog
            aboutButton.onClicked {
                aboutDialog.asDialog.run()
                aboutDialog.asWidget.hide()
            }

            // setup conversion
            euroAmountEntry.asObject.onActivate { convert() }
            convertButton.onClicked { convert() }

            // show UI
            mainWindow.asWidget.showAll()
        }
    }

    private fun convert() = ui
        .apply { dollarAmountLabel.text = convert(euroAmountEntry.text) }

    private fun convert(eurosString: String?) = eurosString
        ?.toFloatOrNull()
        ?.let { convert(it) }
        ?.let { "$ $it" }
        ?: "-"

    private fun convert(euros: Float) = (euros * 1.19f * 100).roundToInt() / 100f
}
