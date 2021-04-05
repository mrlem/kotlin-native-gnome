package org.gnome.gtk

import gtk3.GtkTreeView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias TreeView = CPointer<GtkTreeView>

public val TreeView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TreeView.asWidget: Widget
  get() = reinterpret()

public val TreeView.asContainer: Container
  get() = reinterpret()
