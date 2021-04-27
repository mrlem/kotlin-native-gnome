@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GNativeVolumeMonitor
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NativeVolumeMonitor = CPointer<GNativeVolumeMonitor>

public val NativeVolumeMonitor.asObject: Object
  get() = reinterpret()

public val NativeVolumeMonitor.asVolumeMonitor: VolumeMonitor
  get() = reinterpret()
