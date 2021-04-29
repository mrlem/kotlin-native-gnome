package org.gnome.gir.resolver

import org.gnome.gir.model.RepositoryDefinition
import org.gnome.gir.parser.RepositoryReader
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class ResolverTest {

    @Test
    fun `button ancestors from full repository resolved`() {
        val resolver = Resolver(fullRepository)
        assertEquals(buttonAncestors, resolver.ancestors("Gtk.Button"))
    }

    @Test
    fun `button ancestors from gtk-only repository resolved`() {
        val resolver = Resolver(gtkOnlyRepository)
        assertEquals(buttonAncestors, resolver.ancestors("Gtk.Button"))
    }

    @Test
    fun `button accessible ancestors from full repository resolved`() {
        val resolver = Resolver(fullRepository)
        assertEquals(buttonAccessibleAncestors, resolver.ancestors("Gtk.ButtonAccessible"))
    }

    @Test
    fun `button accessible ancestors from gtk-only repository resolved`() {
        val resolver = Resolver(gtkOnlyRepository)
        assertEquals(buttonAccessibleAncestors, resolver.ancestors("Gtk.ButtonAccessible"))
    }

    @Test
    fun `accel group ancestors from full repository resolved`() {
        val resolver = Resolver(fullRepository)
        assertEquals(accelGroupAncestors, resolver.ancestors("Gtk.AccelGroup"))
    }

    @Test
    fun `accel group ancestors from gtk-only repository resolved`() {
        val resolver = Resolver(gtkOnlyRepository)
        assertEquals(accelGroupAncestors, resolver.ancestors("Gtk.AccelGroup"))
    }

    companion object {
        private val buttonAncestors = listOf(
            "Gtk.Bin",
            "Gtk.Container",
            "Gtk.Widget",
            "GObject.InitiallyUnowned",
            "GObject.Object"
        )

        private val buttonAccessibleAncestors = listOf(
            "Gtk.ContainerAccessible",
            "Gtk.WidgetAccessible",
            "Gtk.Accessible",
            "Atk.Object",
            "GObject.Object"
        )

        private val accelGroupAncestors = listOf(
            "GObject.Object"
        )

        private lateinit var gtkOnlyRepository: RepositoryDefinition
        private lateinit var fullRepository: RepositoryDefinition

        @BeforeAll
        @JvmStatic
        @Suppress("Unused")
        internal fun init() {
            RepositoryReader().apply {
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
                .also { fullRepository = it.repository!! }

            RepositoryReader().apply {
                // GTK
                read("/gtk3.gir")
            }
                .also { gtkOnlyRepository = it.repository!! }
        }
    }

}
