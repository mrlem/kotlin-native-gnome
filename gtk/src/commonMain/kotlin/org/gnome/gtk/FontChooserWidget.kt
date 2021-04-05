package org.gnome.gtk

import gtk3.GtkFontChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FontChooserWidget = CPointer<GtkFontChooserWidget>

public val FontChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontChooserWidget.asWidget: Widget
  get() = reinterpret()

public val FontChooserWidget.asContainer: Container
  get() = reinterpret()

public val FontChooserWidget.asBox: Box
  get() = reinterpret()
