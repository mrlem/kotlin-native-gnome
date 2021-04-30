// TODO - constructor: new
// TODO - field: parent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkNotebookPageAccessible
import interop.gtk_notebook_page_accessible_invalidate
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NotebookPageAccessible = CPointer<GtkNotebookPageAccessible>

public val NotebookPageAccessible.asObject: Object
  get() = reinterpret()

public val NotebookPageAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public object NotebookPageAccessibleFactory

public fun NotebookPageAccessible.invalidate(): Unit {
  gtk_notebook_page_accessible_invalidate(this)
}
