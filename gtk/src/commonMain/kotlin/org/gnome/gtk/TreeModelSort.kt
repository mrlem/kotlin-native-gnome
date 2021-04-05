package org.gnome.gtk

import gtk3.GtkTreeModelSort
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TreeModelSort = CPointer<GtkTreeModelSort>

public val TreeModelSort.asObject: Object
  get() = reinterpret()
