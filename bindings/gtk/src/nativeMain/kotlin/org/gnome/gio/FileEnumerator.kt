// TODO - method: close
// TODO - method: close_async
// TODO - method: close_finish
// TODO - method: get_child
// TODO - method: iterate
// TODO - method: next_file
// TODO - method: next_files_async
// TODO - method: next_files_finish
// TODO - method: set_pending
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileEnumerator
import interop.g_file_enumerator_get_container
import interop.g_file_enumerator_has_pending
import interop.g_file_enumerator_is_closed
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias FileEnumerator = CPointer<GFileEnumerator>

public val FileEnumerator.asObject: Object
  get() = reinterpret()

public val FileEnumerator.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val FileEnumerator.container: File?
  get() = g_file_enumerator_get_container(this)?.reinterpret()

public fun FileEnumerator.hasPending(): Boolean = g_file_enumerator_has_pending(this).toBoolean

public fun FileEnumerator.isClosed(): Boolean = g_file_enumerator_is_closed(this).toBoolean
