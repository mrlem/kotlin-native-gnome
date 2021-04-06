// TODO - implement:
//   attach_buffers
//   get_context
//   get_error
//   get_required_version
//   make_current
//   queue_render
//   set_error
//   set_required_version
package org.gnome.gtk

import gtk3.GtkGLArea
import gtk3.gtk_gl_area_get_auto_render
import gtk3.gtk_gl_area_get_has_alpha
import gtk3.gtk_gl_area_get_has_depth_buffer
import gtk3.gtk_gl_area_get_has_stencil_buffer
import gtk3.gtk_gl_area_get_use_es
import gtk3.gtk_gl_area_set_auto_render
import gtk3.gtk_gl_area_set_has_alpha
import gtk3.gtk_gl_area_set_has_depth_buffer
import gtk3.gtk_gl_area_set_has_stencil_buffer
import gtk3.gtk_gl_area_set_use_es
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias GLArea = CPointer<GtkGLArea>

public val GLArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val GLArea.asWidget: Widget
  get() = reinterpret()

public var GLArea.autoRender: Boolean
  get() = gtk_gl_area_get_auto_render(this).toBoolean
  set(`value`) {
    gtk_gl_area_set_auto_render(this, value.toInt)
  }

public var GLArea.hasAlpha: Boolean
  get() = gtk_gl_area_get_has_alpha(this).toBoolean
  set(`value`) {
    gtk_gl_area_set_has_alpha(this, value.toInt)
  }

public var GLArea.hasDepthBuffer: Boolean
  get() = gtk_gl_area_get_has_depth_buffer(this).toBoolean
  set(`value`) {
    gtk_gl_area_set_has_depth_buffer(this, value.toInt)
  }

public var GLArea.hasStencilBuffer: Boolean
  get() = gtk_gl_area_get_has_stencil_buffer(this).toBoolean
  set(`value`) {
    gtk_gl_area_set_has_stencil_buffer(this, value.toInt)
  }

public var GLArea.useEs: Boolean
  get() = gtk_gl_area_get_use_es(this).toBoolean
  set(`value`) {
    gtk_gl_area_set_use_es(this, value.toInt)
  }
