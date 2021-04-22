// TODO - method: get_accel
// TODO - method: set_accel
// TODO - method: set_accel_closure
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAccelLabel
import interop.gtk_accel_label_get_accel_widget
import interop.gtk_accel_label_get_accel_width
import interop.gtk_accel_label_new
import interop.gtk_accel_label_refetch
import interop.gtk_accel_label_set_accel_widget
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
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

public object AccelLabelFactory {
  public fun new(string: String): AccelLabel = gtk_accel_label_new(string)!!.reinterpret()
}

public var AccelLabel.accelWidget: Widget?
  get() = gtk_accel_label_get_accel_widget(this)?.reinterpret()
  set(`value`) {
    gtk_accel_label_set_accel_widget(this, value)
  }

public val AccelLabel.accelWidth: UInt
  get() = gtk_accel_label_get_accel_width(this)

public fun AccelLabel.refetch(): Boolean = gtk_accel_label_refetch(this).toBoolean
