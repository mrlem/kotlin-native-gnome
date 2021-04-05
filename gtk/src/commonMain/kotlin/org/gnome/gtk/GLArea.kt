// TODO - implement:
//   attach_buffers
//   get_auto_render
//   get_context
//   get_error
//   get_has_alpha
//   get_has_depth_buffer
//   get_has_stencil_buffer
//   get_required_version
//   get_use_es
//   make_current
//   queue_render
//   set_auto_render
//   set_error
//   set_has_alpha
//   set_has_depth_buffer
//   set_has_stencil_buffer
//   set_required_version
//   set_use_es
package org.gnome.gtk

import gtk3.GtkGLArea
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias GLArea = CPointer<GtkGLArea>

public val GLArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val GLArea.asWidget: Widget
  get() = reinterpret()
