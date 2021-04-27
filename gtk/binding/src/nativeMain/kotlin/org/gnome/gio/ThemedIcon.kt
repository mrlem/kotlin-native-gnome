// TODO - constructor: new
// TODO - constructor: new_from_names
// TODO - constructor: new_with_default_fallbacks
// TODO - method: append_name
// TODO - method: get_names
// TODO - method: prepend_name
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GThemedIcon
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ThemedIcon = CPointer<GThemedIcon>

public val ThemedIcon.asObject: Object
  get() = reinterpret()

public object ThemedIconFactory
