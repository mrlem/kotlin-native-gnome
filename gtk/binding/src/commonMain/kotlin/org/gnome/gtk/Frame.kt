// TODO - get_label_align
// TODO - get_shadow_type
// TODO - set_shadow_type
//
package org.gnome.gtk

import gtk3.GtkFrame
import gtk3.gtk_frame_get_label
import gtk3.gtk_frame_get_label_widget
import gtk3.gtk_frame_set_label
import gtk3.gtk_frame_set_label_align
import gtk3.gtk_frame_set_label_widget
import kotlin.Float
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
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

public fun Frame.getLabel(): String = gtk_frame_get_label(this).toKString

public fun Frame.getLabelWidget(): Widget? = gtk_frame_get_label_widget(this)?.reinterpret()

public fun Frame.setLabel(label: String?): Unit {
  gtk_frame_set_label(this, label)
}

public fun Frame.setLabelAlign(xalign: Float, yalign: Float): Unit {
  gtk_frame_set_label_align(this, xalign, yalign)
}

public fun Frame.setLabelWidget(labelWidget: Widget): Unit {
  gtk_frame_set_label_widget(this, labelWidget.reinterpret())
}
