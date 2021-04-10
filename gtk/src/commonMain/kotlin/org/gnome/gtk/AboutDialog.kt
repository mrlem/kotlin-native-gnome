// TODO - implement:
//   add_credit_section
//   set_artists
//   set_authors
//   set_documenters
//   set_license_type
//   set_logo
package org.gnome.gtk

import gtk3.GtkAboutDialog
import gtk3.gtk_about_dialog_get_artists
import gtk3.gtk_about_dialog_get_authors
import gtk3.gtk_about_dialog_get_comments
import gtk3.gtk_about_dialog_get_copyright
import gtk3.gtk_about_dialog_get_documenters
import gtk3.gtk_about_dialog_get_license
import gtk3.gtk_about_dialog_get_license_type
import gtk3.gtk_about_dialog_get_logo
import gtk3.gtk_about_dialog_get_logo_icon_name
import gtk3.gtk_about_dialog_get_program_name
import gtk3.gtk_about_dialog_get_translator_credits
import gtk3.gtk_about_dialog_get_version
import gtk3.gtk_about_dialog_get_website
import gtk3.gtk_about_dialog_get_website_label
import gtk3.gtk_about_dialog_get_wrap_license
import gtk3.gtk_about_dialog_set_comments
import gtk3.gtk_about_dialog_set_copyright
import gtk3.gtk_about_dialog_set_license
import gtk3.gtk_about_dialog_set_logo_icon_name
import gtk3.gtk_about_dialog_set_program_name
import gtk3.gtk_about_dialog_set_translator_credits
import gtk3.gtk_about_dialog_set_version
import gtk3.gtk_about_dialog_set_website
import gtk3.gtk_about_dialog_set_website_label
import gtk3.gtk_about_dialog_set_wrap_license
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

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

public fun AboutDialog.getArtists(): Unit {
  gtk_about_dialog_get_artists(this)
}

public fun AboutDialog.getAuthors(): Unit {
  gtk_about_dialog_get_authors(this)
}

public fun AboutDialog.getDocumenters(): Unit {
  gtk_about_dialog_get_documenters(this)
}

public fun AboutDialog.getLicenseType(): Unit {
  gtk_about_dialog_get_license_type(this)
}

public fun AboutDialog.getLogo(): Unit {
  gtk_about_dialog_get_logo(this)
}

public var AboutDialog.comments: String?
  get() = gtk_about_dialog_get_comments(this).toKString
  set(`value`) {
    gtk_about_dialog_set_comments(this, value)
  }

public var AboutDialog.copyright: String?
  get() = gtk_about_dialog_get_copyright(this).toKString
  set(`value`) {
    gtk_about_dialog_set_copyright(this, value)
  }

public var AboutDialog.license: String?
  get() = gtk_about_dialog_get_license(this).toKString
  set(`value`) {
    gtk_about_dialog_set_license(this, value)
  }

public var AboutDialog.logoIconName: String?
  get() = gtk_about_dialog_get_logo_icon_name(this).toKString
  set(`value`) {
    gtk_about_dialog_set_logo_icon_name(this, value)
  }

public var AboutDialog.programName: String?
  get() = gtk_about_dialog_get_program_name(this).toKString
  set(`value`) {
    gtk_about_dialog_set_program_name(this, value)
  }

public var AboutDialog.translatorCredits: String?
  get() = gtk_about_dialog_get_translator_credits(this).toKString
  set(`value`) {
    gtk_about_dialog_set_translator_credits(this, value)
  }

public var AboutDialog.version: String?
  get() = gtk_about_dialog_get_version(this).toKString
  set(`value`) {
    gtk_about_dialog_set_version(this, value)
  }

public var AboutDialog.website: String?
  get() = gtk_about_dialog_get_website(this).toKString
  set(`value`) {
    gtk_about_dialog_set_website(this, value)
  }

public var AboutDialog.websiteLabel: String?
  get() = gtk_about_dialog_get_website_label(this).toKString
  set(`value`) {
    gtk_about_dialog_set_website_label(this, value)
  }

public var AboutDialog.wrapLicense: Boolean
  get() = gtk_about_dialog_get_wrap_license(this).toBoolean
  set(`value`) {
    gtk_about_dialog_set_wrap_license(this, value.toInt)
  }
