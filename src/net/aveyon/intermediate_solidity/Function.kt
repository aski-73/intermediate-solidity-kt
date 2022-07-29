package net.aveyon.intermediate_solidity

import java.util.*

abstract class Function(name: String) : Node(name) {
    var isAbstract = false
    var visibility: Visibility? = null
    val statements: MutableList<Statement> = LinkedList()
    val returns: MutableList<FunctionParameter> = LinkedList()
    val parameters: MutableList<FunctionParameter> = LinkedList()
    var isVirtual = false
    var isPure = false
    var isView = false
    var doesOverride = false
    var payable = false
}
