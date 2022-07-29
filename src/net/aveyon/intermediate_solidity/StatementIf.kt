package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class StatementIf: Statement("if") {
    val conditions: MutableList<net.aveyon.intermediate_solidity.util.Pair<Expression, MutableList<Statement>>> = LinkedList()
    var elseStatements: MutableList<Statement> = LinkedList()
}
