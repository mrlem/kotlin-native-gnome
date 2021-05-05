@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkNotebookPageAccessible
import interop.gtk_notebook_page_accessible_invalidate
import interop.gtk_notebook_page_accessible_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NotebookPageAccessible = CPointer<GtkNotebookPageAccessible>

public val NotebookPageAccessible.asObject: Object
  get() = reinterpret()

public val NotebookPageAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public object NotebookPageAccessibleFactory {
  public fun new(notebook: NotebookAccessible?, child: Widget?): NotebookPageAccessible =
      gtk_notebook_page_accessible_new(notebook?.reinterpret(),
      child?.reinterpret())!!.reinterpret()
}

public val NotebookPageAccessible.parent: org.gnome.atk.Object
  get() = pointed.parent.ptr

public fun NotebookPageAccessible.invalidate(): Unit {
  gtk_notebook_page_accessible_invalidate(this@invalidate)
}
