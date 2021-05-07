// TODO - method: close_async (param type)
// TODO - method: iterate (param type)
// TODO - method: next_files_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GFileEnumerator
import interop.GList
import interop.g_file_enumerator_close
import interop.g_file_enumerator_close_finish
import interop.g_file_enumerator_get_child
import interop.g_file_enumerator_get_container
import interop.g_file_enumerator_has_pending
import interop.g_file_enumerator_is_closed
import interop.g_file_enumerator_next_file
import interop.g_file_enumerator_next_files_finish
import interop.g_file_enumerator_set_pending
import kotlin.Boolean
import kotlin.Throws
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKList

public typealias FileEnumerator = CPointer<GFileEnumerator>

public val FileEnumerator.asObject: Object
  get() = reinterpret()

public val FileEnumerator.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val FileEnumerator.container: File?
  get() = g_file_enumerator_get_container(this)?.reinterpret()

@Throws(Error::class)
public fun FileEnumerator.close(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_file_enumerator_close(this@close, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun FileEnumerator.closeFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_file_enumerator_close_finish(this@closeFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun FileEnumerator.getChild(info: FileInfo?): File? =
    g_file_enumerator_get_child(this@getChild, info?.reinterpret())?.reinterpret()

public fun FileEnumerator.hasPending(): Boolean =
    g_file_enumerator_has_pending(this@hasPending).toBoolean()

public fun FileEnumerator.isClosed(): Boolean =
    g_file_enumerator_is_closed(this@isClosed).toBoolean()

@Throws(Error::class)
public fun FileEnumerator.nextFile(cancellable: Cancellable?): FileInfo? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: FileInfo? = g_file_enumerator_next_file(this@nextFile, cancellable?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun FileEnumerator.nextFilesFinish(result: AsyncResult?): List<FileInfo>? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: List<FileInfo>? = g_file_enumerator_next_files_finish(this@nextFilesFinish,
      result?.reinterpret(), errors)?.reinterpret<GList>()?.toKList()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun FileEnumerator.setPending(pending: Boolean): Unit {
  g_file_enumerator_set_pending(this@setPending, pending.toInt())
}
