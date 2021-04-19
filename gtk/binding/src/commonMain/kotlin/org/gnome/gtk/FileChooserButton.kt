package org.gnome.gtk

import gtk3.GtkFileChooserButton
import gtk3.gtk_file_chooser_button_get_title
import gtk3.gtk_file_chooser_button_get_width_chars
import gtk3.gtk_file_chooser_button_set_title
import gtk3.gtk_file_chooser_button_set_width_chars
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias FileChooserButton = CPointer<GtkFileChooserButton>

public val FileChooserButton.asObject: Object
  get() = reinterpret()

public val FileChooserButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserButton.asWidget: Widget
  get() = reinterpret()

public val FileChooserButton.asContainer: Container
  get() = reinterpret()

public val FileChooserButton.asBox: Box
  get() = reinterpret()

public fun FileChooserButton.getTitle(): String = gtk_file_chooser_button_get_title(this).toKString

public fun FileChooserButton.getWidthChars(): Int = gtk_file_chooser_button_get_width_chars(this)

public fun FileChooserButton.setTitle(title: String?): Unit {
  gtk_file_chooser_button_set_title(this, title)
}

public fun FileChooserButton.setWidthChars(nChars: Int): Unit {
  gtk_file_chooser_button_set_width_chars(this, nChars)
}
