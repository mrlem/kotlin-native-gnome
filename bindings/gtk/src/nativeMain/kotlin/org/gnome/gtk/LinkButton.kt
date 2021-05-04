@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLinkButton
import interop.gtk_link_button_get_uri
import interop.gtk_link_button_get_visited
import interop.gtk_link_button_new
import interop.gtk_link_button_new_with_label
import interop.gtk_link_button_set_uri
import interop.gtk_link_button_set_visited
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
import org.mrlem.gnome.gobject.connect

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

public object LinkButtonFactory {
  public fun new(uri: String?): LinkButton = gtk_link_button_new(uri)!!.reinterpret()

  public fun newWithLabel(uri: String?, label: String?): LinkButton =
      gtk_link_button_new_with_label(uri, label)!!.reinterpret()
}

public var LinkButton.uri: String?
  get() = gtk_link_button_get_uri(this).toKString()
  set(`value`) {
    gtk_link_button_set_uri(this@uri, `value`)
  }

public var LinkButton.visited: Boolean
  get() = gtk_link_button_get_visited(this).toBoolean()
  set(`value`) {
    gtk_link_button_set_visited(this@visited, `value`.toInt())
  }

public fun LinkButton.onActivateLink(callback: (LinkButton) -> Unit): LinkButton {
  // TODO - handle callback data

  asObject.connect("activate-link") { callback(this) }
  return this
}
