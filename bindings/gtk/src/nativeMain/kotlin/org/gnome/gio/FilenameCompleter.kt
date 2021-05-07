@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFilenameCompleter
import interop.g_filename_completer_get_completion_suffix
import interop.g_filename_completer_get_completions
import interop.g_filename_completer_new
import interop.g_filename_completer_set_dirs_only
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKArray
import org.mrlem.gnome.toKString

public typealias FilenameCompleter = CPointer<GFilenameCompleter>

public val FilenameCompleter.asObject: Object
  get() = reinterpret()

public object FilenameCompleterFactory {
  public fun new(): FilenameCompleter = g_filename_completer_new()!!.reinterpret()
}

public fun FilenameCompleter.getCompletionSuffix(initialText: String?): String? =
    g_filename_completer_get_completion_suffix(this@getCompletionSuffix, initialText).toKString()

public fun FilenameCompleter.getCompletions(initialText: String?): Array<String>? =
    g_filename_completer_get_completions(this@getCompletions, initialText)?.toKArray {
    it.toKString()!! }

public fun FilenameCompleter.setDirsOnly(dirsOnly: Boolean): Unit {
  g_filename_completer_set_dirs_only(this@setDirsOnly, dirsOnly.toInt())
}

public fun FilenameCompleter.onGotCompletionData(callback: (FilenameCompleter) -> Unit):
    FilenameCompleter {
  // TODO - handle callback data

  asObject.connect("got-completion-data") { callback(this) }
  return this
}
