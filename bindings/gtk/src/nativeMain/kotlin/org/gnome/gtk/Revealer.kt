@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRevealer
import interop.gtk_revealer_get_child_revealed
import interop.gtk_revealer_get_reveal_child
import interop.gtk_revealer_get_transition_duration
import interop.gtk_revealer_get_transition_type
import interop.gtk_revealer_new
import interop.gtk_revealer_set_reveal_child
import interop.gtk_revealer_set_transition_duration
import interop.gtk_revealer_set_transition_type
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias Revealer = CPointer<GtkRevealer>

public val Revealer.asObject: Object
  get() = reinterpret()

public val Revealer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Revealer.asWidget: Widget
  get() = reinterpret()

public val Revealer.asContainer: Container
  get() = reinterpret()

public val Revealer.asBin: Bin
  get() = reinterpret()

public object RevealerFactory {
  public fun new(): Revealer = gtk_revealer_new()!!.reinterpret()
}

public val Revealer.parentInstance: Bin
  get() = pointed.parent_instance.ptr

public val Revealer.childRevealed: Boolean
  get() = gtk_revealer_get_child_revealed(this).toBoolean()

public var Revealer.revealChild: Boolean
  get() = gtk_revealer_get_reveal_child(this).toBoolean()
  set(`value`) {
    gtk_revealer_set_reveal_child(this@revealChild, `value`.toInt())
  }

public var Revealer.transitionDuration: UInt
  get() = gtk_revealer_get_transition_duration(this)
  set(`value`) {
    gtk_revealer_set_transition_duration(this@transitionDuration, `value`)
  }

public var Revealer.transitionType: RevealerTransitionType
  get() = gtk_revealer_get_transition_type(this)
  set(`value`) {
    gtk_revealer_set_transition_type(this@transitionType, `value`)
  }
