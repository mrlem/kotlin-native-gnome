package org.gnome.gtk

import gtk3.GtkListBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ListBox = CPointer<GtkListBox>

public val ListBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBox.asWidget: Widget
  get() = reinterpret()

public val ListBox.asContainer: Container
  get() = reinterpret()
