package org.gnome.gtk

import gtk3.GtkFileChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FileChooserWidget = CPointer<GtkFileChooserWidget>

public val FileChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserWidget.asWidget: Widget
  get() = reinterpret()

public val FileChooserWidget.asContainer: Container
  get() = reinterpret()

public val FileChooserWidget.asBox: Box
  get() = reinterpret()
