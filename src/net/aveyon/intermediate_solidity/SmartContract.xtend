package net.aveyon.intermediate_solidity

import java.util.List
import lombok.Getter
import lombok.Setter
import net.aveyon.intermediate_solidity.impl.SmartContractImpl
import net.aveyon.intermediate_solidity.impl.FieldImpl
import net.aveyon.intermediate_solidity.impl.OperationImpl
import net.aveyon.intermediate_solidity.impl.StructureImpl

@Getter
@Setter
abstract class SmartContract extends Node {
	String name
	boolean isInterface
	boolean isAbstract = false
	List<SmartContract> extending = newLinkedList
	List<Field> fields = newLinkedList
	List<Operation> operations = newLinkedList
	List<Structure> structures = newLinkedList

	new(SmartContract copySource) {
		name = copySource.name
		isInterface = copySource.isInterface
		copySource.extending.forEach [ ext |
			extending.add(new SmartContractImpl(ext))
		]
		copySource.fields.forEach [ f |
			fields.add(new FieldImpl(f))
		]
		copySource.operations.forEach [ op |
			operations.add(new OperationImpl(op))
		]
		copySource.structures.forEach [ struct |
			structures.add(new StructureImpl(struct))
		]
	}
}
