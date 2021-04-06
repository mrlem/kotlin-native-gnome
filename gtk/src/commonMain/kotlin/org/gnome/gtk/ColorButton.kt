// TODO - implement:
//   get_color
//   get_rgba
//   set_color
//   set_rgba
package org.gnome.gtk

import gtk3.GtkColorButton
import gtk3.gtk_color_button_get_alpha
import gtk3.gtk_color_button_get_title
import gtk3.gtk_color_button_get_use_alpha
import gtk3.gtk_color_button_set_alpha
import gtk3.gtk_color_button_set_title
import gtk3.gtk_color_button_set_use_alpha
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.convert
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias ColorButton = CPointer<GtkColorButton>

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

public var ColorButton.alpha: UInt
  get() = gtk_color_button_get_alpha(this).convert()
  set(`value`) {
    gtk_color_button_set_alpha(this, value.convert())
  }

public var ColorButton.title: String?
  get() = gtk_color_button_get_title(this).toKString
  set(`value`) {
    gtk_color_button_set_title(this, value)
  }

public var ColorButton.useAlpha: Boolean
  get() = gtk_color_button_get_use_alpha(this).toBoolean
  set(`value`) {
    gtk_color_button_set_use_alpha(this, value.toInt)
  }
