package net.aveyon.intermediate_solidity

/**
 * A Solidity import can import multiple concepts. Therefore we provide [SolidityConcepts] in the ctor (plural)
 */
abstract class ImportedConcept(val path: String, val concepts: SolidityConcepts)
