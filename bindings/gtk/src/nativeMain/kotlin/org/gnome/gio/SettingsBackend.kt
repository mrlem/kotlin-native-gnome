// TODO - method: changed (param type)
// TODO - method: changed_tree (param type)
// TODO - method: keys_changed (param type)
// TODO - method: path_changed (param type)
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
