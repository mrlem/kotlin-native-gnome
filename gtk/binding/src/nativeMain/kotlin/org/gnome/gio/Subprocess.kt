// TODO - constructor: new
// TODO - method: communicate
// TODO - method: communicate_async
// TODO - method: communicate_finish
// TODO - method: communicate_utf8
// TODO - method: communicate_utf8_async
// TODO - method: communicate_utf8_finish
// TODO - method: send_signal
// TODO - method: wait
// TODO - method: wait_async
// TODO - method: wait_check
// TODO - method: wait_check_async
// TODO - method: wait_check_finish
// TODO - method: wait_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSubprocess
import interop.g_subprocess_force_exit
import interop.g_subprocess_get_exit_status
import interop.g_subprocess_get_identifier
import interop.g_subprocess_get_if_exited
import interop.g_subprocess_get_if_signaled
import interop.g_subprocess_get_status
import interop.g_subprocess_get_stderr_pipe
import interop.g_subprocess_get_stdin_pipe
import interop.g_subprocess_get_stdout_pipe
import interop.g_subprocess_get_successful
import interop.g_subprocess_get_term_sig
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias Subprocess = CPointer<GSubprocess>

public val Subprocess.asObject: Object
  get() = reinterpret()

public object SubprocessFactory

public val Subprocess.exitStatus: Int
  get() = g_subprocess_get_exit_status(this)

public val Subprocess.identifier: String
  get() = g_subprocess_get_identifier(this).toKString

public val Subprocess.ifExited: Boolean
  get() = g_subprocess_get_if_exited(this).toBoolean

public val Subprocess.ifSignaled: Boolean
  get() = g_subprocess_get_if_signaled(this).toBoolean

public val Subprocess.status: Int
  get() = g_subprocess_get_status(this)

public val Subprocess.stderrPipe: InputStream?
  get() = g_subprocess_get_stderr_pipe(this)?.reinterpret()

public val Subprocess.stdinPipe: OutputStream?
  get() = g_subprocess_get_stdin_pipe(this)?.reinterpret()

public val Subprocess.stdoutPipe: InputStream?
  get() = g_subprocess_get_stdout_pipe(this)?.reinterpret()

public val Subprocess.successful: Boolean
  get() = g_subprocess_get_successful(this).toBoolean

public val Subprocess.termSig: Int
  get() = g_subprocess_get_term_sig(this)

public fun Subprocess.forceExit(): Unit {
  g_subprocess_force_exit(this)
}
