// TODO - add_credit_section
// TODO - get_artists
// TODO - get_authors
// TODO - get_documenters
// TODO - get_license_type
// TODO - get_logo
// TODO - set_artists
// TODO - set_authors
// TODO - set_documenters
// TODO - set_license_type
// TODO - set_logo
//
package org.gnome.gtk

import gtk3.GtkAboutDialog
import gtk3.gtk_about_dialog_get_comments
import gtk3.gtk_about_dialog_get_copyright
import gtk3.gtk_about_dialog_get_license
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
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias AboutDialog = CPointer<GtkAboutDialog>

public val AboutDialog.asObject: Object
  get() = reinterpret()

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

public fun AboutDialog.getComments(): String = gtk_about_dialog_get_comments(this).toKString

public fun AboutDialog.getCopyright(): String = gtk_about_dialog_get_copyright(this).toKString

public fun AboutDialog.getLicense(): String = gtk_about_dialog_get_license(this).toKString

public fun AboutDialog.getLogoIconName(): String =
    gtk_about_dialog_get_logo_icon_name(this).toKString

public fun AboutDialog.getProgramName(): String = gtk_about_dialog_get_program_name(this).toKString

public fun AboutDialog.getTranslatorCredits(): String =
    gtk_about_dialog_get_translator_credits(this).toKString

public fun AboutDialog.getVersion(): String = gtk_about_dialog_get_version(this).toKString

public fun AboutDialog.getWebsite(): String = gtk_about_dialog_get_website(this).toKString

public fun AboutDialog.getWebsiteLabel(): String =
    gtk_about_dialog_get_website_label(this).toKString

public fun AboutDialog.getWrapLicense(): Boolean = gtk_about_dialog_get_wrap_license(this).toBoolean

public fun AboutDialog.setComments(comments: String?): Unit {
  gtk_about_dialog_set_comments(this, comments)
}

public fun AboutDialog.setCopyright(copyright: String?): Unit {
  gtk_about_dialog_set_copyright(this, copyright)
}

public fun AboutDialog.setLicense(license: String?): Unit {
  gtk_about_dialog_set_license(this, license)
}

public fun AboutDialog.setLogoIconName(iconName: String?): Unit {
  gtk_about_dialog_set_logo_icon_name(this, iconName)
}

public fun AboutDialog.setProgramName(name: String?): Unit {
  gtk_about_dialog_set_program_name(this, name)
}

public fun AboutDialog.setTranslatorCredits(translatorCredits: String?): Unit {
  gtk_about_dialog_set_translator_credits(this, translatorCredits)
}

public fun AboutDialog.setVersion(version: String?): Unit {
  gtk_about_dialog_set_version(this, version)
}

public fun AboutDialog.setWebsite(website: String?): Unit {
  gtk_about_dialog_set_website(this, website)
}

public fun AboutDialog.setWebsiteLabel(websiteLabel: String?): Unit {
  gtk_about_dialog_set_website_label(this, websiteLabel)
}

public fun AboutDialog.setWrapLicense(wrapLicense: Boolean): Unit {
  gtk_about_dialog_set_wrap_license(this, wrapLicense.toInt)
}
