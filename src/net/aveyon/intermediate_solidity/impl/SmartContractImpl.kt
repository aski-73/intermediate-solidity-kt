package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Field
import net.aveyon.intermediate_solidity.Function
import net.aveyon.intermediate_solidity.SmartContract
import net.aveyon.intermediate_solidity.Structure

class SmartContractImpl : SmartContract {
    // Copy ctor
    constructor(copySource: SmartContract) : this(copySource.name) {
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

        copySource.definitions.functions.forEach{ op: Function ->
            val operationImpl = FunctionImpl(op)
            definitions.functions.add(operationImpl)
        }

        copySource.definitions.structures.forEach { struct: Structure ->
            val structureImpl = StructureImpl(struct)
            definitions.structures.add(structureImpl)
        }
    }
    constructor(name: String) : super(name, GeneralSolidityConceptsImpl()) {}
}
