// TODO - method: get_completion_suffix
// TODO - method: get_completions
// TODO - method: set_dirs_only
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFilenameCompleter
import interop.g_filename_completer_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias FilenameCompleter = CPointer<GFilenameCompleter>

public val FilenameCompleter.asObject: Object
  get() = reinterpret()

public object FilenameCompleterFactory {
  public fun new(): FilenameCompleter = g_filename_completer_new()!!.reinterpret()
}

public fun FilenameCompleter.onGotCompletionData(callback: (FilenameCompleter) -> Unit):
    FilenameCompleter {
  // TODO - handle callback data

  asObject.connect("got-completion-data") { callback(this) }
  return this
}
