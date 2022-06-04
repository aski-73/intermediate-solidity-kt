package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class Constructor: Node("ctor") {
    val expressions: MutableList<Expression> = LinkedList()
    val modifiers: MutableList<Modifier> = LinkedList()
    var payable: Boolean = true
    var visibility: Visibility = Visibility.PUBLIC
}
