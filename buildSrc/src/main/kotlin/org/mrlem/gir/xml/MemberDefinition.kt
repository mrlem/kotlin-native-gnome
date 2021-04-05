package org.mrlem.gir.xml

sealed class MemberDefinition {

    /**
     * Name identifying the member.
     */
    abstract val name: String

    data class Property(
        override val name: String,
        var readOnly: Boolean,
        val type: Class<*>
    ) : MemberDefinition()

    // TODO - args
    data class MethodDefinition(
        override val name: String
    ) : MemberDefinition()

    // TODO - args
    data class EventHandler(
        override val name: String
    ) : MemberDefinition()

    /**
     * A member that will generate a comment for functions not covered by the binding yet.
     */
    data class Todo(
        override val name: String
    ) : MemberDefinition()

}
