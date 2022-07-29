package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Type

class TypeImpl(name: String): Type(name) {
    /**
     * Copy ctor
     */
    constructor(copySource: Type): this(copySource.name)
}
