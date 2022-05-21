package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.ContractConcepts

class ContractConceptsImpl(): ContractConcepts() {

    /**
     * Copy ctor
     */
    constructor(copySource: ContractConcepts) : this() {
        GeneralSolidityConceptsImpl.initConceptObject(this, copySource)

        copySource.modifiers.forEach {
            modifiers.add(ModifierImpl(it.name))
        }
    }
}
