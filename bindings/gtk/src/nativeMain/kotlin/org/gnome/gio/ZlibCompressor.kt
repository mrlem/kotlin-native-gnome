@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GZlibCompressor
import interop.g_zlib_compressor_get_file_info
import interop.g_zlib_compressor_new
import interop.g_zlib_compressor_set_file_info
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ZlibCompressor = CPointer<GZlibCompressor>

public val ZlibCompressor.asObject: Object
  get() = reinterpret()

public object ZlibCompressorFactory {
  public fun new(format: ZlibCompressorFormat, level: Int): ZlibCompressor =
      g_zlib_compressor_new(format, level)!!.reinterpret()
}

public var ZlibCompressor.fileInfo: FileInfo?
  get() = g_zlib_compressor_get_file_info(this)?.reinterpret()
  set(`value`) {
    g_zlib_compressor_set_file_info(this, `value`)
  }
