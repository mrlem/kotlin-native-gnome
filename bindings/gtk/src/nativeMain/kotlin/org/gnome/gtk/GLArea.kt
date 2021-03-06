// TODO - method: get_required_version (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkGLArea
import interop.gtk_gl_area_attach_buffers
import interop.gtk_gl_area_get_auto_render
import interop.gtk_gl_area_get_context
import interop.gtk_gl_area_get_error
import interop.gtk_gl_area_get_has_alpha
import interop.gtk_gl_area_get_has_depth_buffer
import interop.gtk_gl_area_get_has_stencil_buffer
import interop.gtk_gl_area_get_use_es
import interop.gtk_gl_area_make_current
import interop.gtk_gl_area_new
import interop.gtk_gl_area_queue_render
import interop.gtk_gl_area_set_auto_render
import interop.gtk_gl_area_set_error
import interop.gtk_gl_area_set_has_alpha
import interop.gtk_gl_area_set_has_depth_buffer
import interop.gtk_gl_area_set_has_stencil_buffer
import interop.gtk_gl_area_set_required_version
import interop.gtk_gl_area_set_use_es
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.GLContext
import org.gnome.glib.Error
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias GLArea = CPointer<GtkGLArea>

public val GLArea.asObject: Object
  get() = reinterpret()

public val GLArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val GLArea.asWidget: Widget
  get() = reinterpret()

public object GLAreaFactory {
  public fun new(): GLArea = gtk_gl_area_new()!!.reinterpret()
}

public var GLArea.autoRender: Boolean
  get() = gtk_gl_area_get_auto_render(this).toBoolean()
  set(`value`) {
    gtk_gl_area_set_auto_render(this@autoRender, `value`.toInt())
  }

public val GLArea.context: GLContext?
  get() = gtk_gl_area_get_context(this)?.reinterpret()

public var GLArea.error: Error?
  get() = gtk_gl_area_get_error(this)?.reinterpret()
  set(`value`) {
    gtk_gl_area_set_error(this@error, `value`)
  }

public var GLArea.hasAlpha: Boolean
  get() = gtk_gl_area_get_has_alpha(this).toBoolean()
  set(`value`) {
    gtk_gl_area_set_has_alpha(this@hasAlpha, `value`.toInt())
  }

public var GLArea.hasDepthBuffer: Boolean
  get() = gtk_gl_area_get_has_depth_buffer(this).toBoolean()
  set(`value`) {
    gtk_gl_area_set_has_depth_buffer(this@hasDepthBuffer, `value`.toInt())
  }

public var GLArea.hasStencilBuffer: Boolean
  get() = gtk_gl_area_get_has_stencil_buffer(this).toBoolean()
  set(`value`) {
    gtk_gl_area_set_has_stencil_buffer(this@hasStencilBuffer, `value`.toInt())
  }

public var GLArea.useEs: Boolean
  get() = gtk_gl_area_get_use_es(this).toBoolean()
  set(`value`) {
    gtk_gl_area_set_use_es(this@useEs, `value`.toInt())
  }

public fun GLArea.attachBuffers(): Unit {
  gtk_gl_area_attach_buffers(this@attachBuffers)
}

public fun GLArea.makeCurrent(): Unit {
  gtk_gl_area_make_current(this@makeCurrent)
}

public fun GLArea.queueRender(): Unit {
  gtk_gl_area_queue_render(this@queueRender)
}

public fun GLArea.setRequiredVersion(major: Int, minor: Int): Unit {
  gtk_gl_area_set_required_version(this@setRequiredVersion, major, minor)
}

public fun GLArea.onCreateContext(callback: (GLArea) -> Unit): GLArea {
  // TODO - handle callback data

  asObject.connect("create-context") { callback(this) }
  return this
}

public fun GLArea.onRender(callback: (GLArea) -> Unit): GLArea {
  // TODO - handle callback data

  asObject.connect("render") { callback(this) }
  return this
}

public fun GLArea.onResize(callback: (GLArea) -> Unit): GLArea {
  // TODO - handle callback data

  asObject.connect("resize") { callback(this) }
  return this
}
