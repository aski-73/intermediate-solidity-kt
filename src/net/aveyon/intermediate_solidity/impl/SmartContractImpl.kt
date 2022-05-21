package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Field
import net.aveyon.intermediate_solidity.SmartContract
import net.aveyon.intermediate_solidity.impl.GeneralSolidityConceptsImpl.Companion.initConceptObject

class SmartContractImpl : SmartContract {
    // Copy ctor
    constructor(copySource: SmartContract) : this(copySource.name) {
        definitions = ContractConceptsImpl(copySource.definitions)

        copySource.implements.forEach {
            val i = InterfaceImpl(it)
            implements.add(i)
        }
        copySource.extends.forEach { ext: SmartContract ->
            val smartContractImpl = SmartContractImpl(ext)
            extends.add(smartContractImpl)
        }

        copySource.fields.forEach{ f: Field ->
            val fieldImpl = FieldImpl(f)
            fields.add(fieldImpl)
        }

    }
    constructor(name: String) : super(name, ContractConceptsImpl()) {}
}
