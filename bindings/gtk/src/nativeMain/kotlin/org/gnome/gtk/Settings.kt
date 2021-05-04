@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSettings
import interop.gtk_settings_reset_property
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Settings = CPointer<GtkSettings>

public val Settings.asObject: Object
  get() = reinterpret()

public val Settings.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun Settings.resetProperty(name: String?): Unit {
  gtk_settings_reset_property(this@resetProperty, name)
}
