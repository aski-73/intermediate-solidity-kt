package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Constructor

class ConstructorImpl(): Constructor() {
    /**
     * Copy ctor
     */
    constructor(copySource: Constructor): this() {
        payable = copySource.payable
        visibility = copySource.visibility

        copySource.statements.forEach {
            // TODO replace with copy ctor
            statements.add(it)
        }

        copySource.modifiers.forEach { modifier ->
            modifiers.add(ModifierImpl(modifier))
        }
    }
}
