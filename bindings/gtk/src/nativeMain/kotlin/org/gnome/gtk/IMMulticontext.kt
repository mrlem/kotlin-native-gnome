@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkIMMulticontext
import interop.gtk_im_multicontext_get_context_id
import interop.gtk_im_multicontext_new
import interop.gtk_im_multicontext_set_context_id
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toKString

public typealias IMMulticontext = CPointer<GtkIMMulticontext>

public val IMMulticontext.asObject: Object
  get() = reinterpret()

public val IMMulticontext.asIMContext: IMContext
  get() = reinterpret()

public object IMMulticontextFactory {
  public fun new(): IMMulticontext = gtk_im_multicontext_new()!!.reinterpret()
}

public val IMMulticontext.`object`: IMContext
  get() = pointed.`object`.ptr

public var IMMulticontext.contextId: String?
  get() = gtk_im_multicontext_get_context_id(this).toKString()
  set(`value`) {
    gtk_im_multicontext_set_context_id(this@contextId, `value`)
  }
