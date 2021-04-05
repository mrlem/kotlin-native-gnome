package org.gnome.gtk

import gtk3.GtkDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Dialog = CPointer<GtkDialog>

public val Dialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Dialog.asWidget: Widget
  get() = reinterpret()

public val Dialog.asContainer: Container
  get() = reinterpret()

public val Dialog.asBin: Bin
  get() = reinterpret()

public val Dialog.asWindow: Window
  get() = reinterpret()
