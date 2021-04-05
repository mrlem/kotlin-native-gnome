package org.gnome.gtk

import gtk3.GtkTreeViewColumn
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias TreeViewColumn = CPointer<GtkTreeViewColumn>

public val TreeViewColumn.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
