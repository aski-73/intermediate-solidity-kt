package net.aveyon.intermediate_solidity

import java.util.List

import lombok.Getter
import lombok.Setter
import net.aveyon.intermediate_solidity.impl.OperationImpl
import net.aveyon.intermediate_solidity.impl.OperationParameterImpl

@Getter
@Setter
abstract class Operation extends Node {
	String name
	boolean isAbstract = false
	Visibility visibility
	List<String> expressions = newLinkedList
	List<String> returns = newLinkedList
	List<OperationParameter> parameters = newLinkedList
	
	new (Operation copySource) {
		name = copySource.name
		isAbstract = copySource.isAbstract
		visibility = copySource.visibility
		copySource.expressions.forEach[ exp |
			expressions.add(exp)
		]
		copySource.returns.forEach[ ret |
			returns.add(ret)
		]
		copySource.parameters.forEach[p |
			parameters.add(new OperationParameterImpl(p))
		]
	}
}
