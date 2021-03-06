@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAspectFrame
import interop.gtk_aspect_frame_new
import interop.gtk_aspect_frame_set
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toInt

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

public object AspectFrameFactory {
  public fun new(
    label: String?,
    xalign: Float,
    yalign: Float,
    ratio: Float,
    obeyChild: Boolean
  ): AspectFrame = gtk_aspect_frame_new(label, xalign, yalign, ratio,
      obeyChild.toInt())!!.reinterpret()
}

public val AspectFrame.frame: Frame
  get() = pointed.frame.ptr

public fun AspectFrame.`set`(
  xalign: Float,
  yalign: Float,
  ratio: Float,
  obeyChild: Boolean
): Unit {
  gtk_aspect_frame_set(this@`set`, xalign, yalign, ratio, obeyChild.toInt())
}
