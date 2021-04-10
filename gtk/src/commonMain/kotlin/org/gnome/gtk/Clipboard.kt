// TODO - implement:
//   request_contents
//   request_image
//   request_rich_text
//   request_targets
//   request_text
//   request_uris
//   set_can_store
//   set_image
//   set_text
//   set_with_data
//   set_with_owner
//   wait_for_contents
//   wait_for_rich_text
//   wait_for_targets
//   wait_is_rich_text_available
//   wait_is_target_available
package org.gnome.gtk

import gtk3.GtkClipboard
import gtk3.gtk_clipboard_clear
import gtk3.gtk_clipboard_get_display
import gtk3.gtk_clipboard_get_owner
import gtk3.gtk_clipboard_get_selection
import gtk3.gtk_clipboard_store
import gtk3.gtk_clipboard_wait_for_image
import gtk3.gtk_clipboard_wait_for_text
import gtk3.gtk_clipboard_wait_for_uris
import gtk3.gtk_clipboard_wait_is_image_available
import gtk3.gtk_clipboard_wait_is_text_available
import gtk3.gtk_clipboard_wait_is_uris_available
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toKString

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()

public fun Clipboard.clear(): Unit {
  gtk_clipboard_clear(this)
}

public fun Clipboard.getDisplay(): Unit {
  gtk_clipboard_get_display(this)
}

public fun Clipboard.getOwner(): Unit {
  gtk_clipboard_get_owner(this)
}

public fun Clipboard.getSelection(): Unit {
  gtk_clipboard_get_selection(this)
}

public fun Clipboard.store(): Unit {
  gtk_clipboard_store(this)
}

public fun Clipboard.waitForImage(): Unit {
  gtk_clipboard_wait_for_image(this)
}

public fun Clipboard.waitForText(): String? = gtk_clipboard_wait_for_text(this).toKString

public fun Clipboard.waitForUris(): Unit {
  gtk_clipboard_wait_for_uris(this)
}

public fun Clipboard.waitIsImageAvailable(): Boolean =
    gtk_clipboard_wait_is_image_available(this).toBoolean

public fun Clipboard.waitIsTextAvailable(): Boolean =
    gtk_clipboard_wait_is_text_available(this).toBoolean

public fun Clipboard.waitIsUrisAvailable(): Boolean =
    gtk_clipboard_wait_is_uris_available(this).toBoolean
