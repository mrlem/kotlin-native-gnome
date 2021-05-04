// TODO - method: get_bits_per_rgb
// TODO - method: get_blue_pixel_details
// TODO - method: get_byte_order
// TODO - method: get_colormap_size
// TODO - method: get_green_pixel_details
// TODO - method: get_red_pixel_details
// TODO - method: get_screen
// TODO - method: get_visual_type
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkVisual
import interop.gdk_visual_get_depth
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Visual = CPointer<GdkVisual>

public val Visual.asObject: Object
  get() = reinterpret()

public val Visual.depth: Int
  get() = gdk_visual_get_depth(this)
