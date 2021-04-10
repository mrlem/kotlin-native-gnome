// TODO - implement:
//   get_gicon
//   get_icon_name
//   get_icon_set
//   get_stock
//   set_from_animation
//   set_from_file
//   set_from_gicon
//   set_from_icon_name
//   set_from_icon_set
//   set_from_pixbuf
//   set_from_stock
//   set_from_surface
//   set_from_resource
package org.gnome.gtk

import gtk3.GtkImage
import gtk3.gtk_image_clear
import gtk3.gtk_image_get_animation
import gtk3.gtk_image_get_pixbuf
import gtk3.gtk_image_get_pixel_size
import gtk3.gtk_image_get_storage_type
import gtk3.gtk_image_set_pixel_size
import kotlin.Int
import kotlin.Unit
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

public fun Image.clear(): Unit {
  gtk_image_clear(this)
}

public fun Image.getAnimation(): Unit {
  gtk_image_get_animation(this)
}

public fun Image.getPixbuf(): Unit {
  gtk_image_get_pixbuf(this)
}

public fun Image.getStorageType(): Unit {
  gtk_image_get_storage_type(this)
}

public var Image.pixelSize: Int
  get() = gtk_image_get_pixel_size(this)
  set(`value`) {
    gtk_image_set_pixel_size(this, value)
  }
