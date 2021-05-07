// TODO - method: get_arguments (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GApplicationCommandLine
import interop.g_application_command_line_create_file_for_arg
import interop.g_application_command_line_get_cwd
import interop.g_application_command_line_get_environ
import interop.g_application_command_line_get_exit_status
import interop.g_application_command_line_get_is_remote
import interop.g_application_command_line_get_options_dict
import interop.g_application_command_line_get_platform_data
import interop.g_application_command_line_get_stdin
import interop.g_application_command_line_getenv
import interop.g_application_command_line_set_exit_status
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Variant
import org.gnome.glib.VariantDict
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKArray
import org.gnome.toKString

public typealias ApplicationCommandLine = CPointer<GApplicationCommandLine>

public val ApplicationCommandLine.asObject: Object
  get() = reinterpret()

public val ApplicationCommandLine.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val ApplicationCommandLine.cwd: String?
  get() = g_application_command_line_get_cwd(this).toKString()

public val ApplicationCommandLine.environ: Array<String>?
  get() = g_application_command_line_get_environ(this)?.toKArray { it.toKString()!! }

public var ApplicationCommandLine.exitStatus: Int
  get() = g_application_command_line_get_exit_status(this)
  set(`value`) {
    g_application_command_line_set_exit_status(this@exitStatus, `value`)
  }

public val ApplicationCommandLine.isRemote: Boolean
  get() = g_application_command_line_get_is_remote(this).toBoolean()

public val ApplicationCommandLine.optionsDict: VariantDict?
  get() = g_application_command_line_get_options_dict(this)?.reinterpret()

public val ApplicationCommandLine.platformData: Variant?
  get() = g_application_command_line_get_platform_data(this)?.reinterpret()

public val ApplicationCommandLine.stdin: InputStream?
  get() = g_application_command_line_get_stdin(this)?.reinterpret()

public fun ApplicationCommandLine.createFileForArg(arg: String?): File? =
    g_application_command_line_create_file_for_arg(this@createFileForArg, arg)?.reinterpret()

public fun ApplicationCommandLine.getenv(name: String?): String? =
    g_application_command_line_getenv(this@getenv, name).toKString()
