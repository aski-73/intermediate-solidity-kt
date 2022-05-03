package net.aveyon.intermediate_solidity

abstract class Field : LocalField {
    var visibility: Visibility? = null
    var value: String? = null

    constructor(name: String) : super(name) {}
}
