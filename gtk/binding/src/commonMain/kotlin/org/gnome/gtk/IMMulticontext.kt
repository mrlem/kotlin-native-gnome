package org.gnome.gtk

import gtk3.GtkIMMulticontext
import gtk3.gtk_im_multicontext_get_context_id
import gtk3.gtk_im_multicontext_set_context_id
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias IMMulticontext = CPointer<GtkIMMulticontext>

public val IMMulticontext.asObject: Object
  get() = reinterpret()

public val IMMulticontext.asIMContext: IMContext
  get() = reinterpret()

public fun IMMulticontext.getContextId(): String =
    gtk_im_multicontext_get_context_id(this).toKString

public fun IMMulticontext.setContextId(contextId: String?): Unit {
  gtk_im_multicontext_set_context_id(this, contextId)
}
