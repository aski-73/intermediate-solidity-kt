package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.GeneralSolidityConcepts

class GeneralSolidityConceptsImpl(): GeneralSolidityConcepts() {
    companion object {
        fun initConceptObject(target: GeneralSolidityConcepts, copySource: GeneralSolidityConcepts) {
            copySource.functions.forEach {
                target.functions.add(FunctionImpl(it))
            }

            copySource.errors.forEach {
                target.errors.add(ErrorImpl(it))
            }

            copySource.events.forEach {
                target.events.add(EventImpl(it))
            }

            copySource.structures.forEach {
                target.structures.add(StructureImpl(it))
            }

            copySource.enums.forEach {
                target.enums.add(EnumerationImpl(it))
            }
        }
    }
    /**
     * Copy ctor
     */
    constructor(copySource: GeneralSolidityConcepts) : this() {
       initConceptObject(this, copySource)
    }
}
