package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class SmartContractModel(
    val definitions: SolidityConcepts,
    val pragma: String,
    val license: String
) : Node("") {
    val imports: MutableList<ImportedConcept> = LinkedList()
}
