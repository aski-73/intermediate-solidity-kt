package net.aveyon.intermediate_solidity

import java.util.*

abstract class Function(name: String) : Node(name) {
    var isAbstract = false
    var visibility: Visibility? = null
    val expressions: MutableList<String> = LinkedList()
    val returns: MutableList<String> = LinkedList()
    val parameters: MutableList<FunctionParameter> = LinkedList()
    val isVirtual = false
    val doesOverride = false
}
