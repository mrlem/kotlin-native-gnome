// TODO - implement:
//   get_label
//   get_label_align
//   get_label_widget
//   get_shadow_type
//   set_label
//   set_label_align
//   set_label_widget
//   set_shadow_type
package org.gnome.gtk

import gtk3.GtkFrame
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Frame = CPointer<GtkFrame>

public val Frame.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Frame.asWidget: Widget
  get() = reinterpret()

public val Frame.asContainer: Container
  get() = reinterpret()

public val Frame.asBin: Bin
  get() = reinterpret()
