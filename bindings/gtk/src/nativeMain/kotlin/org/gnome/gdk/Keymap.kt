// TODO - method: add_virtual_modifiers (param type)
// TODO - method: get_entries_for_keycode (param type)
// TODO - method: get_entries_for_keyval (param type)
// TODO - method: map_virtual_modifiers (param type)
// TODO - method: translate_keyboard_state (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkKeymap
import interop.gdk_keymap_get_caps_lock_state
import interop.gdk_keymap_get_direction
import interop.gdk_keymap_get_modifier_mask
import interop.gdk_keymap_get_modifier_state
import interop.gdk_keymap_get_num_lock_state
import interop.gdk_keymap_get_scroll_lock_state
import interop.gdk_keymap_have_bidi_layouts
import interop.gdk_keymap_lookup_key
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.pango.Direction
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias Keymap = CPointer<GdkKeymap>

public val Keymap.asObject: Object
  get() = reinterpret()

public val Keymap.capsLockState: Boolean
  get() = gdk_keymap_get_caps_lock_state(this).toBoolean()

public val Keymap.direction: Direction
  get() = gdk_keymap_get_direction(this)

public val Keymap.modifierState: UInt
  get() = gdk_keymap_get_modifier_state(this)

public val Keymap.numLockState: Boolean
  get() = gdk_keymap_get_num_lock_state(this).toBoolean()

public val Keymap.scrollLockState: Boolean
  get() = gdk_keymap_get_scroll_lock_state(this).toBoolean()

public fun Keymap.getModifierMask(intent: ModifierIntent): ModifierType =
    gdk_keymap_get_modifier_mask(this@getModifierMask, intent)

public fun Keymap.haveBidiLayouts(): Boolean =
    gdk_keymap_have_bidi_layouts(this@haveBidiLayouts).toBoolean()

public fun Keymap.lookupKey(key: KeymapKey?): UInt = gdk_keymap_lookup_key(this@lookupKey,
    key?.reinterpret())

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
