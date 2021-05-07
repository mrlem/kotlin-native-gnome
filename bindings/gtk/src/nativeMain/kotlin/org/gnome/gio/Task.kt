// TODO - constructor: new
// TODO - method: get_source_tag (return type)
// TODO - method: get_task_data (return type)
// TODO - method: propagate_pointer (return type)
// TODO - method: propagate_value (param type)
// TODO - method: return_pointer (param type)
// TODO - method: set_source_tag (param type)
// TODO - method: set_task_data (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GTask
import interop.g_task_get_cancellable
import interop.g_task_get_check_cancellable
import interop.g_task_get_completed
import interop.g_task_get_context
import interop.g_task_get_name
import interop.g_task_get_priority
import interop.g_task_get_return_on_cancel
import interop.g_task_get_source_object
import interop.g_task_had_error
import interop.g_task_propagate_boolean
import interop.g_task_propagate_int
import interop.g_task_return_boolean
import interop.g_task_return_error
import interop.g_task_return_error_if_cancelled
import interop.g_task_return_int
import interop.g_task_return_value
import interop.g_task_set_check_cancellable
import interop.g_task_set_name
import interop.g_task_set_priority
import interop.g_task_set_return_on_cancel
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.MainContext
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias Task = CPointer<GTask>

public val Task.asObject: Object
  get() = reinterpret()

public object TaskFactory

public val Task.cancellable: Cancellable?
  get() = g_task_get_cancellable(this)?.reinterpret()

public var Task.checkCancellable: Boolean
  get() = g_task_get_check_cancellable(this).toBoolean()
  set(`value`) {
    g_task_set_check_cancellable(this@checkCancellable, `value`.toInt())
  }

public val Task.completed: Boolean
  get() = g_task_get_completed(this).toBoolean()

public val Task.context: MainContext?
  get() = g_task_get_context(this)?.reinterpret()

public var Task.name: String?
  get() = g_task_get_name(this).toKString()
  set(`value`) {
    g_task_set_name(this@name, `value`)
  }

public var Task.priority: Int
  get() = g_task_get_priority(this)
  set(`value`) {
    g_task_set_priority(this@priority, `value`)
  }

public var Task.returnOnCancel: Boolean
  get() = g_task_get_return_on_cancel(this).toBoolean()
  set(`value`) {
    g_task_set_return_on_cancel(this@returnOnCancel, `value`.toInt())
  }

public val Task.sourceObject: Object?
  get() = g_task_get_source_object(this)?.reinterpret()

public fun Task.hadError(): Boolean = g_task_had_error(this@hadError).toBoolean()

@Throws(Error::class)
public fun Task.propagateBoolean(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_task_propagate_boolean(this@propagateBoolean, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Task.propagateInt(): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_task_propagate_int(this@propagateInt, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Task.returnBoolean(result: Boolean): Unit {
  g_task_return_boolean(this@returnBoolean, result.toInt())
}

public fun Task.returnError(error: org.gnome.glib.Error?): Unit {
  g_task_return_error(this@returnError, error?.reinterpret())
}

public fun Task.returnErrorIfCancelled(): Boolean =
    g_task_return_error_if_cancelled(this@returnErrorIfCancelled).toBoolean()

public fun Task.returnInt(result: Long): Unit {
  g_task_return_int(this@returnInt, result)
}

public fun Task.returnValue(result: Value?): Unit {
  g_task_return_value(this@returnValue, result?.reinterpret())
}
