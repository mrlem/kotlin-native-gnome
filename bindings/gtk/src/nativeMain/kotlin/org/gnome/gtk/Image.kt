// TODO - constructor: new_from_icon_set
// TODO - constructor: new_from_stock
// TODO - constructor: new_from_surface
// TODO - method: get_gicon (param type)
// TODO - method: get_icon_name (param type)
// TODO - method: set_from_surface (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkImage
import interop.gtk_image_clear
import interop.gtk_image_get_animation
import interop.gtk_image_get_pixbuf
import interop.gtk_image_get_pixel_size
import interop.gtk_image_get_storage_type
import interop.gtk_image_new
import interop.gtk_image_new_from_animation
import interop.gtk_image_new_from_file
import interop.gtk_image_new_from_gicon
import interop.gtk_image_new_from_icon_name
import interop.gtk_image_new_from_pixbuf
import interop.gtk_image_new_from_resource
import interop.gtk_image_set_from_animation
import interop.gtk_image_set_from_file
import interop.gtk_image_set_from_gicon
import interop.gtk_image_set_from_icon_name
import interop.gtk_image_set_from_pixbuf
import interop.gtk_image_set_from_resource
import interop.gtk_image_set_pixel_size
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdkpixbuf.Pixbuf
import org.gnome.gdkpixbuf.PixbufAnimation
import org.gnome.gio.Icon
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

public object ImageFactory {
  public fun new(): Image = gtk_image_new()!!.reinterpret()

  public fun newFromAnimation(animation: PixbufAnimation?): Image =
      gtk_image_new_from_animation(animation?.reinterpret())!!.reinterpret()

  public fun newFromFile(filename: String?): Image =
      gtk_image_new_from_file(filename)!!.reinterpret()

  public fun newFromGicon(icon: Icon?, size: IconSize): Image =
      gtk_image_new_from_gicon(icon?.reinterpret(), size)!!.reinterpret()

  public fun newFromIconName(iconName: String?, size: IconSize): Image =
      gtk_image_new_from_icon_name(iconName, size)!!.reinterpret()

  public fun newFromPixbuf(pixbuf: Pixbuf?): Image =
      gtk_image_new_from_pixbuf(pixbuf?.reinterpret())!!.reinterpret()

  public fun newFromResource(resourcePath: String?): Image =
      gtk_image_new_from_resource(resourcePath)!!.reinterpret()
}

public val Image.misc: Misc
  get() = pointed.misc.ptr

public val Image.animation: PixbufAnimation?
  get() = gtk_image_get_animation(this)?.reinterpret()

public val Image.pixbuf: Pixbuf?
  get() = gtk_image_get_pixbuf(this)?.reinterpret()

public var Image.pixelSize: Int
  get() = gtk_image_get_pixel_size(this)
  set(`value`) {
    gtk_image_set_pixel_size(this@pixelSize, `value`)
  }

public val Image.storageType: ImageType
  get() = gtk_image_get_storage_type(this)

public fun Image.clear(): Unit {
  gtk_image_clear(this@clear)
}

public fun Image.setFromAnimation(animation: PixbufAnimation?): Unit {
  gtk_image_set_from_animation(this@setFromAnimation, animation?.reinterpret())
}

public fun Image.setFromFile(filename: String?): Unit {
  gtk_image_set_from_file(this@setFromFile, filename)
}

public fun Image.setFromGicon(icon: Icon?, size: IconSize): Unit {
  gtk_image_set_from_gicon(this@setFromGicon, icon?.reinterpret(), size)
}

public fun Image.setFromIconName(iconName: String?, size: IconSize): Unit {
  gtk_image_set_from_icon_name(this@setFromIconName, iconName, size)
}

public fun Image.setFromPixbuf(pixbuf: Pixbuf?): Unit {
  gtk_image_set_from_pixbuf(this@setFromPixbuf, pixbuf?.reinterpret())
}

public fun Image.setFromResource(resourcePath: String?): Unit {
  gtk_image_set_from_resource(this@setFromResource, resourcePath)
}
