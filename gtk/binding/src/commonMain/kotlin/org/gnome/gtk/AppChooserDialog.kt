// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkAppChooserDialog
import gtk3.gtk_app_chooser_dialog_get_heading
import gtk3.gtk_app_chooser_dialog_get_widget
import gtk3.gtk_app_chooser_dialog_new_for_content_type
import gtk3.gtk_app_chooser_dialog_set_heading
import kotlin.String
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

public object AppChooserDialogFactory {
  public fun newForContentType(
    parent: Window?,
    flags: DialogFlags,
    contentType: String
  ): AppChooserDialog = gtk_app_chooser_dialog_new_for_content_type(parent?.reinterpret(), flags,
      contentType)!!.reinterpret()
}

public var AppChooserDialog.heading: String
  get() = gtk_app_chooser_dialog_get_heading(this).toKString
  set(`value`) {
    gtk_app_chooser_dialog_set_heading(this, value)
  }

public val AppChooserDialog.widget: Widget?
  get() = gtk_app_chooser_dialog_get_widget(this)?.reinterpret()
