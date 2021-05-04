// TODO - constructor: new
// TODO - constructor: new_with_markup
// TODO - method: format_secondary_markup (param type)
// TODO - method: format_secondary_text (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMessageDialog
import interop.gtk_message_dialog_get_message_area
import interop.gtk_message_dialog_set_markup
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public object MessageDialogFactory

public val MessageDialog.parentInstance: Dialog
  get() = pointed.parent_instance.ptr

public val MessageDialog.messageArea: Widget?
  get() = gtk_message_dialog_get_message_area(this)?.reinterpret()

public fun MessageDialog.setMarkup(str: String?): Unit {
  gtk_message_dialog_set_markup(this@setMarkup, str)
}
