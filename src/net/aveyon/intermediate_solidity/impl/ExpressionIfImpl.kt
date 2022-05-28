package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Expression
import net.aveyon.intermediate_solidity.ExpressionIf
import net.aveyon.intermediate_solidity.ExpressionString
import java.util.LinkedList

class ExpressionIfImpl(): ExpressionIf() {

    /**
     * Copy Ctor
     */
    constructor(copySource: ExpressionIf): this() {
        copySource.conditions.forEach {
            val expressions: MutableList<Expression> = LinkedList()
            it.second.forEach { exp ->
                when (exp) {
                    is ExpressionString -> {
                        expressions.add(ExpressionStringImpl(exp))
                    }
                    is ExpressionIf -> { // Expression If
                        expressions.add(ExpressionIfImpl(exp))
                    }
                    else -> {
                        // err
                    }
                }
            }

            conditions.add(net.aveyon.intermediate_solidity.util.Pair(it.first, expressions))
        }
    }
}
