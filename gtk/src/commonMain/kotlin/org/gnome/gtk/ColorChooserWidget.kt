package org.gnome.gtk

import gtk3.GtkColorChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ColorChooserWidget = CPointer<GtkColorChooserWidget>

public val ColorChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ColorChooserWidget.asWidget: Widget
  get() = reinterpret()

public val ColorChooserWidget.asContainer: Container
  get() = reinterpret()

public val ColorChooserWidget.asBox: Box
  get() = reinterpret()
