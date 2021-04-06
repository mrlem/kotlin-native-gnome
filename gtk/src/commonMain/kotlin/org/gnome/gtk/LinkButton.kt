package org.gnome.gtk

import gtk3.GtkLinkButton
import gtk3.gtk_link_button_get_uri
import gtk3.gtk_link_button_get_visited
import gtk3.gtk_link_button_set_uri
import gtk3.gtk_link_button_set_visited
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias LinkButton = CPointer<GtkLinkButton>

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

public var LinkButton.uri: String?
  get() = gtk_link_button_get_uri(this).toKString
  set(`value`) {
    gtk_link_button_set_uri(this, value)
  }

public var LinkButton.visited: Boolean
  get() = gtk_link_button_get_visited(this).toBoolean
  set(`value`) {
    gtk_link_button_set_visited(this, value.toInt)
  }
