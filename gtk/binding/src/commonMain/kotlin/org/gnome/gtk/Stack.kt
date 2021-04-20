@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

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
import gtk3.gtk_stack_get_transition_type
import gtk3.gtk_stack_get_vhomogeneous
import gtk3.gtk_stack_get_visible_child
import gtk3.gtk_stack_get_visible_child_name
import gtk3.gtk_stack_set_hhomogeneous
import gtk3.gtk_stack_set_homogeneous
import gtk3.gtk_stack_set_interpolate_size
import gtk3.gtk_stack_set_transition_duration
import gtk3.gtk_stack_set_transition_type
import gtk3.gtk_stack_set_vhomogeneous
import gtk3.gtk_stack_set_visible_child
import gtk3.gtk_stack_set_visible_child_full
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

public var Stack.hhomogeneous: Boolean
  get() = gtk_stack_get_hhomogeneous(this).toBoolean
  set(`value`) {
    gtk_stack_set_hhomogeneous(this, value.toInt)
  }

public var Stack.homogeneous: Boolean
  get() = gtk_stack_get_homogeneous(this).toBoolean
  set(`value`) {
    gtk_stack_set_homogeneous(this, value.toInt)
  }

public var Stack.interpolateSize: Boolean
  get() = gtk_stack_get_interpolate_size(this).toBoolean
  set(`value`) {
    gtk_stack_set_interpolate_size(this, value.toInt)
  }

public var Stack.transitionDuration: UInt
  get() = gtk_stack_get_transition_duration(this)
  set(`value`) {
    gtk_stack_set_transition_duration(this, value)
  }

public val Stack.transitionRunning: Boolean
  get() = gtk_stack_get_transition_running(this).toBoolean

public var Stack.transitionType: StackTransitionType
  get() = gtk_stack_get_transition_type(this)
  set(`value`) {
    gtk_stack_set_transition_type(this, value)
  }

public var Stack.vhomogeneous: Boolean
  get() = gtk_stack_get_vhomogeneous(this).toBoolean
  set(`value`) {
    gtk_stack_set_vhomogeneous(this, value.toInt)
  }

public var Stack.visibleChild: Widget?
  get() = gtk_stack_get_visible_child(this)?.reinterpret()
  set(`value`) {
    gtk_stack_set_visible_child(this, value)
  }

public var Stack.visibleChildName: String
  get() = gtk_stack_get_visible_child_name(this).toKString
  set(`value`) {
    gtk_stack_set_visible_child_name(this, value)
  }

public fun Stack.addNamed(child: Widget?, name: String): Unit {
  gtk_stack_add_named(this, child?.reinterpret(), name)
}

public fun Stack.addTitled(
  child: Widget?,
  name: String,
  title: String
): Unit {
  gtk_stack_add_titled(this, child?.reinterpret(), name, title)
}

public fun Stack.getChildByName(name: String): Widget? = gtk_stack_get_child_by_name(this,
    name)?.reinterpret()

public fun Stack.setVisibleChildFull(name: String, transition: StackTransitionType): Unit {
  gtk_stack_set_visible_child_full(this, name, transition)
}
