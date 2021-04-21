@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkLabelAccessible
import kotlinx.cinterop.CPointer
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
