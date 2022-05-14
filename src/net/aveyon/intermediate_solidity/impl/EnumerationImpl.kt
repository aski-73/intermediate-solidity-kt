package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Enumeration

class EnumerationImpl(name: String) : Enumeration(name) {
    constructor(copySource: Enumeration) : this(copySource.name) {
        copySource.values.forEach {
            values.add(it)
        }
    }
}
