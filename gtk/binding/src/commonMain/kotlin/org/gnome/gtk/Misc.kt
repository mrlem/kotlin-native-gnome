// TODO - method: get_alignment
// TODO - method: get_padding
// TODO - method: set_alignment
// TODO - method: set_padding
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkMisc
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Misc = CPointer<GtkMisc>

public val Misc.asObject: Object
  get() = reinterpret()

public val Misc.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Misc.asWidget: Widget
  get() = reinterpret()
