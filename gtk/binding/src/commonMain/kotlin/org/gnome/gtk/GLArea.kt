// TODO - get_context
// TODO - get_error
// TODO - get_required_version
// TODO - set_error
//
package org.gnome.gtk

import gtk3.GtkGLArea
import gtk3.gtk_gl_area_attach_buffers
import gtk3.gtk_gl_area_get_auto_render
import gtk3.gtk_gl_area_get_has_alpha
import gtk3.gtk_gl_area_get_has_depth_buffer
import gtk3.gtk_gl_area_get_has_stencil_buffer
import gtk3.gtk_gl_area_get_use_es
import gtk3.gtk_gl_area_make_current
import gtk3.gtk_gl_area_queue_render
import gtk3.gtk_gl_area_set_auto_render
import gtk3.gtk_gl_area_set_has_alpha
import gtk3.gtk_gl_area_set_has_depth_buffer
import gtk3.gtk_gl_area_set_has_stencil_buffer
import gtk3.gtk_gl_area_set_required_version
import gtk3.gtk_gl_area_set_use_es
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias GLArea = CPointer<GtkGLArea>

public val GLArea.asObject: Object
  get() = reinterpret()

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

public fun GLArea.attachBuffers(): Unit {
  gtk_gl_area_attach_buffers(this)
}

public fun GLArea.makeCurrent(): Unit {
  gtk_gl_area_make_current(this)
}

public fun GLArea.queueRender(): Unit {
  gtk_gl_area_queue_render(this)
}

public fun GLArea.setRequiredVersion(major: Int, minor: Int): Unit {
  gtk_gl_area_set_required_version(this, major, minor)
}
