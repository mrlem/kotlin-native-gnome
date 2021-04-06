// TODO - implement:
//   get_widget
package org.gnome.gtk

import gtk3.GtkAppChooserDialog
import gtk3.gtk_app_chooser_dialog_get_heading
import gtk3.gtk_app_chooser_dialog_set_heading
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toKString

public typealias AppChooserDialog = CPointer<GtkAppChooserDialog>

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

public var AppChooserDialog.heading: String?
  get() = gtk_app_chooser_dialog_get_heading(this).toKString
  set(`value`) {
    gtk_app_chooser_dialog_set_heading(this, value)
  }
