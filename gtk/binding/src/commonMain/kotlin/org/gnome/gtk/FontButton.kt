package org.gnome.gtk

import gtk3.GtkFontButton
import gtk3.gtk_font_button_get_show_size
import gtk3.gtk_font_button_get_show_style
import gtk3.gtk_font_button_get_title
import gtk3.gtk_font_button_get_use_font
import gtk3.gtk_font_button_get_use_size
import gtk3.gtk_font_button_set_show_size
import gtk3.gtk_font_button_set_show_style
import gtk3.gtk_font_button_set_title
import gtk3.gtk_font_button_set_use_font
import gtk3.gtk_font_button_set_use_size
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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

public fun FontButton.getShowSize(): Boolean = gtk_font_button_get_show_size(this).toBoolean

public fun FontButton.getShowStyle(): Boolean = gtk_font_button_get_show_style(this).toBoolean

public fun FontButton.getTitle(): String = gtk_font_button_get_title(this).toKString

public fun FontButton.getUseFont(): Boolean = gtk_font_button_get_use_font(this).toBoolean

public fun FontButton.getUseSize(): Boolean = gtk_font_button_get_use_size(this).toBoolean

public fun FontButton.setShowSize(showSize: Boolean): Unit {
  gtk_font_button_set_show_size(this, showSize.toInt)
}

public fun FontButton.setShowStyle(showStyle: Boolean): Unit {
  gtk_font_button_set_show_style(this, showStyle.toInt)
}

public fun FontButton.setTitle(title: String?): Unit {
  gtk_font_button_set_title(this, title)
}

public fun FontButton.setUseFont(useFont: Boolean): Unit {
  gtk_font_button_set_use_font(this, useFont.toInt)
}

public fun FontButton.setUseSize(useSize: Boolean): Unit {
  gtk_font_button_set_use_size(this, useSize.toInt)
}
