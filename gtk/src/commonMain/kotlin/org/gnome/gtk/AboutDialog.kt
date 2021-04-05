// TODO - implement:
//   add_credit_section
//   get_artists
//   get_authors
//   get_comments
//   get_copyright
//   get_documenters
//   get_license
//   get_license_type
//   get_logo
//   get_logo_icon_name
//   get_program_name
//   get_translator_credits
//   get_version
//   get_website
//   get_website_label
//   get_wrap_license
//   set_artists
//   set_authors
//   set_comments
//   set_copyright
//   set_documenters
//   set_license
//   set_license_type
//   set_logo
//   set_logo_icon_name
//   set_program_name
//   set_translator_credits
//   set_version
//   set_website
//   set_website_label
//   set_wrap_license
package org.gnome.gtk

import gtk3.GtkAboutDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias AboutDialog = CPointer<GtkAboutDialog>

public val AboutDialog.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AboutDialog.asWidget: Widget
  get() = reinterpret()

public val AboutDialog.asContainer: Container
  get() = reinterpret()

public val AboutDialog.asBin: Bin
  get() = reinterpret()

public val AboutDialog.asWindow: Window
  get() = reinterpret()

public val AboutDialog.asDialog: Dialog
  get() = reinterpret()
