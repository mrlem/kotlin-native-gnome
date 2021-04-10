package org.gnome.gtk

import gtk3.GtkFontChooserDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias FontChooserDialog = CPointer<GtkFontChooserDialog>

public val FontChooserDialog.asObject: Object
  get() = reinterpret()

public val FontChooserDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontChooserDialog.asWidget: Widget
  get() = reinterpret()

public val FontChooserDialog.asContainer: Container
  get() = reinterpret()

public val FontChooserDialog.asBin: Bin
  get() = reinterpret()

public val FontChooserDialog.asWindow: Window
  get() = reinterpret()

public val FontChooserDialog.asDialog: Dialog
  get() = reinterpret()
