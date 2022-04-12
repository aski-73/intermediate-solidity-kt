package net.aveyon.intermediate_solidity

import java.util.List

import lombok.Getter
import lombok.Setter
import net.aveyon.intermediate_solidity.impl.StructureFieldImpl

@Getter
@Setter
abstract class Structure extends Node {
	String name
	List<StructureField> fields = newLinkedList
	
	// Copy ctor
	new (Structure copySource) {
		name = copySource.name
		copySource.fields.forEach[f |
			fields.add(new StructureFieldImpl(f))
		]
	}
}
