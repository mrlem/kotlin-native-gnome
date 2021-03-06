@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkStack
import interop.gtk_stack_add_named
import interop.gtk_stack_add_titled
import interop.gtk_stack_get_child_by_name
import interop.gtk_stack_get_hhomogeneous
import interop.gtk_stack_get_homogeneous
import interop.gtk_stack_get_interpolate_size
import interop.gtk_stack_get_transition_duration
import interop.gtk_stack_get_transition_running
import interop.gtk_stack_get_transition_type
import interop.gtk_stack_get_vhomogeneous
import interop.gtk_stack_get_visible_child
import interop.gtk_stack_get_visible_child_name
import interop.gtk_stack_new
import interop.gtk_stack_set_hhomogeneous
import interop.gtk_stack_set_homogeneous
import interop.gtk_stack_set_interpolate_size
import interop.gtk_stack_set_transition_duration
import interop.gtk_stack_set_transition_type
import interop.gtk_stack_set_vhomogeneous
import interop.gtk_stack_set_visible_child
import interop.gtk_stack_set_visible_child_full
import interop.gtk_stack_set_visible_child_name
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias Stack = CPointer<GtkStack>

public val Stack.asObject: Object
  get() = reinterpret()

public val Stack.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Stack.asWidget: Widget
  get() = reinterpret()

public val Stack.asContainer: Container
  get() = reinterpret()

public object StackFactory {
  public fun new(): Stack = gtk_stack_new()!!.reinterpret()
}

public val Stack.parentInstance: Container
  get() = pointed.parent_instance.ptr

public var Stack.hhomogeneous: Boolean
  get() = gtk_stack_get_hhomogeneous(this).toBoolean()
  set(`value`) {
    gtk_stack_set_hhomogeneous(this@hhomogeneous, `value`.toInt())
  }

public var Stack.homogeneous: Boolean
  get() = gtk_stack_get_homogeneous(this).toBoolean()
  set(`value`) {
    gtk_stack_set_homogeneous(this@homogeneous, `value`.toInt())
  }

public var Stack.interpolateSize: Boolean
  get() = gtk_stack_get_interpolate_size(this).toBoolean()
  set(`value`) {
    gtk_stack_set_interpolate_size(this@interpolateSize, `value`.toInt())
  }

public var Stack.transitionDuration: UInt
  get() = gtk_stack_get_transition_duration(this)
  set(`value`) {
    gtk_stack_set_transition_duration(this@transitionDuration, `value`)
  }

public val Stack.transitionRunning: Boolean
  get() = gtk_stack_get_transition_running(this).toBoolean()

public var Stack.transitionType: StackTransitionType
  get() = gtk_stack_get_transition_type(this)
  set(`value`) {
    gtk_stack_set_transition_type(this@transitionType, `value`)
  }

public var Stack.vhomogeneous: Boolean
  get() = gtk_stack_get_vhomogeneous(this).toBoolean()
  set(`value`) {
    gtk_stack_set_vhomogeneous(this@vhomogeneous, `value`.toInt())
  }

public var Stack.visibleChild: Widget?
  get() = gtk_stack_get_visible_child(this)?.reinterpret()
  set(`value`) {
    gtk_stack_set_visible_child(this@visibleChild, `value`)
  }

public var Stack.visibleChildName: String?
  get() = gtk_stack_get_visible_child_name(this).toKString()
  set(`value`) {
    gtk_stack_set_visible_child_name(this@visibleChildName, `value`)
  }

public fun Stack.addNamed(child: Widget?, name: String?): Unit {
  gtk_stack_add_named(this@addNamed, child?.reinterpret(), name)
}

public fun Stack.addTitled(
  child: Widget?,
  name: String?,
  title: String?
): Unit {
  gtk_stack_add_titled(this@addTitled, child?.reinterpret(), name, title)
}

public fun Stack.getChildByName(name: String?): Widget? =
    gtk_stack_get_child_by_name(this@getChildByName, name)?.reinterpret()

public fun Stack.setVisibleChildFull(name: String?, transition: StackTransitionType): Unit {
  gtk_stack_set_visible_child_full(this@setVisibleChildFull, name, transition)
}
