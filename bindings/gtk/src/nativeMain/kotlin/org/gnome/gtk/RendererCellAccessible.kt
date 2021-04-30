// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRendererCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RendererCellAccessible = CPointer<GtkRendererCellAccessible>

public val RendererCellAccessible.asObject: Object
  get() = reinterpret()

public val RendererCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val RendererCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val RendererCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()

public object RendererCellAccessibleFactory

public val RendererCellAccessible.parent: CellAccessible
  get() = pointed.parent.ptr
