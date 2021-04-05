// TODO - implement:
//   get_expanded
//   get_label
//   get_label_fill
//   get_label_widget
//   get_resize_toplevel
//   get_spacing
//   get_use_markup
//   get_use_underline
//   set_expanded
//   set_label
//   set_label_fill
//   set_label_widget
//   set_resize_toplevel
//   set_spacing
//   set_use_markup
//   set_use_underline
package org.gnome.gtk

import gtk3.GtkExpander
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Expander = CPointer<GtkExpander>

public val Expander.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Expander.asWidget: Widget
  get() = reinterpret()

public val Expander.asContainer: Container
  get() = reinterpret()

public val Expander.asBin: Bin
  get() = reinterpret()
