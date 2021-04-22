@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkBin
import interop.gtk_bin_get_child
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Bin = CPointer<GtkBin>

public val Bin.asObject: Object
  get() = reinterpret()

public val Bin.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Bin.asWidget: Widget
  get() = reinterpret()

public val Bin.asContainer: Container
  get() = reinterpret()

public val Bin.child: Widget?
  get() = gtk_bin_get_child(this)?.reinterpret()
