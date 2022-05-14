package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.GeneralSolidityConcepts

class GeneralSolidityConceptsImpl(): GeneralSolidityConcepts() {
    /**
     * Copy ctor
     */
    constructor(copySource: GeneralSolidityConcepts) : this() {
        copySource.functions.forEach {
            functions.add(FunctionImpl(it))
        }

        copySource.errors.forEach {
            errors.add(ErrorImpl(it))
        }

        copySource.events.forEach {
            events.add(EventImpl(it))
        }

        copySource.structures.forEach {
            structures.add(StructureImpl(it))
        }

        copySource.enums.forEach {
            enums.add(EnumerationImpl(it))
        }
    }
}
