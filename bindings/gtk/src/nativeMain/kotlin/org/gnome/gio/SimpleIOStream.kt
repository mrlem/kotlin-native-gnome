// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleIOStream
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimpleIOStream = CPointer<GSimpleIOStream>

public val SimpleIOStream.asObject: Object
  get() = reinterpret()

public val SimpleIOStream.asIOStream: IOStream
  get() = reinterpret()

public object SimpleIOStreamFactory
