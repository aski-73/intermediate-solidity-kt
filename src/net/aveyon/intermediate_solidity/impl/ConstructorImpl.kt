package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Constructor

class ConstructorImpl(): Constructor() {
    /**
     * Copy ctor
     */
    constructor(copySource: Constructor): this() {
        payable = copySource.payable
        visibility = copySource.visibility

        copySource.expressions.forEach {
            // TODO replace with copy ctor
            expressions.add(it)
        }

        copySource.modifiers.forEach { modifier ->
            modifiers.add(ModifierImpl(modifier))
        }
    }
}
