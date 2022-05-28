package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class ExpressionIf: Expression("if") {
    val conditions: MutableList<net.aveyon.intermediate_solidity.util.Pair<String, MutableList<Expression>>> = LinkedList()
    var elseStatement: String? = null
}
