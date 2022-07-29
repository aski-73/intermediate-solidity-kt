package net.aveyon.intermediate_solidity

abstract class Field(name: String, type: Type) : LocalField(name, type) {
    var visibility: Visibility? = null
    var value: String? = null
}
