package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Expression
import net.aveyon.intermediate_solidity.StatementExpression

class StatementExpressionImpl(expr: Expression) : StatementExpression(expr) {

    /**
     * Copy ctor
     */
    constructor(copySource: StatementExpression) : this(ExpressionImpl(copySource.expr))
}
