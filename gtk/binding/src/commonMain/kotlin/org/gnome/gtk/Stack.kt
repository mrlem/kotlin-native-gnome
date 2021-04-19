// TODO - get_transition_type
// TODO - set_transition_type
// TODO - set_visible_child_full
//
package org.gnome.gtk

import gtk3.GtkStack
import gtk3.gtk_stack_add_named
import gtk3.gtk_stack_add_titled
import gtk3.gtk_stack_get_child_by_name
import gtk3.gtk_stack_get_hhomogeneous
import gtk3.gtk_stack_get_homogeneous
import gtk3.gtk_stack_get_interpolate_size
import gtk3.gtk_stack_get_transition_duration
import gtk3.gtk_stack_get_transition_running
import gtk3.gtk_stack_get_vhomogeneous
import gtk3.gtk_stack_get_visible_child
import gtk3.gtk_stack_get_visible_child_name
import gtk3.gtk_stack_set_hhomogeneous
import gtk3.gtk_stack_set_homogeneous
import gtk3.gtk_stack_set_interpolate_size
import gtk3.gtk_stack_set_transition_duration
import gtk3.gtk_stack_set_vhomogeneous
import gtk3.gtk_stack_set_visible_child
import gtk3.gtk_stack_set_visible_child_name
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Stack = CPointer<GtkStack>

public val Stack.asObject: Object
  get() = reinterpret()

public val Stack.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Stack.asWidget: Widget
  get() = reinterpret()

public val Stack.asContainer: Container
  get() = reinterpret()

public fun Stack.addNamed(child: Widget, name: String?): Unit {
  gtk_stack_add_named(this, child.reinterpret(), name)
}

public fun Stack.addTitled(
  child: Widget,
  name: String?,
  title: String?
): Unit {
  gtk_stack_add_titled(this, child.reinterpret(), name, title)
}

public fun Stack.getChildByName(name: String?): Widget? = gtk_stack_get_child_by_name(this,
    name)?.reinterpret()

public fun Stack.getHhomogeneous(): Boolean = gtk_stack_get_hhomogeneous(this).toBoolean

public fun Stack.getHomogeneous(): Boolean = gtk_stack_get_homogeneous(this).toBoolean

public fun Stack.getInterpolateSize(): Boolean = gtk_stack_get_interpolate_size(this).toBoolean

public fun Stack.getTransitionDuration(): UInt = gtk_stack_get_transition_duration(this)

public fun Stack.getTransitionRunning(): Boolean = gtk_stack_get_transition_running(this).toBoolean

public fun Stack.getVhomogeneous(): Boolean = gtk_stack_get_vhomogeneous(this).toBoolean

public fun Stack.getVisibleChild(): Widget? = gtk_stack_get_visible_child(this)?.reinterpret()

public fun Stack.getVisibleChildName(): String = gtk_stack_get_visible_child_name(this).toKString

public fun Stack.setHhomogeneous(hhomogeneous: Boolean): Unit {
  gtk_stack_set_hhomogeneous(this, hhomogeneous.toInt)
}

public fun Stack.setHomogeneous(homogeneous: Boolean): Unit {
  gtk_stack_set_homogeneous(this, homogeneous.toInt)
}

public fun Stack.setInterpolateSize(interpolateSize: Boolean): Unit {
  gtk_stack_set_interpolate_size(this, interpolateSize.toInt)
}

public fun Stack.setTransitionDuration(duration: UInt): Unit {
  gtk_stack_set_transition_duration(this, duration)
}

public fun Stack.setVhomogeneous(vhomogeneous: Boolean): Unit {
  gtk_stack_set_vhomogeneous(this, vhomogeneous.toInt)
}

public fun Stack.setVisibleChild(child: Widget): Unit {
  gtk_stack_set_visible_child(this, child.reinterpret())
}

public fun Stack.setVisibleChildName(name: String?): Unit {
  gtk_stack_set_visible_child_name(this, name)
}
