// TODO - constructor: new
// TODO - constructor: new_from_error
// TODO - method: complete
// TODO - method: complete_in_idle
// TODO - method: get_op_res_gboolean
// TODO - method: get_op_res_gssize
// TODO - method: propagate_error
// TODO - method: set_check_cancellable
// TODO - method: set_from_error
// TODO - method: set_handle_cancellation
// TODO - method: set_op_res_gboolean
// TODO - method: set_op_res_gssize
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
