// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GZlibDecompressor
import interop.g_zlib_decompressor_get_file_info
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ZlibDecompressor = CPointer<GZlibDecompressor>

public val ZlibDecompressor.asObject: Object
  get() = reinterpret()

public object ZlibDecompressorFactory

public val ZlibDecompressor.fileInfo: FileInfo?
  get() = g_zlib_decompressor_get_file_info(this)?.reinterpret()
