@file:Suppress("unused")

package org.mrlem.gnome.gtk

import kotlin.String
import org.gnome.gobject.Object
import org.gnome.gtk.Builder
import org.gnome.gtk.addFromString
import org.gnome.gtk.getObject

@Throws(Error::class)
fun Builder.addFromString(text: String): UInt = addFromString(text, text.length.toULong())

// TODO - maybe try to generalize to getXxx() methods?
operator fun Builder.get(id: String): Object = getObject(id)!!
