// TODO - method: get_display
// TODO - method: get_selection
// TODO - method: request_contents
// TODO - method: request_image
// TODO - method: request_rich_text
// TODO - method: request_targets
// TODO - method: request_text
// TODO - method: request_uris
// TODO - method: set_can_store
// TODO - method: set_image
// TODO - method: set_with_data
// TODO - method: set_with_owner
// TODO - method: wait_for_contents
// TODO - method: wait_for_image
// TODO - method: wait_for_rich_text
// TODO - method: wait_for_targets
// TODO - method: wait_for_uris
// TODO - method: wait_is_target_available
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkClipboard
import interop.gtk_clipboard_clear
import interop.gtk_clipboard_get_owner
import interop.gtk_clipboard_set_text
import interop.gtk_clipboard_store
import interop.gtk_clipboard_wait_for_text
import interop.gtk_clipboard_wait_is_image_available
import interop.gtk_clipboard_wait_is_rich_text_available
import interop.gtk_clipboard_wait_is_text_available
import interop.gtk_clipboard_wait_is_uris_available
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()

public val Clipboard.owner: Object?
  get() = gtk_clipboard_get_owner(this)?.reinterpret()

public fun Clipboard.clear(): Unit {
  gtk_clipboard_clear(this)
}

public fun Clipboard.setText(text: String, len: Int): Unit {
  gtk_clipboard_set_text(this, text, len)
}

public fun Clipboard.store(): Unit {
  gtk_clipboard_store(this)
}

public fun Clipboard.waitForText(): String = gtk_clipboard_wait_for_text(this).toKString

public fun Clipboard.waitIsImageAvailable(): Boolean =
    gtk_clipboard_wait_is_image_available(this).toBoolean

public fun Clipboard.waitIsRichTextAvailable(buffer: TextBuffer?): Boolean =
    gtk_clipboard_wait_is_rich_text_available(this, buffer?.reinterpret()).toBoolean

public fun Clipboard.waitIsTextAvailable(): Boolean =
    gtk_clipboard_wait_is_text_available(this).toBoolean

public fun Clipboard.waitIsUrisAvailable(): Boolean =
    gtk_clipboard_wait_is_uris_available(this).toBoolean

public fun Clipboard.onOwnerChange(callback: (Clipboard) -> Unit): Clipboard {
  // TODO - handle callback data

  asObject.connect("owner-change") { callback(this) }
  return this
}
