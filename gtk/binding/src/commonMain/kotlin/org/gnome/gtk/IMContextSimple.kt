// TODO - method: add_table
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkIMContextSimple
import gtk3.gtk_im_context_simple_add_compose_file
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias IMContextSimple = CPointer<GtkIMContextSimple>

public val IMContextSimple.asObject: Object
  get() = reinterpret()

public val IMContextSimple.asIMContext: IMContext
  get() = reinterpret()

public fun IMContextSimple.addComposeFile(composeFile: String): Unit {
  gtk_im_context_simple_add_compose_file(this, composeFile)
}
