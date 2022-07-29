package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Modifier

class ModifierImpl(name: String): Modifier(name) {
    /**
     * Copy ctor
     */
    constructor(copySource: Modifier): this(copySource.name) {
        isVirtual = copySource.isVirtual
        doesOverride = copySource.doesOverride

        copySource.statements.forEach {
            // TODO replace with copy ctor
            statements.add(it)
        }

        copySource.parameters.forEach {
            parameters.add(FunctionParameterImpl(it))
        }
    }
}
