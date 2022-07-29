package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Expression

class ExpressionImpl(value: String): Expression(value) {

    /**
     * Copy Ctor
     */
    constructor(copySource: Expression): this(copySource.value)
}
