// TODO - format_secondary_markup
// TODO - format_secondary_text
// TODO - get_image
// TODO - set_image
//
package org.gnome.gtk

import gtk3.GtkMessageDialog
import gtk3.gtk_message_dialog_get_message_area
import gtk3.gtk_message_dialog_set_markup
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias MessageDialog = CPointer<GtkMessageDialog>

public val MessageDialog.asObject: Object
  get() = reinterpret()

public val MessageDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MessageDialog.asWidget: Widget
  get() = reinterpret()

public val MessageDialog.asContainer: Container
  get() = reinterpret()

public val MessageDialog.asBin: Bin
  get() = reinterpret()

public val MessageDialog.asWindow: Window
  get() = reinterpret()

public val MessageDialog.asDialog: Dialog
  get() = reinterpret()

public val MessageDialog.messageArea: Widget?
  get() = gtk_message_dialog_get_message_area(this)?.reinterpret()

public fun MessageDialog.setMarkup(str: String): Unit {
  gtk_message_dialog_set_markup(this, str)
}
