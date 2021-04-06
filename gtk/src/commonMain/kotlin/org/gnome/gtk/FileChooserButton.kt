package org.gnome.gtk

import gtk3.GtkFileChooserButton
import gtk3.gtk_file_chooser_button_get_focus_on_click
import gtk3.gtk_file_chooser_button_get_title
import gtk3.gtk_file_chooser_button_get_width_chars
import gtk3.gtk_file_chooser_button_set_focus_on_click
import gtk3.gtk_file_chooser_button_set_title
import gtk3.gtk_file_chooser_button_set_width_chars
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias FileChooserButton = CPointer<GtkFileChooserButton>

public val FileChooserButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val FileChooserButton.asWidget: Widget
  get() = reinterpret()

public val FileChooserButton.asContainer: Container
  get() = reinterpret()

public val FileChooserButton.asBox: Box
  get() = reinterpret()

public var FileChooserButton.focusOnClick: Boolean
  get() = gtk_file_chooser_button_get_focus_on_click(this).toBoolean
  set(`value`) {
    gtk_file_chooser_button_set_focus_on_click(this, value.toInt)
  }

public var FileChooserButton.title: String?
  get() = gtk_file_chooser_button_get_title(this).toKString
  set(`value`) {
    gtk_file_chooser_button_set_title(this, value)
  }

public var FileChooserButton.widthChars: Int
  get() = gtk_file_chooser_button_get_width_chars(this)
  set(`value`) {
    gtk_file_chooser_button_set_width_chars(this, value)
  }
