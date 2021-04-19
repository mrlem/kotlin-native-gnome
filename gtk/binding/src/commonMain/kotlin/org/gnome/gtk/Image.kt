// TODO - get_animation
// TODO - get_pixbuf
// TODO - get_storage_type
// TODO - get_animation
// TODO - get_gicon
// TODO - get_icon_name
// TODO - get_pixbuf
// TODO - get_storage_type
// TODO - set_from_animation
// TODO - set_from_gicon
// TODO - set_from_icon_name
// TODO - set_from_pixbuf
// TODO - set_from_surface
//
package org.gnome.gtk

import gtk3.GtkImage
import gtk3.gtk_image_clear
import gtk3.gtk_image_get_pixel_size
import gtk3.gtk_image_set_from_file
import gtk3.gtk_image_set_from_resource
import gtk3.gtk_image_set_pixel_size
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Image = CPointer<GtkImage>

public val Image.asObject: Object
  get() = reinterpret()

public val Image.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Image.asWidget: Widget
  get() = reinterpret()

public val Image.asMisc: Misc
  get() = reinterpret()

public var Image.pixelSize: Int
  get() = gtk_image_get_pixel_size(this)
  set(`value`) {
    gtk_image_set_pixel_size(this, value)
  }

public fun Image.clear(): Unit {
  gtk_image_clear(this)
}

public fun Image.setFromFile(filename: String?): Unit {
  gtk_image_set_from_file(this, filename)
}

public fun Image.setFromResource(resourcePath: String?): Unit {
  gtk_image_set_from_resource(this, resourcePath)
}
