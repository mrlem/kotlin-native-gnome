// TODO - handle_event
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkSearchEntry
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias SearchEntry = CPointer<GtkSearchEntry>

public val SearchEntry.asObject: Object
  get() = reinterpret()

public val SearchEntry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SearchEntry.asWidget: Widget
  get() = reinterpret()

public val SearchEntry.asEntry: Entry
  get() = reinterpret()
