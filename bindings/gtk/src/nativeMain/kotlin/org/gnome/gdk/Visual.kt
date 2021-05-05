// TODO - method: get_blue_pixel_details (param type)
// TODO - method: get_green_pixel_details (param type)
// TODO - method: get_red_pixel_details (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkVisual
import interop.gdk_visual_get_depth
import interop.gdk_visual_get_screen
import interop.gdk_visual_get_visual_type
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Visual = CPointer<GdkVisual>

public val Visual.asObject: Object
  get() = reinterpret()

public val Visual.depth: Int
  get() = gdk_visual_get_depth(this)

public val Visual.screen: Screen?
  get() = gdk_visual_get_screen(this)?.reinterpret()

public val Visual.visualType: VisualType
  get() = gdk_visual_get_visual_type(this)
