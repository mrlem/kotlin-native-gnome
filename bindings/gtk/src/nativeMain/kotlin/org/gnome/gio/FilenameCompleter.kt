// TODO - method: get_completions
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFilenameCompleter
import interop.g_filename_completer_get_completion_suffix
import interop.g_filename_completer_new
import interop.g_filename_completer_set_dirs_only
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias FilenameCompleter = CPointer<GFilenameCompleter>

public val FilenameCompleter.asObject: Object
  get() = reinterpret()

public object FilenameCompleterFactory {
  public fun new(): FilenameCompleter = g_filename_completer_new()!!.reinterpret()
}

public fun FilenameCompleter.getCompletionSuffix(initialText: String): String =
    g_filename_completer_get_completion_suffix(this, initialText).toKString()

public fun FilenameCompleter.setDirsOnly(dirsOnly: Boolean): Unit {
  g_filename_completer_set_dirs_only(this, dirsOnly.toInt())
}

public fun FilenameCompleter.onGotCompletionData(callback: (FilenameCompleter) -> Unit):
    FilenameCompleter {
  // TODO - handle callback data

  asObject.connect("got-completion-data") { callback(this) }
  return this
}
