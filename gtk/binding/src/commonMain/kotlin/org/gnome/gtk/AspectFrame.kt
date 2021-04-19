package org.gnome.gtk

import gtk3.GtkAspectFrame
import gtk3.gtk_aspect_frame_set
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toInt

public typealias AspectFrame = CPointer<GtkAspectFrame>

public val AspectFrame.asObject: Object
  get() = reinterpret()

public val AspectFrame.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AspectFrame.asWidget: Widget
  get() = reinterpret()

public val AspectFrame.asContainer: Container
  get() = reinterpret()

public val AspectFrame.asBin: Bin
  get() = reinterpret()

public val AspectFrame.asFrame: Frame
  get() = reinterpret()

public fun AspectFrame.`set`(
  xalign: Float,
  yalign: Float,
  ratio: Float,
  obeyChild: Boolean
): Unit {
  gtk_aspect_frame_set(this, xalign, yalign, ratio, obeyChild.toInt)
}
