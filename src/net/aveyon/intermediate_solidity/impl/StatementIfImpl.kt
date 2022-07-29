package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Statement
import net.aveyon.intermediate_solidity.StatementIf
import net.aveyon.intermediate_solidity.StatementExpression
import java.util.LinkedList

class StatementIfImpl(): StatementIf() {

    /**
     * Copy Ctor
     */
    constructor(copySource: StatementIf): this() {
        copySource.conditions.forEach {
            val statements: MutableList<Statement> = LinkedList()
            it.second.forEach { exp ->
                when (exp) {
                    is StatementExpression -> {
                        statements.add(StatementExpressionImpl(exp))
                    }
                    is StatementIf -> { // Expression If
                        statements.add(StatementIfImpl(exp))
                    }
                    else -> {
                        // err
                    }
                }
            }

            conditions.add(net.aveyon.intermediate_solidity.util.Pair(it.first, statements))
        }
    }
}
