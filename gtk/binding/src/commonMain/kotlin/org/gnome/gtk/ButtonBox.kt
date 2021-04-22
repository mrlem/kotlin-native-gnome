@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkButtonBox
import gtk3.gtk_button_box_get_child_non_homogeneous
import gtk3.gtk_button_box_get_child_secondary
import gtk3.gtk_button_box_get_layout
import gtk3.gtk_button_box_new
import gtk3.gtk_button_box_set_child_non_homogeneous
import gtk3.gtk_button_box_set_child_secondary
import gtk3.gtk_button_box_set_layout
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ButtonBox = CPointer<GtkButtonBox>

public val ButtonBox.asObject: Object
  get() = reinterpret()

public val ButtonBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ButtonBox.asWidget: Widget
  get() = reinterpret()

public val ButtonBox.asContainer: Container
  get() = reinterpret()

public val ButtonBox.asBox: Box
  get() = reinterpret()

public object ButtonBoxFactory {
  public fun new(orientation: Orientation): ButtonBox =
      gtk_button_box_new(orientation)!!.reinterpret()
}

public var ButtonBox.layout: ButtonBoxStyle
  get() = gtk_button_box_get_layout(this)
  set(`value`) {
    gtk_button_box_set_layout(this, value)
  }

public fun ButtonBox.getChildNonHomogeneous(child: Widget?): Boolean =
    gtk_button_box_get_child_non_homogeneous(this, child?.reinterpret()).toBoolean

public fun ButtonBox.getChildSecondary(child: Widget?): Boolean =
    gtk_button_box_get_child_secondary(this, child?.reinterpret()).toBoolean

public fun ButtonBox.setChildNonHomogeneous(child: Widget?, nonHomogeneous: Boolean): Unit {
  gtk_button_box_set_child_non_homogeneous(this, child?.reinterpret(), nonHomogeneous.toInt)
}

public fun ButtonBox.setChildSecondary(child: Widget?, isSecondary: Boolean): Unit {
  gtk_button_box_set_child_secondary(this, child?.reinterpret(), isSecondary.toInt)
}
