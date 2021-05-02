@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAppChooserButton
import interop.gtk_app_chooser_button_append_custom_item
import interop.gtk_app_chooser_button_append_separator
import interop.gtk_app_chooser_button_get_heading
import interop.gtk_app_chooser_button_get_show_default_item
import interop.gtk_app_chooser_button_get_show_dialog_item
import interop.gtk_app_chooser_button_new
import interop.gtk_app_chooser_button_set_active_custom_item
import interop.gtk_app_chooser_button_set_heading
import interop.gtk_app_chooser_button_set_show_default_item
import interop.gtk_app_chooser_button_set_show_dialog_item
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Icon
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

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

public object AppChooserButtonFactory {
  public fun new(contentType: String): AppChooserButton =
      gtk_app_chooser_button_new(contentType)!!.reinterpret()
}

public val AppChooserButton.parent: ComboBox
  get() = pointed.parent.ptr

public var AppChooserButton.heading: String
  get() = gtk_app_chooser_button_get_heading(this).toKString()
  set(`value`) {
    gtk_app_chooser_button_set_heading(this, `value`)
  }

public var AppChooserButton.showDefaultItem: Boolean
  get() = gtk_app_chooser_button_get_show_default_item(this).toBoolean()
  set(`value`) {
    gtk_app_chooser_button_set_show_default_item(this, `value`.toInt())
  }

public var AppChooserButton.showDialogItem: Boolean
  get() = gtk_app_chooser_button_get_show_dialog_item(this).toBoolean()
  set(`value`) {
    gtk_app_chooser_button_set_show_dialog_item(this, `value`.toInt())
  }

public fun AppChooserButton.appendCustomItem(
  name: String,
  label: String,
  icon: Icon?
): Unit {
  gtk_app_chooser_button_append_custom_item(this, name, label, icon?.reinterpret())
}

public fun AppChooserButton.appendSeparator(): Unit {
  gtk_app_chooser_button_append_separator(this)
}

public fun AppChooserButton.setActiveCustomItem(name: String): Unit {
  gtk_app_chooser_button_set_active_custom_item(this, name)
}

public fun AppChooserButton.onCustomItemActivated(callback: (AppChooserButton) -> Unit):
    AppChooserButton {
  // TODO - handle callback data

  asObject.connect("custom-item-activated") { callback(this) }
  return this
}
