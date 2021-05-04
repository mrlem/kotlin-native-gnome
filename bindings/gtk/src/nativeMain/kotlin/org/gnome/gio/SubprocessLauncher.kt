@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GSubprocessLauncher
import interop.g_subprocess_launcher_getenv
import interop.g_subprocess_launcher_new
import interop.g_subprocess_launcher_set_cwd
import interop.g_subprocess_launcher_set_environ
import interop.g_subprocess_launcher_set_flags
import interop.g_subprocess_launcher_set_stderr_file_path
import interop.g_subprocess_launcher_set_stdin_file_path
import interop.g_subprocess_launcher_set_stdout_file_path
import interop.g_subprocess_launcher_setenv
import interop.g_subprocess_launcher_spawnv
import interop.g_subprocess_launcher_take_fd
import interop.g_subprocess_launcher_take_stderr_fd
import interop.g_subprocess_launcher_take_stdin_fd
import interop.g_subprocess_launcher_take_stdout_fd
import interop.g_subprocess_launcher_unsetenv
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toCArray
import org.gnome.toInt
import org.gnome.toKString

public typealias SubprocessLauncher = CPointer<GSubprocessLauncher>

public val SubprocessLauncher.asObject: Object
  get() = reinterpret()

public object SubprocessLauncherFactory {
  public fun new(flags: SubprocessFlags): SubprocessLauncher =
      g_subprocess_launcher_new(flags)!!.reinterpret()
}

public fun SubprocessLauncher.getenv(variable: String?): String? =
    g_subprocess_launcher_getenv(this@getenv, variable).toKString()

public fun SubprocessLauncher.setCwd(cwd: String?): Unit {
  g_subprocess_launcher_set_cwd(this@setCwd, cwd)
}

public fun SubprocessLauncher.setEnviron(env: Array<String>?): Unit {
  memScoped { g_subprocess_launcher_set_environ(this@setEnviron, env?.toCArray(memScope)) }
}

public fun SubprocessLauncher.setFlags(flags: SubprocessFlags): Unit {
  g_subprocess_launcher_set_flags(this@setFlags, flags)
}

public fun SubprocessLauncher.setStderrFilePath(path: String?): Unit {
  g_subprocess_launcher_set_stderr_file_path(this@setStderrFilePath, path)
}

public fun SubprocessLauncher.setStdinFilePath(path: String?): Unit {
  g_subprocess_launcher_set_stdin_file_path(this@setStdinFilePath, path)
}

public fun SubprocessLauncher.setStdoutFilePath(path: String?): Unit {
  g_subprocess_launcher_set_stdout_file_path(this@setStdoutFilePath, path)
}

public fun SubprocessLauncher.setenv(
  variable: String?,
  `value`: String?,
  overwrite: Boolean
): Unit {
  g_subprocess_launcher_setenv(this@setenv, variable, `value`, overwrite.toInt())
}

@Throws(Error::class)
public fun SubprocessLauncher.spawnv(argv: Array<String>?): Subprocess? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Subprocess? = memScoped { g_subprocess_launcher_spawnv(this@spawnv,
      argv?.toCArray(memScope), errors)?.reinterpret() }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun SubprocessLauncher.takeFd(sourceFd: Int, targetFd: Int): Unit {
  g_subprocess_launcher_take_fd(this@takeFd, sourceFd, targetFd)
}

public fun SubprocessLauncher.takeStderrFd(fd: Int): Unit {
  g_subprocess_launcher_take_stderr_fd(this@takeStderrFd, fd)
}

public fun SubprocessLauncher.takeStdinFd(fd: Int): Unit {
  g_subprocess_launcher_take_stdin_fd(this@takeStdinFd, fd)
}

public fun SubprocessLauncher.takeStdoutFd(fd: Int): Unit {
  g_subprocess_launcher_take_stdout_fd(this@takeStdoutFd, fd)
}

public fun SubprocessLauncher.unsetenv(variable: String?): Unit {
  g_subprocess_launcher_unsetenv(this@unsetenv, variable)
}
