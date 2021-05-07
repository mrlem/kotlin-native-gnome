@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIMContextSimple
import interop.gtk_im_context_simple_add_compose_file
import interop.gtk_im_context_simple_add_table
import interop.gtk_im_context_simple_new
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toCArray

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

public fun IMContextSimple.addComposeFile(composeFile: String?): Unit {
  gtk_im_context_simple_add_compose_file(this@addComposeFile, composeFile)
}

public fun IMContextSimple.addTable(
  `data`: Array<UShort>?,
  maxSeqLen: Int,
  nSeqs: Int
): Unit {
  memScoped { gtk_im_context_simple_add_table(this@addTable, `data`?.toCArray(memScope), maxSeqLen,
      nSeqs) }
}
