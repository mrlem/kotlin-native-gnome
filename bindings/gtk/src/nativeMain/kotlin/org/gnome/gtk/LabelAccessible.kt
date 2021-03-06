@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLabelAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias LabelAccessible = CPointer<GtkLabelAccessible>

public val LabelAccessible.asObject: Object
  get() = reinterpret()

public val LabelAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val LabelAccessible.asAccessible: Accessible
  get() = reinterpret()

public val LabelAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val LabelAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
