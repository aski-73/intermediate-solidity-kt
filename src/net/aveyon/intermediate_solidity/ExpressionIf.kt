package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class ExpressionIf: Expression("if") {
    val conditions: List<net.aveyon.intermediate_solidity.util.Pair<String, List<Expression>>> = LinkedList()
    var elseStatement: String? = null
}
