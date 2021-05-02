// TODO - method: set_environ
// TODO - method: spawnv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSubprocessLauncher
import interop.g_subprocess_launcher_getenv
import interop.g_subprocess_launcher_new
import interop.g_subprocess_launcher_set_cwd
import interop.g_subprocess_launcher_set_flags
import interop.g_subprocess_launcher_set_stderr_file_path
import interop.g_subprocess_launcher_set_stdin_file_path
import interop.g_subprocess_launcher_set_stdout_file_path
import interop.g_subprocess_launcher_setenv
import interop.g_subprocess_launcher_take_fd
import interop.g_subprocess_launcher_take_stderr_fd
import interop.g_subprocess_launcher_take_stdin_fd
import interop.g_subprocess_launcher_take_stdout_fd
import interop.g_subprocess_launcher_unsetenv
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toInt
import org.gnome.toKString

public typealias SubprocessLauncher = CPointer<GSubprocessLauncher>

public val SubprocessLauncher.asObject: Object
  get() = reinterpret()

public object SubprocessLauncherFactory {
  public fun new(flags: SubprocessFlags): SubprocessLauncher =
      g_subprocess_launcher_new(flags)!!.reinterpret()
}

public fun SubprocessLauncher.getenv(variable: String): String = g_subprocess_launcher_getenv(this,
    variable).toKString()

public fun SubprocessLauncher.setCwd(cwd: String): Unit {
  g_subprocess_launcher_set_cwd(this, cwd)
}

public fun SubprocessLauncher.setFlags(flags: SubprocessFlags): Unit {
  g_subprocess_launcher_set_flags(this, flags)
}

public fun SubprocessLauncher.setStderrFilePath(path: String): Unit {
  g_subprocess_launcher_set_stderr_file_path(this, path)
}

public fun SubprocessLauncher.setStdinFilePath(path: String): Unit {
  g_subprocess_launcher_set_stdin_file_path(this, path)
}

public fun SubprocessLauncher.setStdoutFilePath(path: String): Unit {
  g_subprocess_launcher_set_stdout_file_path(this, path)
}

public fun SubprocessLauncher.setenv(
  variable: String,
  `value`: String,
  overwrite: Boolean
): Unit {
  g_subprocess_launcher_setenv(this, variable, `value`, overwrite.toInt())
}

public fun SubprocessLauncher.takeFd(sourceFd: Int, targetFd: Int): Unit {
  g_subprocess_launcher_take_fd(this, sourceFd, targetFd)
}

public fun SubprocessLauncher.takeStderrFd(fd: Int): Unit {
  g_subprocess_launcher_take_stderr_fd(this, fd)
}

public fun SubprocessLauncher.takeStdinFd(fd: Int): Unit {
  g_subprocess_launcher_take_stdin_fd(this, fd)
}

public fun SubprocessLauncher.takeStdoutFd(fd: Int): Unit {
  g_subprocess_launcher_take_stdout_fd(this, fd)
}

public fun SubprocessLauncher.unsetenv(variable: String): Unit {
  g_subprocess_launcher_unsetenv(this, variable)
}
