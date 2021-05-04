// TODO - method: get_label_align (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFrame
import interop.gtk_frame_get_label
import interop.gtk_frame_get_label_widget
import interop.gtk_frame_get_shadow_type
import interop.gtk_frame_new
import interop.gtk_frame_set_label
import interop.gtk_frame_set_label_align
import interop.gtk_frame_set_label_widget
import interop.gtk_frame_set_shadow_type
import kotlin.Float
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias Frame = CPointer<GtkFrame>

public val Frame.asObject: Object
  get() = reinterpret()

public val Frame.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Frame.asWidget: Widget
  get() = reinterpret()

public val Frame.asContainer: Container
  get() = reinterpret()

public val Frame.asBin: Bin
  get() = reinterpret()

public object FrameFactory {
  public fun new(label: String?): Frame = gtk_frame_new(label)!!.reinterpret()
}

public val Frame.bin: Bin
  get() = pointed.bin.ptr

public var Frame.label: String?
  get() = gtk_frame_get_label(this).toKString()
  set(`value`) {
    gtk_frame_set_label(this@label, `value`)
  }

public var Frame.labelWidget: Widget?
  get() = gtk_frame_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_frame_set_label_widget(this@labelWidget, `value`)
  }

public var Frame.shadowType: ShadowType
  get() = gtk_frame_get_shadow_type(this)
  set(`value`) {
    gtk_frame_set_shadow_type(this@shadowType, `value`)
  }

public fun Frame.setLabelAlign(xalign: Float, yalign: Float): Unit {
  gtk_frame_set_label_align(this@setLabelAlign, xalign, yalign)
}
