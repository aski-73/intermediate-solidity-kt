package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class Modifier(name: String) : Node(name) {
    var isVirtual = false
    var doesOverride = false
    val statements: MutableList<Statement> = LinkedList()
    val parameters: MutableList<FunctionParameter> = LinkedList()
}
