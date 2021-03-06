@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFileChooserButton
import interop.gtk_file_chooser_button_get_title
import interop.gtk_file_chooser_button_get_width_chars
import interop.gtk_file_chooser_button_new
import interop.gtk_file_chooser_button_new_with_dialog
import interop.gtk_file_chooser_button_set_title
import interop.gtk_file_chooser_button_set_width_chars
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toKString

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

public object FileChooserButtonFactory {
  public fun new(title: String?, action: FileChooserAction): FileChooserButton =
      gtk_file_chooser_button_new(title, action)!!.reinterpret()

  public fun newWithDialog(dialog: Dialog?): FileChooserButton =
      gtk_file_chooser_button_new_with_dialog(dialog?.reinterpret())!!.reinterpret()
}

public val FileChooserButton.parent: Box
  get() = pointed.parent.ptr

public var FileChooserButton.title: String?
  get() = gtk_file_chooser_button_get_title(this).toKString()
  set(`value`) {
    gtk_file_chooser_button_set_title(this@title, `value`)
  }

public var FileChooserButton.widthChars: Int
  get() = gtk_file_chooser_button_get_width_chars(this)
  set(`value`) {
    gtk_file_chooser_button_set_width_chars(this@widthChars, `value`)
  }

public fun FileChooserButton.onFileSet(callback: (FileChooserButton) -> Unit): FileChooserButton {
  // TODO - handle callback data

  asObject.connect("file-set") { callback(this) }
  return this
}
