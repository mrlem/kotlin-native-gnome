package org.gnome.gtk

import gtk3.GtkAppChooserDialog
import gtk3.gtk_app_chooser_dialog_get_heading
import gtk3.gtk_app_chooser_dialog_get_widget
import gtk3.gtk_app_chooser_dialog_set_heading
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias AppChooserDialog = CPointer<GtkAppChooserDialog>

public val AppChooserDialog.asObject: Object
  get() = reinterpret()

public val AppChooserDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AppChooserDialog.asWidget: Widget
  get() = reinterpret()

public val AppChooserDialog.asContainer: Container
  get() = reinterpret()

public val AppChooserDialog.asBin: Bin
  get() = reinterpret()

public val AppChooserDialog.asWindow: Window
  get() = reinterpret()

public val AppChooserDialog.asDialog: Dialog
  get() = reinterpret()

public fun AppChooserDialog.getHeading(): String =
    gtk_app_chooser_dialog_get_heading(this).toKString

public fun AppChooserDialog.getWidget(): Widget? =
    gtk_app_chooser_dialog_get_widget(this)?.reinterpret()

public fun AppChooserDialog.setHeading(heading: String?): Unit {
  gtk_app_chooser_dialog_set_heading(this, heading)
}
