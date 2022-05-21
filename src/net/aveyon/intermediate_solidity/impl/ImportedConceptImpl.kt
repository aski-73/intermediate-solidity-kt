package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.ImportedConcept
import net.aveyon.intermediate_solidity.SolidityConcepts

class ImportedConceptImpl(path: String, concepts: SolidityConcepts): ImportedConcept(path, concepts) {
    /**
     * Copy ctor
     */
    constructor(copySource: ImportedConcept) : this(copySource.path, SolidityConceptsImpl(copySource.concepts))
}
