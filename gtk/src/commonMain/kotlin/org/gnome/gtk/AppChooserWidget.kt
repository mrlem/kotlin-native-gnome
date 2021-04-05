package org.gnome.gtk

import gtk3.GtkAppChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias AppChooserWidget = CPointer<GtkAppChooserWidget>

public val AppChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AppChooserWidget.asWidget: Widget
  get() = reinterpret()

public val AppChooserWidget.asContainer: Container
  get() = reinterpret()

public val AppChooserWidget.asBox: Box
  get() = reinterpret()
