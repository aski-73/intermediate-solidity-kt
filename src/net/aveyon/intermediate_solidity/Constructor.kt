package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class Constructor: Node("ctor") {
    val statements: MutableList<Statement> = LinkedList()
    val modifiers: MutableList<Modifier> = LinkedList()
    // Does not need payable since receive() and fallback() functions handle ether transfers.
    var payable: Boolean = false
    // ctors don't have a visibility. Just set it to public.
    var visibility: Visibility = Visibility.PUBLIC
}
