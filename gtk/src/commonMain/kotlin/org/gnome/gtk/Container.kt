package org.gnome.gtk

import gtk3.GtkContainer
import gtk3.GtkWidget
import gtk3.gtk_container_add
import gtk3.gtk_container_get_children
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.mrlem.gnome.glib.toKList

public typealias Container = CPointer<GtkContainer>

public val Container.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Container.asWidget: Widget
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

val Container.children: List<Widget>
  get() = gtk_container_get_children(this)
    ?.toKList<GtkWidget>()
    .orEmpty()

fun Container.add(widget: Widget) {
  gtk_container_add(this, widget)
}
