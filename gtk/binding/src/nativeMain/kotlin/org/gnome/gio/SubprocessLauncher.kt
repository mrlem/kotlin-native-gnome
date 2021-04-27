// TODO - constructor: new
// TODO - method: getenv
// TODO - method: set_cwd
// TODO - method: set_environ
// TODO - method: set_flags
// TODO - method: set_stderr_file_path
// TODO - method: set_stdin_file_path
// TODO - method: set_stdout_file_path
// TODO - method: setenv
// TODO - method: spawnv
// TODO - method: take_fd
// TODO - method: take_stderr_fd
// TODO - method: take_stdin_fd
// TODO - method: take_stdout_fd
// TODO - method: unsetenv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSubprocessLauncher
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SubprocessLauncher = CPointer<GSubprocessLauncher>

public val SubprocessLauncher.asObject: Object
  get() = reinterpret()

public object SubprocessLauncherFactory
