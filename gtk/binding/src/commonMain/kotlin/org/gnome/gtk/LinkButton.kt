package org.gnome.gtk

import gtk3.GtkLinkButton
import gtk3.gtk_link_button_get_uri
import gtk3.gtk_link_button_get_visited
import gtk3.gtk_link_button_set_uri
import gtk3.gtk_link_button_set_visited
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias LinkButton = CPointer<GtkLinkButton>

public val LinkButton.asObject: Object
  get() = reinterpret()

public val LinkButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LinkButton.asWidget: Widget
  get() = reinterpret()

public val LinkButton.asContainer: Container
  get() = reinterpret()

public val LinkButton.asBin: Bin
  get() = reinterpret()

public val LinkButton.asButton: Button
  get() = reinterpret()

public fun LinkButton.getUri(): String = gtk_link_button_get_uri(this).toKString

public fun LinkButton.getVisited(): Boolean = gtk_link_button_get_visited(this).toBoolean

public fun LinkButton.setUri(uri: String?): Unit {
  gtk_link_button_set_uri(this, uri)
}

public fun LinkButton.setVisited(visited: Boolean): Unit {
  gtk_link_button_set_visited(this, visited.toInt)
}
