package org.gnome.gtk

import gtk3.GtkNotebook
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Notebook = CPointer<GtkNotebook>

public val Notebook.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Notebook.asWidget: Widget
  get() = reinterpret()

public val Notebook.asContainer: Container
  get() = reinterpret()
