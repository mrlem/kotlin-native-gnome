// TODO - implement:
//   append_menuitems
//   get_context_id
//   set_context_id
package org.gnome.gtk

import gtk3.GtkIMMulticontext
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IMMulticontext = CPointer<GtkIMMulticontext>

public val IMMulticontext.asObject: Object
  get() = reinterpret()

public val IMMulticontext.asIMContext: IMContext
  get() = reinterpret()
