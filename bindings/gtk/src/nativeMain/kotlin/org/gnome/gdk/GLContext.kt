// TODO - method: get_required_version (param type)
// TODO - method: get_version (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GError
import interop.GdkGLContext
import interop.gdk_gl_context_get_debug_enabled
import interop.gdk_gl_context_get_display
import interop.gdk_gl_context_get_forward_compatible
import interop.gdk_gl_context_get_shared_context
import interop.gdk_gl_context_get_use_es
import interop.gdk_gl_context_get_window
import interop.gdk_gl_context_is_legacy
import interop.gdk_gl_context_make_current
import interop.gdk_gl_context_realize
import interop.gdk_gl_context_set_debug_enabled
import interop.gdk_gl_context_set_forward_compatible
import interop.gdk_gl_context_set_required_version
import interop.gdk_gl_context_set_use_es
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias GLContext = CPointer<GdkGLContext>

public val GLContext.asObject: Object
  get() = reinterpret()

public var GLContext.debugEnabled: Boolean
  get() = gdk_gl_context_get_debug_enabled(this).toBoolean()
  set(`value`) {
    gdk_gl_context_set_debug_enabled(this@debugEnabled, `value`.toInt())
  }

public val GLContext.display: Display?
  get() = gdk_gl_context_get_display(this)?.reinterpret()

public var GLContext.forwardCompatible: Boolean
  get() = gdk_gl_context_get_forward_compatible(this).toBoolean()
  set(`value`) {
    gdk_gl_context_set_forward_compatible(this@forwardCompatible, `value`.toInt())
  }

public val GLContext.sharedContext: GLContext?
  get() = gdk_gl_context_get_shared_context(this)?.reinterpret()

public val GLContext.useEs: Boolean
  get() = gdk_gl_context_get_use_es(this).toBoolean()

public val GLContext.window: Window?
  get() = gdk_gl_context_get_window(this)?.reinterpret()

public fun GLContext.isLegacy(): Boolean = gdk_gl_context_is_legacy(this@isLegacy).toBoolean()

public fun GLContext.makeCurrent(): Unit {
  gdk_gl_context_make_current(this@makeCurrent)
}

@Throws(Error::class)
public fun GLContext.realize(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gdk_gl_context_realize(this@realize, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun GLContext.setRequiredVersion(major: Int, minor: Int): Unit {
  gdk_gl_context_set_required_version(this@setRequiredVersion, major, minor)
}

public fun GLContext.setUseEs(useEs: Int): Unit {
  gdk_gl_context_set_use_es(this@setUseEs, useEs)
}
