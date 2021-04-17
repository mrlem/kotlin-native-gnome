package org.gnome.gir.model

import org.gnome.gir.model.meta.CallableElements
import org.gnome.gir.model.meta.CustomType

/**
 * GIR callable.
 *
 * Generic callable.
 *
 * @property callable callable.
 */
data class CallableDefinition(
    val callable: CallableElements
) : CustomType {

    override val name: String
        get() = callable.name

}
