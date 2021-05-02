@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GZlibDecompressor
import interop.g_zlib_decompressor_get_file_info
import interop.g_zlib_decompressor_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ZlibDecompressor = CPointer<GZlibDecompressor>

public val ZlibDecompressor.asObject: Object
  get() = reinterpret()

public object ZlibDecompressorFactory {
  public fun new(format: ZlibCompressorFormat): ZlibDecompressor =
      g_zlib_decompressor_new(format)!!.reinterpret()
}

public val ZlibDecompressor.fileInfo: FileInfo?
  get() = g_zlib_decompressor_get_file_info(this)?.reinterpret()
