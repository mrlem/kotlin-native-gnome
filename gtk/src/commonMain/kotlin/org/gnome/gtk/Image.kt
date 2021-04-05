// TODO - implement:
//   clear
//   get_animation
//   get_gicon
//   get_icon_name
//   get_icon_set
//   get_pixbuf
//   get_pixel_size
//   get_stock
//   get_storage_type
//   set_from_animation
//   set_from_file
//   set_from_gicon
//   set_from_icon_name
//   set_from_icon_set
//   set_from_pixbuf
//   set_from_resource
//   set_from_stock
//   set_from_surface
//   set_pixel_size
package org.gnome.gtk

import gtk3.GtkImage
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Image = CPointer<GtkImage>

public val Image.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Image.asWidget: Widget
  get() = reinterpret()

public val Image.asMisc: Misc
  get() = reinterpret()
