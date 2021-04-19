package org.gnome.gir.model

import org.gnome.gir.model.meta.CallableElements
import org.gnome.gir.model.types.DefinedType

/**
 * GIR callable.
 *
 * Generic callable.
 *
 * @property callable callable.
 */
data class CallableDefinition(
    val callable: CallableElements
) : DefinedType {

    override val name: String
        get() = callable.name

}
