// TODO - constructor: new_with_color
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkColorButton
import interop.gtk_color_button_get_title
import interop.gtk_color_button_new
import interop.gtk_color_button_new_with_rgba
import interop.gtk_color_button_set_title
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.RGBA
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toKString

public typealias ColorButton = CPointer<GtkColorButton>

public val ColorButton.asObject: Object
  get() = reinterpret()

public val ColorButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ColorButton.asWidget: Widget
  get() = reinterpret()

public val ColorButton.asContainer: Container
  get() = reinterpret()

public val ColorButton.asBin: Bin
  get() = reinterpret()

public val ColorButton.asButton: Button
  get() = reinterpret()

public object ColorButtonFactory {
  public fun new(): ColorButton = gtk_color_button_new()!!.reinterpret()

  public fun newWithRgba(rgba: RGBA?): ColorButton =
      gtk_color_button_new_with_rgba(rgba?.reinterpret())!!.reinterpret()
}

public val ColorButton.button: Button
  get() = pointed.button.ptr

public var ColorButton.title: String?
  get() = gtk_color_button_get_title(this).toKString()
  set(`value`) {
    gtk_color_button_set_title(this@title, `value`)
  }

public fun ColorButton.onColorSet(callback: (ColorButton) -> Unit): ColorButton {
  // TODO - handle callback data

  asObject.connect("color-set") { callback(this) }
  return this
}
