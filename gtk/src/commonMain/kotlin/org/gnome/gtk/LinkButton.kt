// TODO - implement:
//   get_uri
//   get_visited
//   set_uri
//   set_visited
package org.gnome.gtk

import gtk3.GtkLinkButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

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
