package org.gnome.gtk

import gtk3.GtkColorButton
import gtk3.gtk_color_button_get_title
import gtk3.gtk_color_button_set_title
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

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

public fun ColorButton.getTitle(): String = gtk_color_button_get_title(this).toKString

public fun ColorButton.setTitle(title: String?): Unit {
  gtk_color_button_set_title(this, title)
}
