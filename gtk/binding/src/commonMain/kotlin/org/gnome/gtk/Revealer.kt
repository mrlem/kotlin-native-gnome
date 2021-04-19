// TODO - get_transition_type
// TODO - set_transition_type
//
package org.gnome.gtk

import gtk3.GtkRevealer
import gtk3.gtk_revealer_get_child_revealed
import gtk3.gtk_revealer_get_reveal_child
import gtk3.gtk_revealer_get_transition_duration
import gtk3.gtk_revealer_set_reveal_child
import gtk3.gtk_revealer_set_transition_duration
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit
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

public fun Revealer.getChildRevealed(): Boolean = gtk_revealer_get_child_revealed(this).toBoolean

public fun Revealer.getRevealChild(): Boolean = gtk_revealer_get_reveal_child(this).toBoolean

public fun Revealer.getTransitionDuration(): UInt = gtk_revealer_get_transition_duration(this)

public fun Revealer.setRevealChild(revealChild: Boolean): Unit {
  gtk_revealer_set_reveal_child(this, revealChild.toInt)
}

public fun Revealer.setTransitionDuration(duration: UInt): Unit {
  gtk_revealer_set_transition_duration(this, duration)
}
