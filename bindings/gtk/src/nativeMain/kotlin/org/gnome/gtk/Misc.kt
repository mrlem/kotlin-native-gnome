@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMisc
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val Misc.widget: Widget
  get() = pointed.widget.ptr
