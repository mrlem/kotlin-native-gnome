// TODO - constructor: new
// TODO - constructor: new_from_error
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleAsyncResult
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimpleAsyncResult = CPointer<GSimpleAsyncResult>

public val SimpleAsyncResult.asObject: Object
  get() = reinterpret()

public object SimpleAsyncResultFactory
