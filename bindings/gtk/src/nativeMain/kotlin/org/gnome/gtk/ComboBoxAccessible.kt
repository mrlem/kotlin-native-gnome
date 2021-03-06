@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkComboBoxAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ComboBoxAccessible = CPointer<GtkComboBoxAccessible>

public val ComboBoxAccessible.asObject: Object
  get() = reinterpret()

public val ComboBoxAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ComboBoxAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ComboBoxAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ComboBoxAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ComboBoxAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
