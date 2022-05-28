package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.ExpressionString

class ExpressionStringImpl(value: String): ExpressionString(value) {

    /**
     * Copy Ctor
     */
    constructor(copySource: ExpressionString): this(copySource.value)
}
