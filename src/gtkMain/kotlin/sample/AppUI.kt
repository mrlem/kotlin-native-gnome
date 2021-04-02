package sample

import org.mrlem.gtk.*

/**
 * Wrapper providing easy access to all used [Widget] instances.
 */
class AppUI(filename: String) {
    private val builder = Builder(filename)

    val window by lazy { builder["main"].asWindow }
    val entry by lazy { builder["entry"].asEntry }
    val button by lazy { builder["button"].asButton }
}
