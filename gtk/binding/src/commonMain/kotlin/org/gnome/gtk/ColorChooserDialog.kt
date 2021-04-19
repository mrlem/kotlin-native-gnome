package org.gnome.gtk

import gtk3.GtkColorChooserDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias ColorChooserDialog = CPointer<GtkColorChooserDialog>

public val ColorChooserDialog.asObject: Object
  get() = reinterpret()

public val ColorChooserDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ColorChooserDialog.asWidget: Widget
  get() = reinterpret()

public val ColorChooserDialog.asContainer: Container
  get() = reinterpret()

public val ColorChooserDialog.asBin: Bin
  get() = reinterpret()

public val ColorChooserDialog.asWindow: Window
  get() = reinterpret()

public val ColorChooserDialog.asDialog: Dialog
  get() = reinterpret()
