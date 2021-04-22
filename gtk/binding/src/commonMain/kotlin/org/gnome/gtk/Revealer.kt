@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkRevealer
import gtk3.gtk_revealer_get_child_revealed
import gtk3.gtk_revealer_get_reveal_child
import gtk3.gtk_revealer_get_transition_duration
import gtk3.gtk_revealer_get_transition_type
import gtk3.gtk_revealer_new
import gtk3.gtk_revealer_set_reveal_child
import gtk3.gtk_revealer_set_transition_duration
import gtk3.gtk_revealer_set_transition_type
import kotlin.Boolean
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public val Revealer.childRevealed: Boolean
  get() = gtk_revealer_get_child_revealed(this).toBoolean

public var Revealer.revealChild: Boolean
  get() = gtk_revealer_get_reveal_child(this).toBoolean
  set(`value`) {
    gtk_revealer_set_reveal_child(this, value.toInt)
  }

public var Revealer.transitionDuration: UInt
  get() = gtk_revealer_get_transition_duration(this)
  set(`value`) {
    gtk_revealer_set_transition_duration(this, value)
  }

public var Revealer.transitionType: RevealerTransitionType
  get() = gtk_revealer_get_transition_type(this)
  set(`value`) {
    gtk_revealer_set_transition_type(this, value)
  }
