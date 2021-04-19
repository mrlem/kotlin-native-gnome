package org.gnome.gtk

import gtk3.GtkVolumeButton
import kotlinx.cinterop.CPointer
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
