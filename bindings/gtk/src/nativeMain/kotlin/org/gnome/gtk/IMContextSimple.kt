// TODO - method: add_table
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIMContextSimple
import interop.gtk_im_context_simple_add_compose_file
import interop.gtk_im_context_simple_new
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias IMContextSimple = CPointer<GtkIMContextSimple>

public val IMContextSimple.asObject: Object
  get() = reinterpret()

public val IMContextSimple.asIMContext: IMContext
  get() = reinterpret()

public object IMContextSimpleFactory {
  public fun new(): IMContextSimple = gtk_im_context_simple_new()!!.reinterpret()
}

public val IMContextSimple.`object`: IMContext
  get() = pointed.`object`.ptr

public fun IMContextSimple.addComposeFile(composeFile: String): Unit {
  gtk_im_context_simple_add_compose_file(this, composeFile)
}
