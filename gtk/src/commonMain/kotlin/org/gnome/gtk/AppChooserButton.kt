// TODO - implement:
//   append_custom_item
//   set_active_custom_item
package org.gnome.gtk

import gtk3.GtkAppChooserButton
import gtk3.gtk_app_chooser_button_append_separator
import gtk3.gtk_app_chooser_button_get_heading
import gtk3.gtk_app_chooser_button_get_show_default_item
import gtk3.gtk_app_chooser_button_get_show_dialog_item
import gtk3.gtk_app_chooser_button_set_heading
import gtk3.gtk_app_chooser_button_set_show_default_item
import gtk3.gtk_app_chooser_button_set_show_dialog_item
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias AppChooserButton = CPointer<GtkAppChooserButton>

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

public var AppChooserButton.heading: String?
  get() = gtk_app_chooser_button_get_heading(this).toKString
  set(`value`) {
    gtk_app_chooser_button_set_heading(this, value)
  }

public var AppChooserButton.showDefaultItem: Boolean
  get() = gtk_app_chooser_button_get_show_default_item(this).toBoolean
  set(`value`) {
    gtk_app_chooser_button_set_show_default_item(this, value.toInt)
  }

public var AppChooserButton.showDialogItem: Boolean
  get() = gtk_app_chooser_button_get_show_dialog_item(this).toBoolean
  set(`value`) {
    gtk_app_chooser_button_set_show_dialog_item(this, value.toInt)
  }
