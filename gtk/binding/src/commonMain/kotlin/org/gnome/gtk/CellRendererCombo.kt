@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellRendererCombo
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias CellRendererCombo = CPointer<GtkCellRendererCombo>

public val CellRendererCombo.asObject: Object
  get() = reinterpret()

public val CellRendererCombo.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererCombo.asCellRenderer: CellRenderer
  get() = reinterpret()

public val CellRendererCombo.asCellRendererText: CellRendererText
  get() = reinterpret()
