// TODO - implement:
//   append_menuitems
package org.gnome.gtk

import gtk3.GtkIMMulticontext
import gtk3.gtk_im_multicontext_get_context_id
import gtk3.gtk_im_multicontext_set_context_id
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias IMMulticontext = CPointer<GtkIMMulticontext>

public val IMMulticontext.asObject: Object
  get() = reinterpret()

public val IMMulticontext.asIMContext: IMContext
  get() = reinterpret()

public var IMMulticontext.contextId: String?
  get() = gtk_im_multicontext_get_context_id(this).toKString
  set(`value`) {
    gtk_im_multicontext_set_context_id(this, value)
  }
