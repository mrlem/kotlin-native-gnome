// TODO - method: get_display
// TODO - method: get_selection
// TODO - method: request_contents
// TODO - method: request_image
// TODO - method: request_rich_text
// TODO - method: request_targets
// TODO - method: request_text
// TODO - method: request_uris
// TODO - method: set_image
// TODO - method: set_with_data
// TODO - method: wait_for_contents
// TODO - method: wait_for_image
// TODO - method: wait_for_rich_text
// TODO - method: wait_for_targets
// TODO - method: wait_is_target_available
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkClipboard
import interop.gtk_clipboard_clear
import interop.gtk_clipboard_get_owner
import interop.gtk_clipboard_set_can_store
import interop.gtk_clipboard_set_text
import interop.gtk_clipboard_set_with_owner
import interop.gtk_clipboard_store
import interop.gtk_clipboard_wait_for_text
import interop.gtk_clipboard_wait_for_uris
import interop.gtk_clipboard_wait_is_image_available
import interop.gtk_clipboard_wait_is_rich_text_available
import interop.gtk_clipboard_wait_is_text_available
import interop.gtk_clipboard_wait_is_uris_available
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toCArray
import org.gnome.toKArray
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Clipboard = CPointer<GtkClipboard>

public val Clipboard.asObject: Object
  get() = reinterpret()

public val Clipboard.owner: Object?
  get() = gtk_clipboard_get_owner(this)?.reinterpret()

public fun Clipboard.clear(): Unit {
  gtk_clipboard_clear(this@clear)
}

public fun Clipboard.setCanStore(targets: Array<TargetEntry>?, nTargets: Int): Unit {
  memScoped { gtk_clipboard_set_can_store(this@setCanStore, targets?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), nTargets) }
}

public fun Clipboard.setText(text: String?, len: Int): Unit {
  gtk_clipboard_set_text(this@setText, text, len)
}

public fun Clipboard.setWithOwner(
  targets: Array<TargetEntry>?,
  nTargets: UInt,
  getFunc: ClipboardGetFunc?,
  clearFunc: ClipboardClearFunc?,
  owner: Object?
): Boolean = memScoped { gtk_clipboard_set_with_owner(this@setWithOwner, targets?.map { it.pointed
    }?.toTypedArray()?.toCArray(memScope), nTargets, getFunc?.reinterpret(),
    clearFunc?.reinterpret(), owner?.reinterpret()).toBoolean() }

public fun Clipboard.store(): Unit {
  gtk_clipboard_store(this@store)
}

public fun Clipboard.waitForText(): String? =
    gtk_clipboard_wait_for_text(this@waitForText).toKString()

public fun Clipboard.waitForUris(): Array<String>? =
    gtk_clipboard_wait_for_uris(this@waitForUris)?.toKArray { it.toKString()!! }

public fun Clipboard.waitIsImageAvailable(): Boolean =
    gtk_clipboard_wait_is_image_available(this@waitIsImageAvailable).toBoolean()

public fun Clipboard.waitIsRichTextAvailable(buffer: TextBuffer?): Boolean =
    gtk_clipboard_wait_is_rich_text_available(this@waitIsRichTextAvailable,
    buffer?.reinterpret()).toBoolean()

public fun Clipboard.waitIsTextAvailable(): Boolean =
    gtk_clipboard_wait_is_text_available(this@waitIsTextAvailable).toBoolean()

public fun Clipboard.waitIsUrisAvailable(): Boolean =
    gtk_clipboard_wait_is_uris_available(this@waitIsUrisAvailable).toBoolean()

public fun Clipboard.onOwnerChange(callback: (Clipboard) -> Unit): Clipboard {
  // TODO - handle callback data

  asObject.connect("owner-change") { callback(this) }
  return this
}
