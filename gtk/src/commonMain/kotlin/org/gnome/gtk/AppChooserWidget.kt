// TODO - implement:
//   get_default_text
//   get_show_all
//   get_show_default
//   get_show_fallback
//   get_show_other
//   get_show_recommended
//   set_default_text
//   set_show_all
//   set_show_default
//   set_show_fallback
//   set_show_other
//   set_show_recommended
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
