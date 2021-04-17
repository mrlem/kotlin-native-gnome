package org.gnome.gtk

import gtk3.GtkRecentChooserWidget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias RecentChooserWidget = CPointer<GtkRecentChooserWidget>

public val RecentChooserWidget.asObject: Object
  get() = reinterpret()

public val RecentChooserWidget.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RecentChooserWidget.asWidget: Widget
  get() = reinterpret()

public val RecentChooserWidget.asContainer: Container
  get() = reinterpret()

public val RecentChooserWidget.asBox: Box
  get() = reinterpret()
