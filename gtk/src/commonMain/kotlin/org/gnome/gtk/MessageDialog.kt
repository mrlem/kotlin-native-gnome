package org.gnome.gtk

import gtk3.GtkMessageDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MessageDialog = CPointer<GtkMessageDialog>

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
