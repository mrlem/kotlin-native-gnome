@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkVolumeButton
import interop.gtk_volume_button_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias VolumeButton = CPointer<GtkVolumeButton>

public val VolumeButton.asObject: Object
  get() = reinterpret()

public val VolumeButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val VolumeButton.asWidget: Widget
  get() = reinterpret()

public val VolumeButton.asContainer: Container
  get() = reinterpret()

public val VolumeButton.asBin: Bin
  get() = reinterpret()

public val VolumeButton.asButton: Button
  get() = reinterpret()

public val VolumeButton.asScaleButton: ScaleButton
  get() = reinterpret()

public object VolumeButtonFactory {
  public fun new(): VolumeButton = gtk_volume_button_new()!!.reinterpret()
}

public val VolumeButton.parent: ScaleButton
  get() = pointed.parent.ptr
