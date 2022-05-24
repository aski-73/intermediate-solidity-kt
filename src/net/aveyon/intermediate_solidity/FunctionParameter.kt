package net.aveyon.intermediate_solidity

abstract class FunctionParameter(name: String) : Node(name) {
    var type: String? = null
    var dataLocation = DataLocation.MEMORY
    var payable = false

    constructor(copySource: FunctionParameter) : this(copySource.name) {
        type = copySource.type
        dataLocation = copySource.dataLocation
        payable = copySource.payable
    }
}
