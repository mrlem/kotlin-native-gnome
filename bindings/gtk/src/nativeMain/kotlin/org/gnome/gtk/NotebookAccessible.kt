@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkNotebookAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NotebookAccessible = CPointer<GtkNotebookAccessible>

public val NotebookAccessible.asObject: Object
  get() = reinterpret()

public val NotebookAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val NotebookAccessible.asAccessible: Accessible
  get() = reinterpret()

public val NotebookAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val NotebookAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val NotebookAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
