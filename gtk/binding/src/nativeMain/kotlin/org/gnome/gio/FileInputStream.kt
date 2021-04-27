// TODO - method: query_info
// TODO - method: query_info_async
// TODO - method: query_info_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileInputStream
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FileInputStream = CPointer<GFileInputStream>

public val FileInputStream.asObject: Object
  get() = reinterpret()

public val FileInputStream.asInputStream: InputStream
  get() = reinterpret()
