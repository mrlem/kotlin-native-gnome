// TODO - get_display
// TODO - get_owner
// TODO - get_selection
// TODO - get_display
// TODO - get_owner
// TODO - get_selection
// TODO - request_contents
// TODO - request_image
// TODO - request_rich_text
// TODO - request_targets
// TODO - request_text
// TODO - request_uris
// TODO - set_can_store
// TODO - set_image
// TODO - set_with_data
// TODO - set_with_owner
// TODO - wait_for_contents
// TODO - wait_for_image
// TODO - wait_for_rich_text
// TODO - wait_for_targets
// TODO - wait_for_uris
// TODO - wait_is_target_available
//
package org.gnome.gtk

import gtk3.GtkClipboard
import gtk3.gtk_clipboard_clear
import gtk3.gtk_clipboard_set_text
import gtk3.gtk_clipboard_store
import gtk3.gtk_clipboard_wait_for_text
import gtk3.gtk_clipboard_wait_is_image_available
import gtk3.gtk_clipboard_wait_is_rich_text_available
import gtk3.gtk_clipboard_wait_is_text_available
import gtk3.gtk_clipboard_wait_is_uris_available
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()

public fun Clipboard.clear(): Unit {
  gtk_clipboard_clear(this)
}

public fun Clipboard.setText(text: String?, len: Int): Unit {
  gtk_clipboard_set_text(this, text, len)
}

public fun Clipboard.store(): Unit {
  gtk_clipboard_store(this)
}

public fun Clipboard.waitForText(): String = gtk_clipboard_wait_for_text(this).toKString

public fun Clipboard.waitIsImageAvailable(): Boolean =
    gtk_clipboard_wait_is_image_available(this).toBoolean

public fun Clipboard.waitIsRichTextAvailable(buffer: TextBuffer): Boolean =
    gtk_clipboard_wait_is_rich_text_available(this, buffer.reinterpret()).toBoolean

public fun Clipboard.waitIsTextAvailable(): Boolean =
    gtk_clipboard_wait_is_text_available(this).toBoolean

public fun Clipboard.waitIsUrisAvailable(): Boolean =
    gtk_clipboard_wait_is_uris_available(this).toBoolean
