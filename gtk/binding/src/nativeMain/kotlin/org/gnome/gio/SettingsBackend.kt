// TODO - method: changed
// TODO - method: changed_tree
// TODO - method: keys_changed
// TODO - method: path_changed
// TODO - method: path_writable_changed
// TODO - method: writable_changed
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSettingsBackend
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SettingsBackend = CPointer<GSettingsBackend>

public val SettingsBackend.asObject: Object
  get() = reinterpret()
