// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GZlibCompressor
import interop.g_zlib_compressor_get_file_info
import interop.g_zlib_compressor_set_file_info
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ZlibCompressor = CPointer<GZlibCompressor>

public val ZlibCompressor.asObject: Object
  get() = reinterpret()

public object ZlibCompressorFactory

public var ZlibCompressor.fileInfo: FileInfo?
  get() = g_zlib_compressor_get_file_info(this)?.reinterpret()
  set(`value`) {
    g_zlib_compressor_set_file_info(this, value)
  }
