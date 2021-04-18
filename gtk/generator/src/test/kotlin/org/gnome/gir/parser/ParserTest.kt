package org.gnome.gir.parser

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class ParserTest {

    @Test
    fun `parsing succeeds`() {
        assertNotNull(reader.repository)
    }

    @Test
    fun `namespaces get created`() {
        assertEquals(9, reader.repository!!.namespaces.size)
    }

    @Test
    fun `classes in gtk3 get created`() {
        val namespace = reader.repository!!.namespaces.firstOrNull { it.name == "Gtk" }
        assertEquals(269, namespace?.classes?.size)
    }

    companion object {
        private lateinit var reader: RepositoryReader

        @BeforeAll
        @JvmStatic
        @Suppress("Unused")
        internal fun init() {
            reader = RepositoryReader().apply {
                // dependencies
                read("/atk.gir")
                read("/cairo.gir")
                read("/gdk.gir")
                read("/gdkpixbuf.gir")
                read("/gio.gir")
                read("/glib.gir")
                read("/gobject.gir")
                read("/pango.gir")

                // GTK
                read("/gtk3.gir")
            }
        }
    }
}
