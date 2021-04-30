// TODO - field: qdata
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GInitiallyUnowned
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias InitiallyUnowned = CPointer<GInitiallyUnowned>

public val InitiallyUnowned.asObject: Object
  get() = reinterpret()
