package org.gnome.gtk

import gtk3.GtkFontButton
import gtk3.gtk_font_button_get_font_name
import gtk3.gtk_font_button_get_show_size
import gtk3.gtk_font_button_get_show_style
import gtk3.gtk_font_button_get_title
import gtk3.gtk_font_button_get_use_font
import gtk3.gtk_font_button_get_use_size
import gtk3.gtk_font_button_set_font_name
import gtk3.gtk_font_button_set_show_size
import gtk3.gtk_font_button_set_show_style
import gtk3.gtk_font_button_set_title
import gtk3.gtk_font_button_set_use_font
import gtk3.gtk_font_button_set_use_size
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias FontButton = CPointer<GtkFontButton>

public val FontButton.asObject: Object
  get() = reinterpret()

public val FontButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FontButton.asWidget: Widget
  get() = reinterpret()

public val FontButton.asContainer: Container
  get() = reinterpret()

public val FontButton.asBin: Bin
  get() = reinterpret()

public val FontButton.asButton: Button
  get() = reinterpret()

public var FontButton.fontName: String?
  get() = gtk_font_button_get_font_name(this).toKString
  set(`value`) {
    gtk_font_button_set_font_name(this, value)
  }

public var FontButton.showSize: Boolean
  get() = gtk_font_button_get_show_size(this).toBoolean
  set(`value`) {
    gtk_font_button_set_show_size(this, value.toInt)
  }

public var FontButton.showStyle: Boolean
  get() = gtk_font_button_get_show_style(this).toBoolean
  set(`value`) {
    gtk_font_button_set_show_style(this, value.toInt)
  }

public var FontButton.title: String?
  get() = gtk_font_button_get_title(this).toKString
  set(`value`) {
    gtk_font_button_set_title(this, value)
  }

public var FontButton.useFont: Boolean
  get() = gtk_font_button_get_use_font(this).toBoolean
  set(`value`) {
    gtk_font_button_set_use_font(this, value.toInt)
  }

public var FontButton.useSize: Boolean
  get() = gtk_font_button_get_use_size(this).toBoolean
  set(`value`) {
    gtk_font_button_set_use_size(this, value.toInt)
  }