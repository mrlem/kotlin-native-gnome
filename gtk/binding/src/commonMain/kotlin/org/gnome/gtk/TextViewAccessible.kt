@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkTextViewAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TextViewAccessible = CPointer<GtkTextViewAccessible>

public val TextViewAccessible.asObject: Object
  get() = reinterpret()

public val TextViewAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val TextViewAccessible.asAccessible: Accessible
  get() = reinterpret()

public val TextViewAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val TextViewAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
