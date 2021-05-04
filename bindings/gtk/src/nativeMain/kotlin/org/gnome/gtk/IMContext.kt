// TODO - method: filter_keypress
// TODO - method: get_preedit_string
// TODO - method: get_surrounding
// TODO - method: set_client_window
// TODO - method: set_cursor_location
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIMContext
import interop.gtk_im_context_delete_surrounding
import interop.gtk_im_context_focus_in
import interop.gtk_im_context_focus_out
import interop.gtk_im_context_reset
import interop.gtk_im_context_set_surrounding
import interop.gtk_im_context_set_use_preedit
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias IMContext = CPointer<GtkIMContext>

public val IMContext.asObject: Object
  get() = reinterpret()

public val IMContext.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun IMContext.deleteSurrounding(offset: Int, nChars: Int): Boolean =
    gtk_im_context_delete_surrounding(this@deleteSurrounding, offset, nChars).toBoolean()

public fun IMContext.focusIn(): Unit {
  gtk_im_context_focus_in(this@focusIn)
}

public fun IMContext.focusOut(): Unit {
  gtk_im_context_focus_out(this@focusOut)
}

public fun IMContext.reset(): Unit {
  gtk_im_context_reset(this@reset)
}

public fun IMContext.setSurrounding(
  text: String?,
  len: Int,
  cursorIndex: Int
): Unit {
  gtk_im_context_set_surrounding(this@setSurrounding, text, len, cursorIndex)
}

public fun IMContext.setUsePreedit(usePreedit: Boolean): Unit {
  gtk_im_context_set_use_preedit(this@setUsePreedit, usePreedit.toInt())
}

public fun IMContext.onCommit(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("commit") { callback(this) }
  return this
}

public fun IMContext.onDeleteSurrounding(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("delete-surrounding") { callback(this) }
  return this
}

public fun IMContext.onPreeditChanged(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("preedit-changed") { callback(this) }
  return this
}

public fun IMContext.onPreeditEnd(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("preedit-end") { callback(this) }
  return this
}

public fun IMContext.onPreeditStart(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("preedit-start") { callback(this) }
  return this
}

public fun IMContext.onRetrieveSurrounding(callback: (IMContext) -> Unit): IMContext {
  // TODO - handle callback data

  asObject.connect("retrieve-surrounding") { callback(this) }
  return this
}
