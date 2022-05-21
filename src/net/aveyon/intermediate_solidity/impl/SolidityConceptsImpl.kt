package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.SolidityConcepts

class SolidityConceptsImpl() : SolidityConcepts() {
    /**
     * Copy ctor
     */
    constructor(copySource: SolidityConcepts) : this() {
        GeneralSolidityConceptsImpl.initConceptObject(this, copySource)

        copySource.contracts.forEach {
            contracts.add(SmartContractImpl(it))
        }

        copySource.interfaces.forEach {
            interfaces.add(InterfaceImpl(it))
        }
    }
}
