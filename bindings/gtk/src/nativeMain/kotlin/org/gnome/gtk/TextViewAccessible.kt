@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextViewAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val TextViewAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
