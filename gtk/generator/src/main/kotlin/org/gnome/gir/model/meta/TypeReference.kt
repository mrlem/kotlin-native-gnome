package org.gnome.gir.model.meta

import org.gnome.gir.model.enums.KnownType

// TODO - no vararg handling yet

sealed class TypeReference : CallbackOrType {

    data class Unresolved(val name: String) : TypeReference() {
        override fun toString() = "${javaClass.simpleName}(name=$name)"
    }

    data class Known(val type: KnownType, val isArray: Boolean) : TypeReference() {
        override fun toString() = "${javaClass.simpleName}(type=$type, isArray=$isArray)"
    }

    data class Custom(val definition: CustomType, val isArray: Boolean) : TypeReference() {
        override fun toString() = "${javaClass.simpleName}(definition=${definition.name}, isArray=$isArray)"
    }

}
