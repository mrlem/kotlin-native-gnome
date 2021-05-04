// TODO - method: add_virtual_modifiers
// TODO - method: get_direction
// TODO - method: get_entries_for_keycode
// TODO - method: get_entries_for_keyval
// TODO - method: get_modifier_mask
// TODO - method: lookup_key
// TODO - method: map_virtual_modifiers
// TODO - method: translate_keyboard_state
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkKeymap
import interop.gdk_keymap_get_caps_lock_state
import interop.gdk_keymap_get_modifier_state
import interop.gdk_keymap_get_num_lock_state
import interop.gdk_keymap_get_scroll_lock_state
import interop.gdk_keymap_have_bidi_layouts
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Keymap = CPointer<GdkKeymap>

public val Keymap.asObject: Object
  get() = reinterpret()

public val Keymap.capsLockState: Boolean
  get() = gdk_keymap_get_caps_lock_state(this).toBoolean()

public val Keymap.modifierState: UInt
  get() = gdk_keymap_get_modifier_state(this)

public val Keymap.numLockState: Boolean
  get() = gdk_keymap_get_num_lock_state(this).toBoolean()

public val Keymap.scrollLockState: Boolean
  get() = gdk_keymap_get_scroll_lock_state(this).toBoolean()

public fun Keymap.haveBidiLayouts(): Boolean =
    gdk_keymap_have_bidi_layouts(this@haveBidiLayouts).toBoolean()

public fun Keymap.onDirectionChanged(callback: (Keymap) -> Unit): Keymap {
  // TODO - handle callback data

  asObject.connect("direction-changed") { callback(this) }
  return this
}

public fun Keymap.onKeysChanged(callback: (Keymap) -> Unit): Keymap {
  // TODO - handle callback data

  asObject.connect("keys-changed") { callback(this) }
  return this
}

public fun Keymap.onStateChanged(callback: (Keymap) -> Unit): Keymap {
  // TODO - handle callback data

  asObject.connect("state-changed") { callback(this) }
  return this
}