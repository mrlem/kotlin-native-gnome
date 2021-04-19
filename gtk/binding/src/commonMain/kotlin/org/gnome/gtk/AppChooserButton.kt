// TODO - append_custom_item
//
package org.gnome.gtk

import gtk3.GtkAppChooserButton
import gtk3.gtk_app_chooser_button_append_separator
import gtk3.gtk_app_chooser_button_get_heading
import gtk3.gtk_app_chooser_button_get_show_default_item
import gtk3.gtk_app_chooser_button_get_show_dialog_item
import gtk3.gtk_app_chooser_button_set_active_custom_item
import gtk3.gtk_app_chooser_button_set_heading
import gtk3.gtk_app_chooser_button_set_show_default_item
import gtk3.gtk_app_chooser_button_set_show_dialog_item
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias AppChooserButton = CPointer<GtkAppChooserButton>

public val AppChooserButton.asObject: Object
  get() = reinterpret()

public val AppChooserButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AppChooserButton.asWidget: Widget
  get() = reinterpret()

public val AppChooserButton.asContainer: Container
  get() = reinterpret()

public val AppChooserButton.asBin: Bin
  get() = reinterpret()

public val AppChooserButton.asComboBox: ComboBox
  get() = reinterpret()

public fun AppChooserButton.appendSeparator(): Unit {
  gtk_app_chooser_button_append_separator(this)
}

public fun AppChooserButton.getHeading(): String =
    gtk_app_chooser_button_get_heading(this).toKString

public fun AppChooserButton.getShowDefaultItem(): Boolean =
    gtk_app_chooser_button_get_show_default_item(this).toBoolean

public fun AppChooserButton.getShowDialogItem(): Boolean =
    gtk_app_chooser_button_get_show_dialog_item(this).toBoolean

public fun AppChooserButton.setActiveCustomItem(name: String?): Unit {
  gtk_app_chooser_button_set_active_custom_item(this, name)
}

public fun AppChooserButton.setHeading(heading: String?): Unit {
  gtk_app_chooser_button_set_heading(this, heading)
}

public fun AppChooserButton.setShowDefaultItem(setting: Boolean): Unit {
  gtk_app_chooser_button_set_show_default_item(this, setting.toInt)
}

public fun AppChooserButton.setShowDialogItem(setting: Boolean): Unit {
  gtk_app_chooser_button_set_show_dialog_item(this, setting.toInt)
}
