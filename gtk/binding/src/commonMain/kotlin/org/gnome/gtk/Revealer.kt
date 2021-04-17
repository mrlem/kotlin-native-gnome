// TODO - implement:
//   set_transition_type
package org.gnome.gtk

import gtk3.GtkRevealer
import gtk3.gtk_revealer_get_child_revealed
import gtk3.gtk_revealer_get_reveal_child
import gtk3.gtk_revealer_get_transition_duration
import gtk3.gtk_revealer_get_transition_type
import gtk3.gtk_revealer_set_reveal_child
import gtk3.gtk_revealer_set_transition_duration
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

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

public fun Revealer.getTransitionType(): Unit {
  gtk_revealer_get_transition_type(this)
}

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

public val Revealer.childRevealed: Boolean
  get() = gtk_revealer_get_child_revealed(this).toBoolean
