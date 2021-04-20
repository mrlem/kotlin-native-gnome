package org.gnome.gtk

import gtk3.GtkNotebookPageAccessible
import gtk3.gtk_notebook_page_accessible_invalidate
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias NotebookPageAccessible = CPointer<GtkNotebookPageAccessible>

public val NotebookPageAccessible.asObject: Object
  get() = reinterpret()

public val NotebookPageAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public fun NotebookPageAccessible.invalidate(): Unit {
  gtk_notebook_page_accessible_invalidate(this)
}
