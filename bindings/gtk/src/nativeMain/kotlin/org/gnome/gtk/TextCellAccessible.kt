@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TextCellAccessible = CPointer<GtkTextCellAccessible>

public val TextCellAccessible.asObject: Object
  get() = reinterpret()

public val TextCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val TextCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val TextCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()

public val TextCellAccessible.asRendererCellAccessible: RendererCellAccessible
  get() = reinterpret()

public val TextCellAccessible.parent: RendererCellAccessible
  get() = pointed.parent.ptr
