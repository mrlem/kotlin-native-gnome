// TODO - method: create_file_for_arg
// TODO - method: get_arguments
// TODO - method: get_environ
// TODO - method: get_options_dict
// TODO - method: get_platform_data
// TODO - method: getenv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GApplicationCommandLine
import interop.g_application_command_line_get_cwd
import interop.g_application_command_line_get_exit_status
import interop.g_application_command_line_get_is_remote
import interop.g_application_command_line_get_stdin
import interop.g_application_command_line_set_exit_status
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias ApplicationCommandLine = CPointer<GApplicationCommandLine>

public val ApplicationCommandLine.asObject: Object
  get() = reinterpret()

public val ApplicationCommandLine.cwd: String
  get() = g_application_command_line_get_cwd(this).toKString

public var ApplicationCommandLine.exitStatus: Int
  get() = g_application_command_line_get_exit_status(this)
  set(`value`) {
    g_application_command_line_set_exit_status(this, value)
  }

public val ApplicationCommandLine.isRemote: Boolean
  get() = g_application_command_line_get_is_remote(this).toBoolean

public val ApplicationCommandLine.stdin: InputStream?
  get() = g_application_command_line_get_stdin(this)?.reinterpret()
