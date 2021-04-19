// TODO - get_accel
// TODO - set_accel
// TODO - set_accel_closure
//
package org.gnome.gtk

import gtk3.GtkAccelLabel
import gtk3.gtk_accel_label_get_accel_widget
import gtk3.gtk_accel_label_get_accel_width
import gtk3.gtk_accel_label_refetch
import gtk3.gtk_accel_label_set_accel_widget
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias AccelLabel = CPointer<GtkAccelLabel>

public val AccelLabel.asObject: Object
  get() = reinterpret()

public val AccelLabel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AccelLabel.asWidget: Widget
  get() = reinterpret()

public val AccelLabel.asMisc: Misc
  get() = reinterpret()

public val AccelLabel.asLabel: Label
  get() = reinterpret()

public fun AccelLabel.getAccelWidget(): Widget? =
    gtk_accel_label_get_accel_widget(this)?.reinterpret()

public fun AccelLabel.getAccelWidth(): UInt = gtk_accel_label_get_accel_width(this)

public fun AccelLabel.refetch(): Boolean = gtk_accel_label_refetch(this).toBoolean

public fun AccelLabel.setAccelWidget(accelWidget: Widget): Unit {
  gtk_accel_label_set_accel_widget(this, accelWidget.reinterpret())
}
